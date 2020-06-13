package com.mumtazfuadi.kambing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class GridGoatAdapter(val listGoat: ArrayList<Goat>) :
    RecyclerView.Adapter<GridGoatAdapter.GridViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_grid_goat, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridGoatAdapter.GridViewHolder, position: Int) {
        val goat = listGoat[position]

        Glide.with(holder.itemView.context)
            .load(listGoat[position].photo)
            .apply(RequestOptions().override(550, 350))
            .into(holder.imgPhoto)

        holder.tvName.text = goat.name

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listGoat[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listGoat.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Goat)
    }
}