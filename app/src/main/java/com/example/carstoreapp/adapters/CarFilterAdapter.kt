package com.example.carstoreapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.carstoreapp.R
import com.example.carstoreapp.data.CarFilter

class CarFilterAdapter(val onClick:(CarFilter)->Unit):RecyclerView.Adapter<CarFilterAdapter.CarFilterViewHolder>() {

    private val items: MutableList<CarFilter> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarFilterViewHolder {
        return CarFilterViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_filter, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CarFilterViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    @SuppressLint("NotifyDataSetChanged")
    fun update(newList: List<CarFilter>) {
        this.items.clear()
        this.items.addAll(newList)
        notifyDataSetChanged()
    }

    inner class CarFilterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                adapterPosition.takeIf { it != RecyclerView.NO_POSITION }
                    ?.let { onClick(items[adapterPosition]) }
            }
        }

        fun bind(item: CarFilter) {
            itemView.findViewById<ImageView>(R.id.it_image).setImageResource(item.imageView)

        }
    }
}