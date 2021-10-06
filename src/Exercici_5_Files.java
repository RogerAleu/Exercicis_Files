import java.io.File;
import java.io.IOException;

public class Exercici_5_Files {

	public static void main(String[] args) throws IOException {
		
		File dir = new File (".\\Exercici_11");
		
		if(!dir.exists()) {
			if(dir.mkdirs()) {
				System.out.println("El directori s'ha creat correctament.");
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				File carpeta = new File (dir+"\\exemple1.txt\\exemple2.txt");
				
				if(carpeta.createNewFile()) {
					System.out.println("Les carpetes s'han creat correctament.");
				}else {
					System.out.println("Les carpetes no s'han creat correctament.");
				}
				
			}else {
				System.out.println("El directori no s'ha creat correctament.");
			}
		}else {
			System.out.println("Aquest directori ja existeix.");
			
			File carpeta = new File (dir+"\\exemple1.txt");
			File car = new File (dir+"\\exemple2.txt");
			
			if(!carpeta.exists()) {
				carpeta.createNewFile();
				System.out.println("La carpeta exemple1 s'ha creat correctament.");
			}else {
				System.out.println("La carpeta exemple1 ja existeix.");
			}
			
			if(!car.exists()) {
				car.createNewFile();
				System.out.println("La carpeta exemple2 s'ha creat correctament.");
			}else {
				System.out.println("La carpeta exemple2 ja existeix.");
			}
		}
	}
}
