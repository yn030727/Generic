package com.example.generic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //这里我们将MyClass的泛型指定成Int类型
        val myClass=MyClass()
        val result=myClass.method<Int>(123)
        //当然这里也可以省略方法上的泛型，因为我们传入了一个Int类型的参数，Kotlin自己进行了类型推导
    }
}