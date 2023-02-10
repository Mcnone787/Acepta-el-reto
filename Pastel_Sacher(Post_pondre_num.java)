import java.util.*;
public class pastel {
    static Scanner input=new Scanner(System.in);
    public static void main(String [] args){
        int cp=input.nextInt();
        rajoles(cp);
    }
    static void rajoles (int cp){
        for(int i=0;i<cp;i++){
           System.out.println(CalcRajol());
        }
    }
    static int CalcRajol(){
        int numeros[]=new int[3];
        numeros[0]=input.nextInt();
        numeros[1]=input.nextInt();
        numeros[2]=input.nextInt();
        int calc=numeros[0]*numeros[1];
        int i_main=1;
        return EncontrarMin(calc, i_main,numeros[2]);
    }
    static int EncontrarMin(int calc,int i_main,int llegar){
        if(calc>=llegar){
            return i_main;
        }else{
            i_main=i_main+1;
            calc=calc+calc;
            return EncontrarMin(calc, i_main,llegar);
        }
     
    }
}
