package abundant;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbundantNumberTest {

  @Test
  public void AbundantTest(){
    assertTrue(AbundantNumber.isAbundant(12));
    assertFalse(AbundantNumber.isAbundant(15));
  }
}
