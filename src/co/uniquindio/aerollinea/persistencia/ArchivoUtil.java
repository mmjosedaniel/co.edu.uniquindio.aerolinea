package co.uniquindio.aerollinea.persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoUtil {
	
	public static ArrayList<String>cargarArchivo(String rutaArchivo)throws IOException{
		
		ArrayList<String> contenido= new ArrayList<String>();
		FileReader fileReader= new FileReader(rutaArchivo);
		BufferedReader bufferedReader = BufferedReader(fileReader);
		String linea="";
		
		while((linea=bufferedReader.readLine())!=null) {
			contenido.add(linea);
		}
		bufferedReader.close();
		fileReader.close();
		
		return contenido;
	}
	
}
