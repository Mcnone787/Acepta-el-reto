import java.util.Scanner;
public class galibo{
	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] < arr[j] && arr[j]!=0){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }
	static void bubbleSort2(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j] && arr[j]!=0){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean control=false;
		while (control!=true) {
			int cp=input.nextInt();
			if(cp==0) {
				control=true;
			}else {

				int i_main=0;
				int nums[]=new int[100];
				for(int i=0;i<cp;i++) {
					int nums3=input.nextInt();
					int galibos[]=new int [nums3];
					for(int i2=0;i2<galibos.length;i2++){
						galibos[i2]=input.nextInt();	
					}
					bubbleSort(galibos);
					nums[i_main]=galibos[0];
					i_main++;
				}
				bubbleSort(nums);
				bubbleSort2(nums);
				System.out.println(nums[0]);
			}
			
		}
		
	}
}
