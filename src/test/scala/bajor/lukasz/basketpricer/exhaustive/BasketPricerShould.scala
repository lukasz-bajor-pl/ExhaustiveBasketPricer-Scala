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

    "price basket with single item with item unit price" in {
      assert(basketPricer.price(new Basket(Apple)) === Apple.price)
    }

    "price basket with 2 same items" in {
      assert(basketPricer.price(new Basket(Apple, Apple)) === Apple.price*2)
    }

    "price basket with 2 different items" in {
      assert(basketPricer.price(new Basket(Apple, Banana)) === Apple.price + Banana.price)
    }
  }
}
