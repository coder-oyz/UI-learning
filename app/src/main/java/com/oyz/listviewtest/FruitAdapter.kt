package com.oyz.listviewtest

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FruitAdapter(activity: Activity, val resourceId: Int, data: List<Fruit>) : ArrayAdapter<Fruit>(activity, resourceId, data) {
    //初始版
    /*override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //加载传入布局   false表示不会为这个View添加父布局
        val view = LayoutInflater.from(context).inflate(resourceId, parent, false)

        //kotlin-android-extensions 主要应用场景在Activity和Fragment中,所以在这还使用findViewById
        val fruitImage: ImageView = view.findViewById(R.id.fruitImage)
        val fruitName: TextView = view.findViewById(R.id.fruitName)
        val fruit = getItem(position) // 获取当前项的Fruit实例
        if (fruit != null) {
            fruitImage.setImageResource(fruit.imageId)
            fruitName.text = fruit.name
        }
        return view
    }*/

    //提高运行效率，每次都重新加载布局，性能不好
    //利用getView的convertView参数，这个参数用于将之前加载好的布局进行缓存2
    /*override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //加载传入布局   false表示不会为这个View添加父布局
        val view: View
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(resourceId, parent, false)
            //kotlin-android-extensions 主要应用场景在Activity和Fragment中,所以在这还使用findViewById
        } else {
            view = convertView
        }
        val fruitImage: ImageView = view.findViewById(R.id.fruitImage)
        val fruitName: TextView = view.findViewById(R.id.fruitName)
        val fruit = getItem(position) // 获取当前项的Fruit实例
        if (fruit != null) {
            fruitImage.setImageResource(fruit.imageId)
            fruitName.text = fruit.name
        }
        return view
    }*/

    //每次getView()方法中仍然会调用View的findViewById(),可以利用viewHolder来对这部分性能进行调优
    //加一个内部类inner class ViewHolder(val fruitImage: ImageView, val fruitName: TextView)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(resourceId, parent, false)
            //kotlin-android-extensions 主要应用场景在Activity和Fragment中,所以在这还使用findViewById
            val fruitImage: ImageView = view.findViewById(R.id.fruitImage)
            val fruitName: TextView = view.findViewById(R.id.fruitName)
            viewHolder = ViewHolder(fruitImage, fruitName)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val fruit = getItem(position) // 获取当前项的Fruit实例
        if (fruit != null) {
            viewHolder.fruitImage.setImageResource(fruit.imageId)
            viewHolder.fruitName.text = fruit.name
        }
        return view
    }

    inner class ViewHolder(val fruitImage: ImageView, val fruitName: TextView)

}