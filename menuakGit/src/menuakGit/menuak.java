package menuakGit;
import java.util.Scanner;

public class menuak {
	
	public static void x_y() {
		Scanner entrada=new Scanner(System.in);
		Double x;
		Double y;
		print("Idatzi x ren balioa");
		x=entrada.nextDouble();
		print("Idatzi y ren balioa");
		y=entrada.nextDouble();
		print("Erantzuna: " + (x+y) + " da");
	}
	
	public static void print(String texto) {
		System.out.println(texto);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		Double x;
		Double y;
		String aukera;
		
		do{
					
			print("=======Menua======\r\n"
				+ "a) x+y \r\n"
				+ "b) x-y \r\n"
				+ "c) x*y \r\n"
				+ "d) x/y \r\n"
				+ "e) z! \r\n"
				+ "f) Irten");
			
		
			aukera=entrada.next();
		
			switch(aukera){
			
				case "a":{ 
							print("Idatzi x ren balioa");
							x=entrada.nextDouble();
							print("Idatzi y ren balioa");
							y=entrada.nextDouble();
							print("Erantzuna: " + (x+y) + " da");
						}break;
				
				case "b":{
							print("Idatzi x ren balioa");
							x=entrada.nextDouble();
							print("Idatzi y ren balioa");
							y=entrada.nextDouble();
							print("Erantzuna: " + (x-y) + " da");
						}break;
				
				case "c":{
							print("Idatzi x ren balioa");
							x=entrada.nextDouble();
							print("Idatzi y ren balioa");
							y=entrada.nextDouble();
							print("Erantzuna: " + (x*y) + " da");
						}break;
				
				case "d":{
							print("Idatzi x ren balioa");
							x=entrada.nextDouble();
							print("Idatzi y ren balioa");
							y=entrada.nextDouble();
							print("Erantzuna: " + (x/y) + " da");
						}break;
						
				case "e":{  int fact=1;
							print("Idatzi z-ren balioa");
				    		int z=entrada.nextInt();
				    		for(int i=2; i<=z;i++) {
				    			fact=fact*i;
				    		}
				    		if(z>=0) {
				    			print("Erantzuna: " + (fact) + " da");
				    		}else print("Ezin da zenbaki negatibo baten faktoriala kalkulatu");
							
						}break;
				
				default:{
							if(!aukera.equalsIgnoreCase("f")) {
								print("Aukera desegokia");
							}
							
						}break;
			    
			}			

				
		}while(!aukera.equalsIgnoreCase("f"));
				
		print("Programa amaitu da.");		
	}

}
