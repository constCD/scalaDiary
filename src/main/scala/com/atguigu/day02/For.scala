package com.atguigu.day02

object For {
  /**
    * @todo 展示for循环的案例
    * @param args
    */
  def main(args: Array[String]): Unit = {
    for(i<-1 to 10){
      println(i+"hello")
    }
    for(i <- 1 until 10){
      println(i+ "hello")
    }
  }
}
