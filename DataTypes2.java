package mnc;

public class DataTypes2 {
	public static void main(String[] args) {
		Xyz obj=new Xyz();
		Xyz obj2=new Xyz();
		
		
		obj.y=50;
		obj.y=100;
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		
		System.out.println(obj.x);
		System.out.println(obj2.y);
	}
}

class Xyz{
	static int x=10;
	int y=20;
	
}
