package Labsheet_2

object Q4 {

  def profit(t_price: Double): Double = ((180 - (4 * t_price)) * (t_price - 3)) + 500;

  def main(args: Array[String]): Unit = {
    var profit_max, current_profit, ticket, best_ticket: Double = 0

    for (ticket <- 1 to 50) {
      current_profit = profit(ticket);
      if (current_profit > profit_max) {
        profit_max = current_profit
        best_ticket = ticket
      }
    }
    printf("The best price for the ticket with the maximum profit is Rs. %f", best_ticket)

  }
}

//The following relationships were used to solve this question
//(people) = -4(ticket price) + 180
//(cost) = 500 - 3(people)
//(profit) = (ticket price)(people) - (cost)

//(profit) = (180 - 4(ticket price))*((ticket price) - 3) + 500

