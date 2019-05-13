package com.atguigu.day02

object yieldfor {
  /**
    * @todo 展示关键字yield，体现了scala的特色
    *       在一个集合中遍历元素并进行处理
    * @param args
    */
  def main(args: Array[String]): Unit = {
    val res = for(i <- 1 to 10) yield {
      if(i % 2 == 0) {
        i
      }else{
        i+"不是偶数"
      }
    }
    println(res)
  }

}
