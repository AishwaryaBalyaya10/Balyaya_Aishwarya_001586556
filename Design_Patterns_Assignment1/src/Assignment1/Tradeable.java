package Assignment1;

public interface Tradeable {
	/**
     * place a bid to buy a stock
     * 
     * @param bid
     */
    public void setBid(int bid);
    /**
     * return a metric indicating measure of positive performance of this stock
     * where a large positive index means consider buying this well performing stock.
     * and where a large negative index means consider selling this poorly performing stock.
     * @return
     */
    public int getMetric();
}
