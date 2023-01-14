import java.util.*;
	
	import javax.sound.midi.MidiChannel;
	public class piramides{
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			int cp=input.nextInt();
			while (cp-->0) {
				int izquierda=input.nextInt();
				int medio=input.nextInt();
				int derecha=input.nextInt();
				int calc1=Math.abs(izquierda-medio);
				int calc2=Math.abs(derecha-medio);
				if(izquierda<=0 && medio>=0){
					calc1--;
				}
				if(derecha>=0 && medio<=0){
					calc2--;
				}
				if(calc1<calc2) {
					System.out.println(izquierda);
				}else if(calc2<calc1) {
					System.out.println(derecha);
				}else {
					System.out.println("EMPATE");
				}
			}
		}
	}
