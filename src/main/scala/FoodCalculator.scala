object FoodCalculator extends App {
  val food = "potatoes"
  val price = 0.37
  val quantity = 20
  val total_price = price * quantity
  f"$total_price%1.2f"
  println(f"It will cost $total_price%1.2f EUR to buy $quantity kilos of $food.")
}
