package com.example.generic

import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.chip.ChipDrawable
import com.google.android.material.circularreveal.CircularRevealHelper

class MyClassVariable {
    //这里的by关键字连接了左边的p属性和右边的Delegate实例
    //p属性将具体实现委托给了Delegate类去完成
    //而调用p属性的时候自动会调用Delegate类的getValue方法，当给p属性赋值的时候就会自动调用Delegate类的SetValue()方法
    var p by Delegate()
}