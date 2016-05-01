package bajor.lukasz.basketpricer.exhaustive

/**
  * Created by lbajor on 2016-05-02.
  */
abstract sealed class Offer(items: List[Item], discount: BigDecimal) {
  def this(discount: BigDecimal, items: Item*) = this(items.toList, discount)
}

class BuyOneGetOneFree(item: Item) extends Offer(item.price, item, item)
