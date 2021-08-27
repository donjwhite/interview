package abundant

import spock.lang.Specification

class AbundantNumberSpec extends Specification {

  def "this is a test"(){
    expect:
    AbundantNumber.isAbundant(12)
    !AbundantNumber.isAbundant(15)
  }
}
