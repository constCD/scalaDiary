package com.atguigu.chapter01


object TestScala {
  /**
    *@todo scala输出方式
    * @param args
    */
  def main(args: Array[String]): Unit = {
    val str1 = "hello"
    val age = 10
    //    printf("name =%s age =%d" ,str1,age)
    print(s"name = $str1,age = ${age + 1}")
  }


}
