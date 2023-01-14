import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class bombilla{
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	public static void main(String [] args) {
    	FastReader input = new FastReader();
		int cp=input.nextInt();
		for(int i=0;i<cp;i++) {
			int num1=input.nextInt();
			int num2=input.nextInt();
			int num3=input.nextInt();
			if(num2*num3>num1){
				System.out.println("HORAS");
			}else if((num2*num3<num1)) {
				System.out.println("ENCENDIDOS");
			}else if((num2*num3==num1)) {
				System.out.println("AMBAS");
			}else {
				
			}
		}
	}
