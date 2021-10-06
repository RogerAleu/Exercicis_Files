import java.io.File;
import java.util.Scanner;

public class Exercici_7_Files {
	
	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		
		String text;

		System.out.print("Introduiex aquí el directori que vol llistar del seu ordenador: ");
		text = read.nextLine();
		
		File carpetaLlistar = new File ("C:\\"+text);
		
		if (!carpetaLlistar.exists()) 
		{
			System.out.println("La carpeta que ha posat no es troba en aquest ordenador.");
		}
		else if(carpetaLlistar.isFile())
		{
			System.out.println("La carpeta que ha posat és un fitxer.");
		}
		else
		{
			String[] directoris = new String [100];
			String [] fitxers = new String [100];
			int i =0;
			int cont = 0;
			
			File[] archivos = carpetaLlistar.listFiles();
			for (File arxiu : archivos) {
				if(arxiu.isDirectory()) {
					directoris[i] = arxiu.toString();
					i++;
				}else if(arxiu.isFile()) {
					fitxers[cont] = arxiu.toString();	
					cont++;
				}
			}
			
			//Arrays.sort(directoris);
			//Arrays.sort(fitxers);
			
			System.out.println("Directoris ordenats alfabèticament: ");
			for(int a = 0; a < directoris.length; a++) {
				if(directoris[a]!=null) {
					System.out.println("- "+directoris[a]);
				}
			}
			
			System.out.println();
			System.out.println("Fitxers ordenats alfabèticament: ");
			for(int a = 0; a < fitxers.length; a++) {
				if(fitxers[a]!=null) {
					System.out.println("- "+fitxers[a]);
				}
			}
		}

	}

}
