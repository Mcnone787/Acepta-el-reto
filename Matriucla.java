import java.util.Scanner;

public class matriucla_  {    
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int cp=input.nextInt();
        while(cp-->0){
            input.nextLine();
            seguentMatricula();
        }

    }
    static void seguentMatricula (){
        String matricula=input.nextLine();
        int MNun=Integer.parseInt(matricula.split(" ")[0]);
        char Mletras[]=matricula.split(" ")[1].toCharArray();
        
        if(MNun<9999){

            MNun++;
            System.out.println(MNun+" "+Mletras[0]+" "+Mletras[1]+" "+Mletras[2]);
        }else{

            System.out.println(MNun+" "+Letras(Mletras));
        }
    }
    static String Letras(char[] Mletras){

        if(ComrpovarZEtc(Mletras)==0){

            Mletras[Mletras.length-1]=BuscarLetras(Mletras);
        }else if(ComrpovarZEtc(Mletras)==1){

            Mletras[Mletras.length-1]='b';
            Mletras[Mletras.length-2]=BuscarLetras(Mletras);
        }else if(ComrpovarZEtc(Mletras)==2){

            Mletras[Mletras.length-1]='b';
            Mletras[Mletras.length-2]='b';
        }

        return Mletras[0]+""+Mletras[1]+""+Mletras[2];
    }

    static char BuscarLetras (char[] Mletras){

        char MLDispo[]={
            'b','c','d','f','g','h','j','k',
            'l','m','n','p','q','r','s','t','v',
            'w','x','y','z'
        };
        int i_main=Mletras.length-1;
        int i2_main=0;
        boolean LEncontr=false;
        
        if(Mletras[2]=='b'){
            i_main--;
        }   
        
        while(LEncontr!=true){
            while(LEncontr!=true){
                if(Mletras[i_main]==MLDispo[i2_main]){                       
                    return MLDispo[i2_main+1];
                }
                i2_main++;
            }
            i_main--;
        }
        return 0;
        }
    /*
        Leyenda:
            0: no ha encontrado ninguna 'z' (es decir en la posicion [1] y [2] =  ddd)
            1:solo ha encontrado 1 'z' (es decir en la posicon [2]=dd-->z<--)
            2: ha encontrado 2 'z' (es decir en la posicon [1] y [2]= d-->z<-- -->z<--)

     */
    static int ComrpovarZEtc(char[] Mletras){

        if(Mletras[2]=='z'){
            if(Mletras[1]=='z'){
                return 2;
            }else {
              return 1;
            }
        }else{
           return 0;
        }

    }
}
