package com.oyz.fragmentbestpractice.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.oyz.fragmentbestpractice.R
import kotlinx.android.synthetic.main.news_content_frag.*

class NewsContentFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.news_content_frag, container, false)
    }

    //刷新
    fun refresh(title: String, content: String){
        //设为可见
        contentLayout.visibility = View.VISIBLE
        newsTitle.text = title  //刷新新闻的标题
        newsContent.text = content //刷新新闻的内容
    }

}