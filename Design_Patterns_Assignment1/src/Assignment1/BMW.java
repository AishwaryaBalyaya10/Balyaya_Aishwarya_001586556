package Assignment1;

public class BMW extends Stock {
	
	public BMW(String name, int price, String description) {
		super(name, price, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMetric() {
		// TODO Auto-generated method stub
		return this.price-this.oldPrice;
	}

}
