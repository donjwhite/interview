package avgpx;

import java.util.Objects;

public class Trade {
  private final int shares;
  private final double price;
  private final long timestamp;

  public Trade(int shares, double price){
    this.shares = shares;
    this.price = price;
    this.timestamp = System.currentTimeMillis();
  }

  public int getShares() {
    return shares;
  }

  public double getPrice() {
    return price;
  }

  public long getTimestamp() {
    return timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Trade trade = (Trade) o;
    return shares == trade.shares &&
        Double.compare(trade.price, price) == 0 &&
        timestamp == trade.timestamp;
  }

  @Override
  public int hashCode() {
    return Objects.hash(shares, price, timestamp);
  }
}
