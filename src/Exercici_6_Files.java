import java.io.File;
import java.util.Scanner;

public class Exercici_6_Files {
	
	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		
		String text;
		
		System.out.print("Quina carpeta desitja borrar del seu ordenador? ");
		text = read.nextLine();
		
		File carpetaBorrar = new File ("C:\\"+text);
		
		if (!carpetaBorrar.exists()) 
		{
			System.out.println("La carpeta que ha posat no es troba en aquest ordenador.");
		}
		else if(carpetaBorrar.isFile())
		{
			System.out.println("La carpeta que ha posat és un fitxer.");
		}
		else
		{
			if(borrarCarpetes(carpetaBorrar)) {
				System.out.println("La carpeta s'ha borrat correctament.");
			}
		}
	}
	
	public static boolean borrarCarpetes (File carpeta) {
		//fem servir el boolena perque primer borri tot lo de la carpeta i no fagi accions mentres encara es realitza laltra
		boolean cert = true;
		
		File[] archivos = carpeta.listFiles();
		for (File arxiu : archivos) {
			if (arxiu.isFile()) {
				arxiu.delete();
			} else if (arxiu.isDirectory()) {
				cert = borrarCarpetes(arxiu);
			}
		}			
		if (archivos.length == 0) {
			carpeta.delete();
		}
		
	return cert;
	}

}
