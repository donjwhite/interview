package lcm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCMTestJunit {

  @Test
  public void lcm(){
    assertEquals(4, LCM.lcm(2,4));
  }

}
