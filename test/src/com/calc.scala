
package com

class calc {

  def sum(a: Int, b: Int): Int = {
    a + b
  }

  def sum(coll: List[Int]): Int = {
    if (coll.isEmpty) return 0

    coll.head + sum(coll.tail)
  }

  def sqr(element: Int) = {
    element * element
  }
  
  def functiontype(func: Int => Int) = {
  }
}