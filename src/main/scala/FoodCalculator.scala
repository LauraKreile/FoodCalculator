object FoodCalculator extends App {
  val food = "potatoes"
  val price = 0.37
  val quantity = 20
  val total_price = price * quantity
  println (s"We got ${args.length} arguments")
  println (s"The first arguments is ${args(0)}")
  println (s"The second arguments is ${args(1)}")
  println (s"The third arguments is ${args(2)}")
  val cost = args(0).toFloat * args(1).toInt
  f"$total_price%1.2f"
  println(f"It will cost $total_price%1.2f EUR to buy $quantity kilos of $food.")
  println(f"It will cost $cost EUR to buy ${args(1)} kilos of ${args(2)}")

}
