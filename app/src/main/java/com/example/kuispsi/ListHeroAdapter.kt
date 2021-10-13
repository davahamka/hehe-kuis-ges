package com.example.kuispsi

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListHeroAdapter(private val listHero:ArrayList<Hero>,private val onItemClickListener: OnItemClickListener):
    RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_hero, viewGroup ,false)
        return ListViewHolder(view)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (photo, name, description) = listHero[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDetail.text = description

        holder.imgPhoto.setOnClickListener{
//            onItemClickListener.onItemClicked(listHero[position])
            Toast.makeText(holder.itemView.context, listHero[position].name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = listHero.size


    inner class ListViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickListener{
        fun onItemClicked(productModel:Hero)
    }


}

