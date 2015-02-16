package com.github.tamaki.study.nabedge.FizzBuzz

/**
 * FizzBuzz. ただし1行ずつ表示をやめて、カンマ区切りで一気に出す
 *
 */
object FizzBuzz4 {
  def main(args: Array[String]): Unit = {
    println((1 to 100).map(n =>
      n match {
        case x if(x % 3 == 0 && x % 5 == 0) => "FizzBuzz"
        case x if(x % 3 == 0) => "Fizz"
        case x if(x % 5 == 0) => "Buzz"
        case x => x
      }
    ).mkString(","))

  }
}
