package com.example.diego

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FoodAdapter(private val listFood: ArrayList<Foods>) : RecyclerView.Adapter<FoodAdapter.ListViewHolder>() {



    private lateinit var onItemClickCallBack: OnItemClickCallBack

    interface OnItemClickCallBack {
        fun onItemClicked(data: Foods)
    }

    fun setOnItemClickCallBack(onItemClickCallBack: OnItemClickCallBack){
        this.onItemClickCallBack =onItemClickCallBack
    }

    inner class ListViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        var tvName:TextView = itemView.findViewById(R.id.tv_food_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_food_detail)
        var imgFood: ImageView = itemView.findViewById(R.id.img_food_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.image)
            .apply(RequestOptions().override(65,65))
            .into(holder.imgFood)

        holder.tvName.text = food.nama
        holder.tvDetail.text = food.detail

        holder.itemView.setOnClickListener { onItemClickCallBack.onItemClicked(listFood[holder.adapterPosition]) }
    }
}