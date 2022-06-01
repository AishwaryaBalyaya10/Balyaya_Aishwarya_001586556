package Assignment1;

public class Stock2 implements Tradeable{
	private String name;
	public double price;
	public double bid;
	public int metric;
	
	public Stock2(String name, double price, int metric) {
		this.name = name;
		this.price = price;
		this.metric = metric;
	}
	@Override
	public void setBid(int bid) {
		// TODO Auto-generated method stub
		this.bid=bid;
	}

	@Override
	public int getMetric() {
		// TODO Auto-generated method stub
		return metric;
	}
	
	public void newPrice() {
//		return this.price;
		System.out.println(bid/price);
		System.out.println(metric/100);
		if((bid/price)>(1+(metric/100))){
			this.price = bid;
		}
	}
	@Override
	public String toString() {
		return "name=" + this.name + "price=" + this.price;
	}
	
}
