package lcm

import lcm.LCM
import spock.lang.Specification
import spock.lang.Unroll

class LCMTestSpock extends Specification {

  @Unroll
  def "lcm(#numOne, #numTwo) -> #expected"() {
    expect:
    LCM.lcm(numOne, numTwo) == expected

    where:
    numOne | numTwo | expected
    2      | 4      | 4
  }
}
