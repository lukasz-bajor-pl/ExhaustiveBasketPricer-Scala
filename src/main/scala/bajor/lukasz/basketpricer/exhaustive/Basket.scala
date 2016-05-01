package bajor.lukasz.basketpricer.exhaustive

/**
  * Created by lbajor on 2016-04-30.
  */
case class Basket(val items: List[Item]) {
  def this(items: Item*) = this(items.toList)
}
