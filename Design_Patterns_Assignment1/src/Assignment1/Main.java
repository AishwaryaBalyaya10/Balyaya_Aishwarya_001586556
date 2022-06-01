package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		GofFactory factory = new GofFactory();
				   List<StockMarket> stockMarket = new ArrayList<>();
				   stockMarket.add(factory.getObject(BMW));
				   stockMarket.add(factory.getObject(Mercedes));
		// TODO Auto-generated method stub
		StockMarket stockInst = StockMarket.getInstance();		
		Tradeable BMW = new BMW("BMW :", 160, " ");
		Tradeable Mercedes = new Mercedes("Mercedes:", 270, "15% > ");
		stockInst.addStocks(BMW);
		stockInst.addStocks(Mercedes);
		System.out.println(stockInst);
		
		BMW.setBid(100);
		Mercedes.setBid(200);
		System.out.println(stockInst);

		BMW.setBid(150);
		Mercedes.setBid(50);
		System.out.println(stockInst);

		BMW.setBid(110);
		Mercedes.setBid(115);
		System.out.println(stockInst);

		BMW.setBid(120);
		Mercedes.setBid(77);
		System.out.println(stockInst);

		BMW.setBid(220);
		Mercedes.setBid(130);
		System.out.println(stockInst);

		BMW.setBid(190);
		Mercedes.setBid(86);
		System.out.println(stockInst);

	}
}
