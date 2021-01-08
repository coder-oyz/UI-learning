package com.oyz.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.left_fragment.*

/**动态添加Fragment的步骤

1.创建待添加Fragment的实例。
2.获取FragmentManager，在Activity中可以直接调用getSupportFragmentManager()方法获取。
3.开启一个事务，通过调用beginTransaction()方法开启。
4.向容器内添加或替换Fragment，一般使用replace()方法实现，需要传入容器的id和待添加的Fragment实例。
5.提交事务，调用commit()方法来完成。

 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //实现动态添加fragment
        //首先 给左边的button注册一个点击事件
        button.setOnClickListener {
            //点击button是又会然后调用replaceFragment动态添加AnotherRightFragment
            replaceFragment(AnotherRightFragment())
        }
        //然后调用replaceFragment动态添加了RightFragment
        replaceFragment(RightFragment())
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.rightLayout, fragment)

        //实现返回栈  这样点击back键就会返回上一个fragment了
        transaction.addToBackStack(null)

        transaction.commit()
    }
}