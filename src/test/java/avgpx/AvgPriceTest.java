package avgpx;

import static org.junit.Assert.assertEquals;

import java.util.Collections;

import org.junit.Test;

public class AvgPriceTest {
  @Test
  public void AvgPriceTest(){
    assertEquals(0.0d, AvgPrice.getAveragePrice(Collections.singletonList(new Trade(0, 0.0d))), 0.001d);
  }
}
