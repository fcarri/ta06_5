package project6;

import java.util.*;

public class ta06_5 {
	public static void main(String args[]){
		
		int nombre;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nombre: ");
		nombre = sc.nextInt();
		System.out.print("Nombre "+nombre+" en binari = "+binari(nombre));
		
		sc.close();
		
	}
	
	public static String binari(int nombre) {
		
		String bin = "";
		
		//array per al nombre binari
		int[] binari = new int[1000];
		
		int n = 0;
		//es guarda el rest de la divisió
	    while (nombre > 0) {
	        	            
	            binari[n] = nombre % 2;
	            nombre = nombre / 2;
	            //System.out.print(binari[n]);
	            n = n + 1;	            	            
	    }
	    
	    //array amb nomes els digits necesaris
	    int[] binari2 = new int[n];
	    
	    int t = 0;
	    //es llegeix array del final al principi
	    for (int k = n - 1; k >= 0; k--) {	    	
	    		    	
	    	binari2[t] = binari[k];
	    	//System.out.println(binari2[k]);	
	    	t++;
	    	
        }
	   	 	    
	    bin = Arrays.toString(binari2).replaceAll("\\[|\\]|,|\\s", "");
	    //System.out.println(bin);
	    
		return bin;
	}
}
