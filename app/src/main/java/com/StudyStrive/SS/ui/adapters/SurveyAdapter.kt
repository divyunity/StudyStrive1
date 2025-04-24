package com.StudyStrive.SS.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.StudyStrive.SS.R
import com.StudyStrive.SS.data.model.Survey

class SurveyAdapter(private val surveys: List<Survey>, private val onSurveyClicked: (Survey) -> Unit) :
    RecyclerView.Adapter<SurveyAdapter.SurveyViewHolder>() {

    class SurveyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tv_survey_name)
        val questionCount: TextView = itemView.findViewById(R.id.tv_question_count)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SurveyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_survey, parent, false)
        return SurveyViewHolder(view)
    }

    override fun onBindViewHolder(holder: SurveyViewHolder, position: Int) {
        val survey = surveys[position]
        holder.name.text = survey.name
        holder.questionCount.text = "${survey.questionCount} questions"
        holder.itemView.setOnClickListener {
            onSurveyClicked(survey)
        }
    }

    override fun getItemCount() = surveys.size
} 