package com.example.generic

import kotlin.reflect.KProperty

class Delegate {
    var propValue:Any?=null
    //getValue声明两个参数，第一个参数声明该Delegate类的委托功能可以在什么类中使用
    //第二个参数KProperty<*>是Kotlin中的一个属性操作类，可用于获取各种属性相关的值
    //PS:<*>这种泛型写法表示你不知道或者不关心泛型的具体类型
    operator fun getValue(myClassVariable: MyClassVariable, property: KProperty<*>): Any? {
        return propValue
    }
    //当然如果MyClassVari中的p是val关键词声明，那么我们也可以不用实现setValue()
    //因为p属性无法在初始化后被重新赋值
    operator fun setValue(myClassVariable: MyClassVariable, property: KProperty<*>, any: Any?) {
        propValue=any
    }
}