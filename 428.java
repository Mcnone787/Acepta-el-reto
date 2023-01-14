import java.awt.GraphicsConfiguration;
import java.util.*;
public class padawnas{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int nums=input.nextInt();
		boolean control=false;
		String d="";
		int guard=1;
		for(int i=0;i<nums;i++){
			int nums2=input.nextInt();
			while (control!=true) {
				
				if(nums2==0){
					control=true;
				}else {
					d=d+""+nums2%5+"";
					nums2=(int)nums2/5;
					guard=(int)nums2/5;
				
				}
			}
			int count=0;
			for(int i2=0;i2<d.length();i2++ ) {
				if(d.charAt(i2)=='4'){
					count++;
				}
			}
			if(count>=2){
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
			control=false;
			d="";
		}
	}
}
