import java.util.*;
public class polivalnete{
	public static void main(String[] atgs) {
		Scanner input=new Scanner(System.in);
		while (input.hasNext()) {
			String nums=input.next();
			long num=Long.parseLong(nums);
			int i=0;
			int length_main=nums.length();
			for(i=length_main;i>0;i--){
				if(num%i==0){
					num=(Long)num/10;
				}else {
					break;
				}
			}
			if(i==0){
				System.out.println("POLIDIVISIBLE");
			}else {
				System.out.println("NO POLIDIVISIBLE");
			}
		
			
		}	
	}
}
