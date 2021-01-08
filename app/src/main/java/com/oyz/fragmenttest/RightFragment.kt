package com.oyz.fragmenttest

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/** 生命周期
onAttach() 当Fragment和Activity建立关联时调用。

onCreateView() 为Fragment创建视图（加载布局）时调用。

onActivityCreated() 确保与Fragment相关联的Activity已经创建完毕时调用。

onDestroyView() 当与Fragment关联的视图被移除时调用。

onDetach() 当Fragment和Activity解除关联时调用。

 */
class RightFragment : Fragment() {
    //重写onCreateView方法，是left_fragment布局动态加载进来
    //onCreateView() 为Fragment创建视图（加载布局）时调用。
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG,"onCreateView")
        return inflater.inflate(R.layout.right_fragment, container, false)
    }

    companion object {
        const val TAG = "RightFragment"
    }
    //onAttach() 当Fragment和Activity建立关联时调用。
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate")
    }

    //onActivityCreated() 确保与Fragment相关联的Activity已经创建完毕时调用。
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG,"onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
    }
    //onDestroyView() 当与Fragment关联的视图被移除时调用。

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG,"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }

    //onDetach() 当Fragment和Activity解除关联时调用。
    override fun onDetach() {
        super.onDetach()
        Log.d(TAG,"onDetach")
    }

}