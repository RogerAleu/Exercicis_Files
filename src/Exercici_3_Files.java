import java.io.File;

public class Exercici_3_Files {

	public static void main(String[] args) {
		
		File carpeta = new File (".");
		int cont = 0;
		
		File [] llistat = carpeta.listFiles();
		
		if (llistat == null || llistat.length == 0) {
			System.out.println("No hi ha arxius dins d'aquest directori.");
			return;
		}else {
			for (int i = 0; i<llistat.length; i++) {
				
				if(llistat[i].isDirectory()) {
					System.out.println("L'arxiu " + llistat[i] + " és un directori.");
					cont++;
				}else if(llistat[i].isFile()){
					System.out.println("L'arxiu " + llistat[i] + " és un arxiu.");
					cont++;
				}
				
			}
		System.out.println("El nombre total d'arxius d'aquest directori és " + cont+".");
		}

	}

}
