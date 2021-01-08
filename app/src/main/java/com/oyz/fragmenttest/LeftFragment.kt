package com.oyz.fragmenttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class LeftFragment :Fragment() {
    //重写onCreateView方法，是left_fragment布局动态加载进来
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.left_fragment, container, false)
    }

    //fragment 中调用 activity
    fun testCommunication(){
        //可以通过getActivity()方法获得和fragment相关联的activity实例
        if(activity != null){
            val manActivity = activity as MainActivity
        }
    }

    //而fragment通信可以通过  fragment1 中调用 activity 再通过 activity 获得 fragment2
}