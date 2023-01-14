import java.util.*;
public class botin{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean control=false;
		while (control!=true) {
			int botin=input.nextInt();
			if(botin==0) {
				control=true;
			}else {
			int per=input.nextInt();
			int botines[]=new int [botin];
			for(int i=0;i<botines.length;i++) {
				botines[i]=input.nextInt();
			}
			int persoas[][]=new int [per][botin];
			int count=0;
			int col=0;
			int row=0;
			for(int i=0;i<botines.length;i++){
				if(count==per){
					count=0;
					col++;
					row=0;
				}
				switch (count) {
				case 0: {
					persoas[row][col]=botines[i];
					count++;
					row++;
					break;
				}
				case 1: {
					persoas[row][col]=botines[i];
					count++;
					row++;
					break;
				}
				case 2: {
					persoas[row][col]=botines[i];
					count++;
					row++;
					break;
				}
				case 3: {
					persoas[row][col]=botines[i];
					count++;
					row++;
					break;
				}
				case 4: {
					persoas[row][col]=botines[i];
					count++;
					row++;
					break;
				}
				case 5: {
					persoas[row][col]=botines[i];
					count++;
					row++;
					break;
				}
				case 6: {
					persoas[row][col]=botines[i];
					count++;
					row++;
					break;
				}
				case 7: {
					persoas[row][col]=botines[i];
					count++;
					row++;
					break;
				}
				case 8: {
					persoas[row][col]=botines[i];
					count++;
					row++;
					break;
				}
				case 9: {
					persoas[row][col]=botines[i];
					count++;
					row++;
					break;
				}
				
			}
		}
			int suma[]=new int [per];
			int i_main=0;
			for(int i=0;i<per;i++) {
				for(int i2=0;i2<persoas[0].length;i2++) {		
					suma[i_main]=suma[i_main]+persoas[i][i2];
				}	
				i_main++;
			}
			for(int i=0;i<per;i++) {
				System.out.print(suma[i]+":");
				for(int i2=0;i2<persoas[0].length;i2++) {
					if(persoas[i][i2]==0) {
						
					}else {
						System.out.print(" "+persoas[i][i2]);
					}
				}	
				System.out.println("");
			}
			System.out.println("---");
		}
		}
	}
}
