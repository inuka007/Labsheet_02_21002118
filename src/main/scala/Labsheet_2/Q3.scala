package Labsheet_2

object Q3 {
  def a_tax(c: Double): Double = c * .88;

  def ot_pay(x: Double): Double = x * 85;

  def n_pay(y: Double): Double = y * 250;

  def salary(n: Double, o: Double): Double = a_tax(n_pay(n) + ot_pay(o))

  def main(args: Array[String]): Unit = {
    printf("The salary is: %f", salary(50, 40))
  }
}
