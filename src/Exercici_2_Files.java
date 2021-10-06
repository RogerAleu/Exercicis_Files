import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Exercici_2_Files {

	public static void main(String[] args) {	
		
		//Creo file de la carpeta d'origen
		File rr = new File("C:\\carpeta\\RogerAleu.txt");
		
		//variable long amb la ultima modificacio
		long lastModified = rr.lastModified();
		//determino en un string el format de la data
		String pattern = "yyyy-MM-dd hh:mm aa";
		//amb la classe SimpleDataFormat estableixo el format que vull
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		//Creo un objecte de la classe Date amb la data de la ultima modificacio
		Date lastModifiedDate = new Date( lastModified );
		
		System.out.println("L'ultima data de modificació ha sigut: "+ simpleDateFormat.format( lastModifiedDate ));
		
		Path origen = Path.of("C:\\carpeta\\RogerAleu.txt");
		Path desti = Path.of("C:\\Documents\\ExerciciOliver");
		
		try {
			Path mover = Files.move(origen, desti.resolve(origen.getFileName()), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("L'arxiu "+ mover + " s'ha mogut correctament al directori ExercicisOliver a Documents.");
		}catch (IOException ex) {
			System.err.println(ex);
		}
		
		File carFinal = new File("RogerAleu.txt");
		System.out.println("La ruta absoluta de l'arxiu és: "+ carFinal.getAbsolutePath());
		
	}

}
