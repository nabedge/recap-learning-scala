package com.github.tamaki.study.nabedge.FizzBuzz

/**
 * FizzBuzzから2の倍数を除外する。
 * *
 */
object FizzBuzz3 {
  def main(args: Array[String]): Unit = {
    (1 to 100).foreach(n =>
      n match {
        case x if(x % 3 == 0 && x % 5 == 0) => println("FizzBuzz")
        case x if(x % 3 == 0) => println("Fizz")
        case x if(x % 5 == 0) => println("Buzz")
        case x if (x % 2 == 0) => //
        case x => println(x)
      }
    )

    // 模範解＝withFilterを使う
    // (1 to 100).withFilter(x => x % 2 !=0).foreach(...)...
    

  }
}
