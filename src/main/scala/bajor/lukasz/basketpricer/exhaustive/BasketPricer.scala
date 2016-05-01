package bajor.lukasz.basketpricer.exhaustive

/**
  * Created by lbajor on 2016-04-30.
  */
class BasketPricer(val offers: Set[Offer]) {
  def this() = this(Set[Offer]())
  def this(offers: Offer*) = this(offers.toSet)

  def price(basket: Basket) = {
    if (basket.items.isEmpty)
      BigDecimal(0)
    else
      basket.items.map(i => i.price).sum
  }
}
