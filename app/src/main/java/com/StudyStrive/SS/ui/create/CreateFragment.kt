package com.StudyStrive.SS.ui.create

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.StudyStrive.SS.R

class CreateFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_create, container, false)
        
        val btnCreateCards = view.findViewById<Button>(R.id.btn_create_cards)
        val btnCreateFolder = view.findViewById<Button>(R.id.btn_create_folder)
        
        btnCreateCards.setOnClickListener {
            // Navigate to cards creation
        }
        
        btnCreateFolder.setOnClickListener {
            // Navigate to folder creation
        }
        
        return view
    }
} 