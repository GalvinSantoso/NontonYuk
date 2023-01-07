package adapter;

public class PriceAdapter {
	
	int price;

	public PriceAdapter(int price) {
		this.price = price;
	}

	public int getPrice(String type) {
		if(type.equals("Standard")) {
			return this.price;
		}
		else if(type.equals("Gold")) {
			return (int) (this.price * 1.5);
		}
		else if(type.equals("Premium")) {
			return (int) (this.price * 2);
		}
		else if(type.equals("Exclusive")) {
			return (int) (this.price * 2.5);
		}
		return 0;
	}
	
}
