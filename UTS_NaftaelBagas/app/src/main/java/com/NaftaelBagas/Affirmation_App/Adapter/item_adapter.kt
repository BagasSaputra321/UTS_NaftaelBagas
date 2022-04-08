package com.NaftaelBagas.Affirmation_App.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.NaftaelBagas.Affirmation_App.Model.Afirmasi
import com.NaftaelBagas.affirmation_app.R

class ItemAdapter(private val context: Context,
                  private val dataset: List<Afirmasi>):
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.title)
        val imageView: ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).
        inflate(R.layout.item_list,parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourcesId)
        holder.imageView.setImageResource(item.imageResourcesId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}