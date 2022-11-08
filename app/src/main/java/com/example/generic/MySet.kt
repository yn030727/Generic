package com.example.generic

class MySet<T> (val helperSet:HashSet<T>):Set<T> by helperSet{
    //本来不重写就会报红
    //Kotlin委托使用的关键字是by,我们只需要在接口声明的后面使用by关键字
    //在接上受委托的对象，就可以免去之前所写的一大堆模板式的代码了

    //1.新的方法
    fun helloworld()= println("Hello World")
    //2.如果我们要对某个方法进行重新实现，只需要单独写一个方法就可以了
    override fun isEmpty(): Boolean=false
    //此时此刻我们的MySet就变成了一个全新的数据结构类，它不仅永远不会为空，而且还能打印helloworld
}
