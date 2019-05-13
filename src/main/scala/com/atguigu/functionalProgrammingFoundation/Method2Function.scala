package com.atguigu.functionalProgrammingFoundation

object Method2Function {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
//    方法
//    println(dog.sum(1,2))
//    函数
    val f1 = dog.sum _
//   println(f1(1,2))
//    printM(4)
//
//    def printM(i:Int):Unit={
//      if(i>2){
//        printM(i-1)
//      }
//      print(i)
//    }

    print(test)
    def test={
      1
    }

  }
}

class Dog{
  def sum(n1:Int,n2:Int) ={
    n1+n2
  }
}