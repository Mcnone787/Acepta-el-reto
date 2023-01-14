import java.util.*;

public class paginas{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int cp=input.nextInt();
		for(int i=0;i<cp;i++){
			int nums=input.nextInt();
			if(nums%2==0){
				System.out.println(nums+1);
			}else {
				System.out.println(nums-1);
			}
		}
	}
}
