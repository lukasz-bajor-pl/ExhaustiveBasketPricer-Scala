package bajor.lukasz.basketpricer.exhaustive

import org.scalatest.FreeSpec

/**
  * Created by lbajor on 2016-05-02.
  */
class BasketPricerFeatureTest extends FreeSpec {
  "BasketPricer no offers" - {
    "should calculate price of basket" in {
      val pricer = new BasketPricer()
      assert(pricer.price(new Basket(Apple, Apple, Banana)) === Apple.price * 2 + Banana.price)
    }
  }

}
