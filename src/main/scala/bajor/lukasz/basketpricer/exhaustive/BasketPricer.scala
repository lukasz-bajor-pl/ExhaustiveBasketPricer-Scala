package bajor.lukasz.basketpricer.exhaustive

/**
  * Created by lbajor on 2016-04-30.
  */
class BasketPricer() {
  def price(basket: Basket) = {
    if (basket.items.isEmpty)
      BigDecimal(0)
    else
      basket.items.head.price
  }
}
