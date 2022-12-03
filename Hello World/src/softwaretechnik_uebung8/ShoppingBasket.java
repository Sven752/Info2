package softwaretechnik_uebung8;

import java.util.ArrayList;

public class ShoppingBasket {
	public static Items item_list=new Items();
	private static Integer totalPrice=0;
	

	ArrayList<String> MyItems=new ArrayList<String>();

	public ShoppingBasket() 
	{
		totalPrice = 0;
	}
	
	public void addTobasket(String item) {
		

		setTotalPrice(getTotalPrice()+ item_list.getPrice(item));
			
		
	}
	
	public Integer getBill() {
		
		return getTotalPrice();
		
		
	}

	public  Integer getTotalPrice() {
	return totalPrice;
	}

	public  void setTotalPrice(Integer totalPrice) {
	ShoppingBasket.totalPrice = totalPrice;
	}

}