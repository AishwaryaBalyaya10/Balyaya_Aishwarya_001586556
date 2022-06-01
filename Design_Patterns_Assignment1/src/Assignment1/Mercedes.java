package Assignment1;

public class Mercedes extends Stock{
	public Mercedes(String name, int price, String description) {
		super(name, price, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMetric() {
		// TODO Auto-generated method stub
		return this.price-(this.oldPrice-1);
	}
}
