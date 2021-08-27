package avgpx

import spock.lang.Specification


class AvgPriceSpec extends Specification {

  def "first test"(){
    expect:
    AvgPrice.getAveragePrice([new Trade(0, 0.0d)]) == 0.0d
  }

}
