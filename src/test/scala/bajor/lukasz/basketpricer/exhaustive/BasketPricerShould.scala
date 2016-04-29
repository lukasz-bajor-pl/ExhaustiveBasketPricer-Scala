package bajor.lukasz.basketpricer.exhaustive

import org.scalatest.FreeSpec

/**
  * Created by lbajor on 2016-04-30.
  */
class BasketPricerShould extends FreeSpec {
  "BasketPricer no offers" - {

    val basketPricer = new BasketPricer()
    "price empty basket as 0" in {
      assert(basketPricer.price(new Basket) === BigDecimal(0))
    }
  }
}
