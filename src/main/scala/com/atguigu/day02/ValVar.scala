package com.atguigu.day02

class ValVar {

}
object test{
  /**
    * 设计val和var的目的是为了提高程序效率，
    * val是线程安全的，在实际编程中，一般都是改变对象的属性，而很少改变
    * 对象本身，这就是val的应用场景
    */
  def main(args: Array[String]): Unit = {
    val dog: Dog = new Dog()
    dog.age = 80
    dog.name = "xiao"
//    dog.size = 20
  }
}
class Dog{
  var age = 0
  var name = ""
  val size =30
}