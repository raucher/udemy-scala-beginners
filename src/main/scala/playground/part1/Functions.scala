package playground.part1

object Functions extends App {

  def factorial(n: Int):  Int = {
    if (n == 1) n
    else n * factorial(n - 1)
  }

  println(factorial(10))

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(10))
}
