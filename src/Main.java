
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("lm.txt");
		FileInputStream fs = new FileInputStream(file);
        InputStreamReader in = new InputStreamReader(fs);
        BufferedReader br = new BufferedReader(in);
          
        String radek;
          
        int pocetSlov = 0;
       
        int pocetMezer = 0;
          
       
        while((radek = br.readLine()) != null)
        {
        	
        	if(radek.equals("") == false) {

        	String[] slova = radek.split("\\ ");
        	pocetSlov += slova.length;
        	
        	for(int a=0; a<radek.length(); a++) {
        		
        		if(radek.charAt(a)== ' ') {
        			pocetMezer++;
        			}
        		}
        	
        	}
        }
        
       
        System.out.println("Počet slov = " +pocetSlov);
        System.out.println("Počet mezer = " +pocetMezer);

   	}
  
}


