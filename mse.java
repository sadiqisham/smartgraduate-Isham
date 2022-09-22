package mnc;

public class mse {
	
	public static void main(String[] args) {
	SkShop.money=20000;
	
	SkShop mobile=new SkShop();
	mobile.cost=50000;
	
	
	SkShop gadget=new SkShop();
	gadget.cost=30000;
	
	mobile.rent=25000;
	System.out.println(gadget.cost);
	}

}

class SkShop{
	
	static  int money;
	int cost;
	int rent;
	public void met() {
		System.out.println("garr");
	}
}