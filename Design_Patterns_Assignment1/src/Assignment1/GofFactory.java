package Assignment1;

public class GofFactory {
	enum Stock {
		BMW,
		Mercedes
		   }
		   public GofFactory getObject( StockMarket criteria ) {
		if (criteria == instance) {
		return new BMW();
		}
		return new Mercedes();
		}
	}

