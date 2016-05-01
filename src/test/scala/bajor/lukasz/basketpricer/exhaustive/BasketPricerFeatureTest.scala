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

  "BasketPricer with offers" - {
    "should support buy 1 get 1 free offer" in {
      val pricer = new BasketPricer(new BuyOneGetOneFree(Apple))
      assert(pricer.price(new Basket(Apple, Apple)) === Apple.price)
    }
  }

}
