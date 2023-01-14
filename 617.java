import java.awt.Frame;
import java.util.*;
public class space{
	public static void main (String [] args) {
		Scanner input=new Scanner(System.in);
		int cp=input.nextInt();
		for(int i=0;i<cp;i++){
			int cp2=input.nextInt();
			char numeros[][]=new char [cp2][3];
			for(int i2=0;i2<numeros.length;i2++){
				String pala=input.next();
				for(int i3=0;i3<numeros[0].length;i3++){
					numeros[i2][i3]=pala.charAt(i3);
				}
			}
			String maind="";
			for(int i2=0;i2<numeros[0].length;i2++){
				for(int i3=0;i3<numeros.length;i3++){
					maind+=numeros[i3][i2];
				}
			}
			System.out.println(maind);
		}
		
	}
}
