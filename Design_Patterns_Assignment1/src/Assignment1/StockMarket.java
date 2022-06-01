package Assignment1;

import java.util.*;

public class StockMarket {
	List<Tradeable> stocks;
	private static StockMarket instance;
	private StockMarket() {
		instance=null;
		stocks = new ArrayList<Tradeable>();
	}
	
	
	public static synchronized StockMarket getInstance() {
		if(instance==null) {
		instance=new StockMarket();
	}
		return instance;
	}
	
	public void addStocks(Tradeable stock) {
		stocks.add(stock);
	}
	public void setBid(Tradeable stock, int bid) {
		stock.setBid(bid);
	}
	public void removeStock(Tradeable stock) {
		stocks.remove(stock);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Tradeable stock: stocks) {
			sb.append(stock.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	

}
