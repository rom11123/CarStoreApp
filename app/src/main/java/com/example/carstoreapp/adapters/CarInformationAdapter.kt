package com.example.carstoreapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carstoreapp.R
import com.example.carstoreapp.data.CarInformationData

class CarInformationAdapter(
    val onClick: (CarInformationData) -> Unit,
) : RecyclerView.Adapter<CarInformationAdapter.CarInfoViewHolder>() {

    private val items: MutableList<CarInformationData> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarInfoViewHolder {
        return CarInfoViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_car_vertikal, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CarInfoViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    @SuppressLint("NotifyDataSetChanged")
    fun update(newList: List<CarInformationData>) {
        this.items.clear()
        this.items.addAll(newList)
        notifyDataSetChanged()
    }

    inner class CarInfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                adapterPosition.takeIf { it != RecyclerView.NO_POSITION }
                    ?.let { onClick(items[adapterPosition]) }
            }
        }

        fun bind(item: CarInformationData) {
            itemView.findViewById<ImageView>(R.id.item_image_car).setImageResource(item.image)
            itemView.findViewById<TextView>(R.id.item_firm).text = item.firm.toString()
            itemView.findViewById<TextView>(R.id.item_model).text = item.model

        }
    }
}