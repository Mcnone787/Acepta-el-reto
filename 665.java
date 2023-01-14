import java.lang.reflect.WildcardType;
import java.util.Scanner;
public class version{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int cp=input.nextInt(); 
		for(int i=0;i<cp;i++) {
			input.nextLine();
			String d[]=(input.next().replace(".", ",")).split(",");
			int nums1=Integer.parseInt(d[0])+1;
			int nums2=Integer.parseInt(d[1])+1;
			int nums3=Integer.parseInt(d[2])+1;
			String resulatdo=nums1+".0.0";
			String resulatdo1=(d[0])+"."+nums2+".0";
			String resulatdo2=(d[0])+"."+(d[1])+"."+nums3;
			String a2=input.next();
			if(a2.equals(resulatdo2) || a2.equals(resulatdo1) || a2.equals(resulatdo)){
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}
			
		}
	}
