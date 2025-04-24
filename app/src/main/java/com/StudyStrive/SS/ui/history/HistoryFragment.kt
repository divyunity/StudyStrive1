package com.StudyStrive.SS.ui.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.StudyStrive.SS.R
import com.StudyStrive.SS.data.model.History
import com.StudyStrive.SS.data.model.HistoryType
import com.StudyStrive.SS.ui.adapters.HistoryAdapter

class HistoryFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var emptyView: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_history, container, false)
        
        recyclerView = view.findViewById(R.id.recycler_view)
        emptyView = view.findViewById(R.id.empty_view)
        
        setupRecyclerView()
        
        return view
    }
    
    private fun setupRecyclerView() {
        // Sample data for demonstration
        val sampleHistory = listOf(
            History(1, "Math Quiz", HistoryType.SURVEY, 85),
            History(2, "Spanish Vocabulary", HistoryType.CARD_SET, 92),
            History(3, "Science Test", HistoryType.SURVEY, 78),
            History(4, "Country Capitals", HistoryType.CARD_SET, 95)
        )
        
        if (sampleHistory.isEmpty()) {
            recyclerView.visibility = View.GONE
            emptyView.visibility = View.VISIBLE
        } else {
            recyclerView.visibility = View.VISIBLE
            emptyView.visibility = View.GONE
            
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            recyclerView.adapter = HistoryAdapter(sampleHistory)
        }
    }
} 