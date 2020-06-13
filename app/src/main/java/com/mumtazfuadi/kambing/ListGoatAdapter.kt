package com.mumtazfuadi.kambing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListGoatAdapter(val listGoat: ArrayList<Goat>) :
    RecyclerView.Adapter<ListGoatAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_goat, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val goat = listGoat[position]

        Glide.with(holder.itemView.context)
            .load(goat.photo)
            .apply((RequestOptions().override(100, 100)))
            .into(holder.imgPhoto)

        holder.tvName.text = goat.name
        holder.tvDetail.text = goat.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listGoat[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listGoat.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Goat)
    }
}