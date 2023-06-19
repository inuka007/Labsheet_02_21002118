package Labsheet_2

object Q2 {
  var a = 2
  var b = 3
  var c = 4
  var d = 5
  var k = 4.3f

  def main(args: Array[String]): Unit = {
    b -= 1
    println(b * a + c * d);
    d -= 1
    println(a);
    a += 1
    println(-2 * (a - k) + c);
    println(c);
    c += 1
    c += 1
    println(c * a)
    a += 1

  }
}
