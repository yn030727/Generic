package com.example.generic

import java.lang.StringBuilder

class MyClass{
    //Kotlin还允许我们对泛型的类型进行限制。
    //你还可以通过指定上界的方式来对泛型的类型进行约束
    fun <T:Number>method(param:T):T{
        //这里我们将T指定成了Number类型。表示可以接受数字类型参数(Int,Float,Double)
        return param
        //另外，在默认情况下，所有的泛型都是可以指定成可空类型的，不手动指定上界的时侯、
        //泛型的上界默认为Any？    <T:Any?>
        //指定成Any就可以不为空
    }

    //拓展函数，只能在StringBuilder中使用
    fun StringBuilder.build(block:StringBuilder.()->Unit):StringBuilder{
        block()
        return this
    }
    //通过泛型进行扩大
    fun <T>T.build(block: T.() -> Unit):T{
        block()
        return this
    }
}