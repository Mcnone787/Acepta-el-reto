import java.util.Scanner;

public class bar {
    static void bubbleSort(Double [] arr) {  
        double n = arr.length;  
        double temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] < arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    static void Marray(Double [] arr){
        System.out.println("-----------");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("-----------");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean control=false;
        while(control!=true){
            Double dias[]=new Double [6];
            Double nums[]=new Double [6];
            int count=0;
            Double calc=0.0;
            for(int i=0;i<dias.length;i++){
                double numsCojidos=Double.parseDouble(input.next());
                dias[i]=numsCojidos;
                nums[i]=numsCojidos;
                count++;
                calc=calc+numsCojidos;
            }
            double media=calc/count;
            if(dias[0]==-1){
                control=true;
            }else{
                bubbleSort(dias);
                double masmenos[]=new double[2];
                masmenos[0]=dias[0];
                masmenos[1]=dias[dias.length-1];
                String dia1=""+masmenos[0];
                String dia2=""+masmenos[1];
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==Double.parseDouble(dia1)){
                        dia1=i+"";
                    }
                    if(nums[i]==Double.parseDouble(dia2)){
                        dia2=i+"";
                    }
                }
                switch(dia1){
                    case "0":
                        dia1="MARTES";
                    break;
                    case "1":
                        dia1="MIERCOLES";
                    break;
                    case "2":
                        dia1="JUEVES";
                    break;
                    case "3":
                        dia1="VIERNES";
                    break;
                    case "4":
                        dia1="SABADO";
                    break;
                    case "5":
                        dia1="DOMINGO";
                    break;
                }
                switch(dia2){
                    case "0":
                        dia2="MARTES";
                    break;
                    case "1":
                        dia2="MIERCOLES";
                    break;
                    case "2":
                        dia2="JUEVES";
                    break;
                    case "3":
                        dia2="VIERNES";
                    break;
                    case "4":
                        dia2="SABADO";
                    break;
                    case "5":
                        dia2="DOMINGO";
                    break;
                }
                if(dia1==dia2){
                    System.out.print("EMPATE"+" ");
                }else{
                    System.out.print(dia1+" "+dia2+" ");
                }
                if(nums[nums.length-1]>media){
                    System.out.print("SI");
                }else{
                    System.out.print("NO");
                }
                System.err.println("");
            }
        }
    }
}
