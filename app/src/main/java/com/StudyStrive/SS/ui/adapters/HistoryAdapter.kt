package com.StudyStrive.SS.ui.adapters

import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.StudyStrive.SS.R
import com.StudyStrive.SS.data.model.History
import java.util.*

class HistoryAdapter(private val historyItems: List<History>) :
    RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    class HistoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tv_history_name)
        val date: TextView = itemView.findViewById(R.id.tv_history_date)
        val score: TextView = itemView.findViewById(R.id.tv_history_score)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_history, parent, false)
        return HistoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        val history = historyItems[position]
        holder.name.text = history.name
        
        // Format date
        val date = Date(history.dateCompleted)
        val formattedDate = DateFormat.format("MMMM dd, yyyy", date).toString()
        holder.date.text = formattedDate
        
        // Format score
        holder.score.text = "Score: ${history.score}%"
    }

    override fun getItemCount() = historyItems.size
} 