package com.github.tamaki.study.nabedge.FizzBuzz

object FizzBuzz {
  
  def main(args: Array[String]): Unit = {

    (1 to 100).foreach(n =>
      n match {
        case x if(x % 3 == 0 && x % 5 == 0) => println("FizzBuzz")
        case x if(x % 3 == 0) => println("Fizz")
        case x if(x % 5 == 0) => println("Buzz")
        case x => println(x)
      }
    )
    
  }

  
}
