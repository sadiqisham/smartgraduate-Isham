package mnc;

public class ArrayDemo {
	
public static void main(String[] args) {
	int x=10;
	int[] nums= {10,20,30,40};
	
	System.out.println(nums[3]);
	System.out.println(nums.length);
	
	System.out.println(nums[1]);
	nums[1]=100;
	
	System.out.println(nums[1]);
	for(int i=0;i<nums.length;i++) {
		
		System.out.println(nums[i]);
		
	for (int i:nums)
		System.out.println(i);
	}
	
}	

}
