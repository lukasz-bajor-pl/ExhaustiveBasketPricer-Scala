package bajor.lukasz.basketpricer.exhaustive

/**
  * Created by lbajor on 2016-05-02.
  */
sealed abstract class Item {
  def price: BigDecimal
}

case object Apple extends Item {
  override val price= BigDecimal(0.20)
}

case object Banana extends Item {
  override val price= BigDecimal(0.30)
}
