package com.StudyStrive.SS.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.StudyStrive.SS.R
import com.StudyStrive.SS.data.model.CardSet

class CardSetAdapter(private val cardSets: List<CardSet>, private val onCardSetClicked: (CardSet) -> Unit) :
    RecyclerView.Adapter<CardSetAdapter.CardSetViewHolder>() {

    class CardSetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tv_cards_name)
        val cardCount: TextView = itemView.findViewById(R.id.tv_card_count)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardSetViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cards, parent, false)
        return CardSetViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardSetViewHolder, position: Int) {
        val cardSet = cardSets[position]
        holder.name.text = cardSet.name
        holder.cardCount.text = "${cardSet.cardCount} cards"
        holder.itemView.setOnClickListener {
            onCardSetClicked(cardSet)
        }
    }

    override fun getItemCount() = cardSets.size
} 