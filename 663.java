import java.util.*;
public class primero{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int cp=input.nextInt(); 
		for(int i=0;i<cp;i++) {
			int a=input.nextInt();
			if(a<0){
				System.out.println(a);
			}else {
                System.out.println(a-1);
			}
		}
	}
}
