package com

object test {

  def main(args: Array[String]) {
    var str = "Hello World"
    println(str)

    str = "Hello World 1"
    println(str)

    var calcuation = new calc;

    val coll = List(1, 2, 3, 4)

    val colls = coll.map { element => element * element }
    println("new collection " + colls)

    val total = calcuation.sum(coll)

    println("total " + total)
  }
}