import java.util.*;
public class dicionario_main{
		public static void main(String [] args) {
			Scanner input=new Scanner(System.in);
			int count=0;
			boolean control=false;
			while (control!=true) {
				int tiempo_a_tardar=input.nextInt();
				if(tiempo_a_tardar==0) {
					control=true;
				}else {
					input.nextLine();
					String[] prueba=input.nextLine().split(" ");
					int length_main=prueba.length-1;
					for(int i =0;i<=length_main;i++) {
						int pruebas222=Integer.parseInt(prueba[i]);
							for(int i2=1;i2<=pruebas222;i2++) {
								count=count+tiempo_a_tardar;
							}
					}
						int s=count;
						int seg1=s%60;
						int m=((s/60)%60);
						int h=((s/60)/60);
						String seg=seg1+"";
						String mints=m+":";
						String hors=h+":";
						if(seg1<=9) {
						seg="0"+seg;
						}
						if(m<=9) {
						mints="0"+mints;
						}
						if(h<=9) {
						hors="0"+hors;
						}
						System.out.println(hors+mints+seg);
					count=0;
				}
			}
	}

}
