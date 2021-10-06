import java.io.File;
import java.util.Scanner;

public class Exercici_4_Files {
	
	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Benvingut al programa per llistar els arxisu de una carpeta en concret");
		System.out.println("Introdueixi aquí el directori que desitja revisar: ");
		
		String nom = read.nextLine();
		
		File carpeta = new File ("C:\\"+nom);
		
		Boolean cert = carpeta.exists();
		
		if(!cert) {
			System.out.println("Aquest directori no existeix, no es troba entre els teus fitxers.");
		}else if(carpeta.isFile()) {
			System.out.println("Aquest nom correspon a un arxiu i no un directori.");
		}else {
			
			File [] carpetes = carpeta.listFiles();
			
			System.out.println("Arxius:");
			for(File car: carpetes) {
				System.out.println("- "+ car);
			}
			
		}
	}

}
