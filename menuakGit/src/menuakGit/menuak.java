package menuakGit;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class menuak {
	
	public static void print(String texto) {
		System.out.println(texto);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		Double x;
		Double y;
		String aukera;
		
		x=Double.parseDouble(JOptionPane.showInputDialog("Idatzi x-ren balioa"));
		y=Double.parseDouble(JOptionPane.showInputDialog("Idatzi y-ren balioa"));
		
		do{
			
		
			print("=======Menua======\r\n"
				+ "a) x+y \r\n"
				+ "b) x-y \r\n"
				+ "c) x*y \r\n"
				+ "d) x/y \r\n"
				+ "e) Irten");
		
			aukera=entrada.nextLine();
		
			switch(aukera) {
			
				case "a":{
							print("Erantzuna: " + (x+y) + " da");
						}break;
				
				case "b":{
							print("Erantzuna: " + (x-y) + " da");
						}break;
				
				case "c":{
							print("Erantzuna: " + (x*y) + " da");
						}break;
				
				case "d":{
							print("Erantzuna: " + (x/y) + " da");
						}break;
				
			    
			}
			
			if(!aukera.equalsIgnoreCase("a") && !aukera.equalsIgnoreCase("b")
					&& !aukera.equalsIgnoreCase("d") && !aukera.equalsIgnoreCase("c")
					&& !aukera.equalsIgnoreCase("e")) {
					print("Aukera desegokia");
				}
				
		}while(!aukera.equalsIgnoreCase("e"));
			
		

		
		print("Programa amaitu da.");	

		
	}

}
		
		

		

	

