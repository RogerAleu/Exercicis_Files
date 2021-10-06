import java.io.File;

public class Exercici_1_Files {

	public static void main(String[] args) {
		
		File arxiu = new File ("\\carpeta\\arxiu.txt");
		
		System.out.println("El nom de l'arxiu �s: "+ arxiu.getName());
		System.out.println("La ruta de l'arxiu �s: "+ arxiu.getPath());
		System.out.println("La ruta absoluta de l'arxiu �s: "+ arxiu.getAbsolutePath());
		System.out.println("Es pot llegir? "+ arxiu.canRead());
		System.out.println("Es pot escriure? "+ arxiu.canWrite());
		System.out.println("El tamany de l'arxiu �s: "+ arxiu.length());
		System.out.println("Es un arxiu? "+ arxiu.isFile());
		System.out.println("Es un directori? "+ arxiu.isDirectory());	

	}

}
