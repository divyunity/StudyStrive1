package com.StudyStrive.SS.ui.memorization

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
import com.StudyStrive.SS.data.model.CardSet
import com.StudyStrive.SS.data.model.CardSide
import com.StudyStrive.SS.ui.adapters.CardSetAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MemorizationFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var emptyView: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_memorization, container, false)
        
        recyclerView = view.findViewById(R.id.recycler_view)
        emptyView = view.findViewById(R.id.empty_view)
        
        val fabCreate = view.findViewById<FloatingActionButton>(R.id.fab_create)
        fabCreate.setOnClickListener {
            findNavController().navigate(R.id.action_memorization_to_create)
        }
        
        setupRecyclerView()
        
        return view
    }
    
    private fun setupRecyclerView() {
        // Sample data for demonstration
        val sampleCardSets = listOf(
            CardSet(1, "Spanish Vocabulary", "Basic Spanish words", 20, cardSide = CardSide.MIXED),
            CardSet(2, "Math Formulas", "Algebra and geometry formulas", 15, cardSide = CardSide.SIDE_A),
            CardSet(3, "Country Capitals", "Countries and their capitals", 25, cardSide = CardSide.SIDE_B),
            CardSet(4, "Chemical Elements", "Periodic table elements and symbols", 30, cardSide = CardSide.MIXED)
        )
        
        if (sampleCardSets.isEmpty()) {
            recyclerView.visibility = View.GONE
            emptyView.visibility = View.VISIBLE
        } else {
            recyclerView.visibility = View.VISIBLE
            emptyView.visibility = View.GONE
            
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            recyclerView.adapter = CardSetAdapter(sampleCardSets) { cardSet ->
                // Handle card set click - navigate to cards viewer
                findNavController().navigate(R.id.action_memorization_to_cards)
            }
        }
    }
} 