import java.util.*;
//bien pero resvisar!!
public class codigo_de_barras{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		boolean control=false;
		while (control!=true) {
			String num=input.next();
			if(num.equals("0")){
				control=true;
			}else {
				int nums[]=new int [num.length()];
				for(int i=0;i<num.length();i++){
					nums[i]=Character.getNumericValue(num.charAt(i));
				}
				int length_main=1;
				int calc=0;
				for(int i=nums.length-1-1;i>=0;i--){
					if(length_main%2==0){
						calc=calc+(nums[i]*1);
					}else if(length_main%2!=0) {
						calc=calc+(nums[i]*3);
					}
					length_main++;
				}
				if(calc%10==0){
					calc=calc+0;
				}else {
					calc=calc+nums[nums.length-1];
				}
				if(calc%10==0 && calc!=0){
					System.out.print("SI");
					if(nums.length-1>=8 && nums.length-1<=12){
						String concat_main="";
						String nums_p[]= {"0","380","50","539","560","70","759","850","890"};
						String n_p[]= {"EEUU","Bulgaria","Inglaterra","Irlanda","Portugal","Noruega","Venezuela","Cuba","India"};
						boolean control2=false;
						int p=0;
						for(int i2=0;i2<3;i2++){
							concat_main+=num.charAt(i2);
							for(int i=0;i<nums_p.length;i++){
								if(concat_main.equals(nums_p[i])){
									p=i;
									control2=true;
								}else {
								}
							}	
						}
						if(control2==true){
							System.out.print(" "+n_p[p]);
						}else {
							System.out.print(" Desconocido");
						}
					}
				}if(calc%10!=0 || calc==0){
					System.out.print("NO");
				}
				System.out.println();
			}
			
		}
	}
}
