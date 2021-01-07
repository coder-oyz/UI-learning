package com.oyz.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.oyz.listviewtest.Fruit
import com.oyz.recyclerview.R
import kotlinx.android.synthetic.main.fruit_item_v.view.*

class FruitAdapter(val fruitList: List<Fruit>) :  RecyclerView.Adapter<FruitAdapter.ViewHolder>(){
    //获取外层布局，通过findViewById获取fruitImage，fruitName实例
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val fruitImage: ImageView = view.findViewById(R.id.fruitImage)
        val fruitName: TextView = view.findViewById(R.id.fruitName)
    }

    //加载布局fruit_item  并传入ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fruit_item_v, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.text = fruit.name
    }

    override fun getItemCount() = fruitList.size

}