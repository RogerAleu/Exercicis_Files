import java.io.File;
import java.io.IOException;

public class Exercicis_Files {

	public static void main(String[] args) throws IOException {
		//Declarar variables dels dos arxius
        
        File arxiu;
        File carpeta;
        
        //Comprovar les unitats disponibles
        for(File element: File.listRoots()){
            System.out.println(element.getAbsolutePath());
        }
        
        //Cridar constructor de la carpeta
        
        carpeta = new File(File.listRoots()[0]+"carpeta");
        
        //crear carpeta
        carpeta.mkdir();
        
        System.out.println("S'ha creat correctament");
        
        //mostrar la ruta del directori
        System.out.println("Ruta de la carpeta "+ carpeta.getAbsolutePath());
        
        //crear arxiu de text
        arxiu = new File(carpeta.getCanonicalPath()+ "\\arxiu.txt");
        
        //crear arxiu dins de la carpeta d'ubicacio
        arxiu.createNewFile();
        
        System.out.println("L'arxiu s'ha creat correctament");
        
        //mostrar la ruta de l'arxiu
        System.out.println("La ruta de l'arxiu "+ arxiu.getAbsolutePath());
    }
}

