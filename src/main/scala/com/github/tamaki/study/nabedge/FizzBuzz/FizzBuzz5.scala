package com.github.tamaki.study.nabedge.FizzBuzz

/**
 * その1 バージョンのFizzBuzzの出力前のリストから、
 * * Fizz/Buzz/FizzBuzz になっていない数値の足し算をして合計値を出す
 *
 */
object FizzBuzz5 {
  def main(args: Array[String]): Unit = {
    val list = (1 to 100).map(n =>
      n match {
        case x if (x % 3 == 0 && x % 5 == 0) => "FizzBuzz"
        case x if (x % 3 == 0) => "Fizz"
        case x if (x % 5 == 0) => "Buzz"
        case x => x
      }
    ).withFilter(x => x.isInstanceOf[Int])
      .map(_.asInstanceOf[Int])
    println(list.sum)
  }
}
