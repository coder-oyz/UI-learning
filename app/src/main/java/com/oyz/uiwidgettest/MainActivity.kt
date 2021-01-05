package com.oyz.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //设置按钮的点击事件
       /* button.setOnClickListener {
            // 在此处添加逻辑
        }*/
        //也可以使MainActivity实现View.OnClickListener,重写onClick方法
        button.setOnClickListener (this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button -> {
                //使用Toast显示文本框中的文本
                /*val inputText = editText.text.toString()
                Log.d("MainActivity-------",inputText)
                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()*/

                //动态改变图片
                //imageView.setImageResource(R.drawable.img_2)

                //使进度条 如果可见就隐藏，不可见就显示
                /*progressBar.visibility= if(progressBar.visibility == View.VISIBLE) {
                    View.GONE
                }else{
                    View.VISIBLE
                }*/

                //动态改变进度条进度
                //progressBar.progress = progressBar.progress + 10

                //对话框
                AlertDialog.Builder(this).apply {
                    setTitle("This is Dialog")
                    setMessage("Something important.")
                    setCancelable(false)  //可否使用back键关闭对话框
                    setPositiveButton("OK") { dialog, which ->
                    }
                    setNegativeButton("Cancel") { dialog, which ->
                    }
                    show()
                }



            }
        }
    }
}