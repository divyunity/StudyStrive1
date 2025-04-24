package com.StudyStrive.SS.ui.testing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.StudyStrive.SS.R
import com.StudyStrive.SS.data.model.Survey
import com.StudyStrive.SS.ui.adapters.SurveyAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TestingFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var emptyView: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_testing, container, false)
        
        recyclerView = view.findViewById(R.id.recycler_view)
        emptyView = view.findViewById(R.id.empty_view)
        
        val fabCreate = view.findViewById<FloatingActionButton>(R.id.fab_create)
        fabCreate.setOnClickListener {
            findNavController().navigate(R.id.action_testing_to_create)
        }
        
        setupRecyclerView()
        
        return view
    }
    
    private fun setupRecyclerView() {
        // Sample data for demonstration
        val sampleSurveys = listOf(
            Survey(1, "Math Quiz", "Basic arithmetic operations", 10),
            Survey(2, "Science Test", "Basic physics concepts", 15),
            Survey(3, "History Exam", "World War II", 8),
            Survey(4, "Language Arts", "Grammar and punctuation", 12)
        )
        
        if (sampleSurveys.isEmpty()) {
            recyclerView.visibility = View.GONE
            emptyView.visibility = View.VISIBLE
        } else {
            recyclerView.visibility = View.VISIBLE
            emptyView.visibility = View.GONE
            
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            recyclerView.adapter = SurveyAdapter(sampleSurveys) { survey ->
                // Handle survey click - navigate to test
                findNavController().navigate(R.id.action_testing_to_test)
            }
        }
    }
} 