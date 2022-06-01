package Assignment1;

public class Stock implements Tradeable{
private String name;
public int price;
private String description;
public int oldPrice;

public Stock(String name, int price, String description) {
	this.name = name;
	this.price = price;
	this.description = description;
	this.oldPrice= price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

@Override
public void setBid(int bid) {
	// TODO Auto-generated method stub
	this.oldPrice = this.price;
	this.price = bid;
}

@Override
public int getMetric() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Bid for ");
	sb.append(this.name + " ");
	sb.append(this.description + " ");
	sb.append(this.oldPrice + " that is: ");
	sb.append(this.price);
	sb.append(" : metric is equal to: " + this.getMetric());
	return sb.toString();
}

}
