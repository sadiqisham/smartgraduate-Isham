package mnc;

public class DataTypes3 {
	public static void main(String[] args) {
		HouseMember.income=10000;
		
		HouseMember father=new HouseMember();
		father.expense=5000;
		
		HouseMember mother=new HouseMember();
		mother.expense=2000;
		
		HouseMember child=new HouseMember();
		child.expense=100;
		
		System.out.println(child.expense);
		father.income=4000;
		System.out.println(HouseMember.income);
	}
}

class HouseMember{
	static int income;
	int expense;
}