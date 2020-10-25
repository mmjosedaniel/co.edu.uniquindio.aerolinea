package co.uniquindio.aerollinea.persistencia;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.uniquindio.aerollinea.aplicacion.Aplicacion;
import  co.edu.uniquindio.aerollinea.model.*;
import co.edu.uniquindio.aerollinea.views.*;
import co.edu.uniquindio.aerollinea.controllers.*;

public class Persistencia {
	
	public static final String RUTA_ARCHIVO_ESTUDIANTES = "/src/admin/colegial/persistencia/resources/archivoEstudiantes.txt";
	public static final String RUTA_ARCHIVO_COLEGIOLOG = "/src/admin/colegial/persistencia/resources/ColegioLog.txt";


	/**
	 * Este metodo lee los estudiantes
	 * @param cole
	 * @throws IOException
	 */
	public static void cargarPasajeros(Aerolinea aerolinea ) throws IOException {

		aerolinea.getListaPasajeros().clear();

		Pasajero pasajero;

		ArrayList<String> contenido = ArchivoUtil.cargarArchivo(RUTA_ARCHIVO_ESTUDIANTES);

		String nombre="";
		String apellido="";
		String cedula="";
		String ciudad="";
		String telefono="";
		String fechaNacimiento="";

		String [] infoPasajero = null;

		for (String linea : contenido) {

			infoPasajero = linea.split("@@");
			nombre = infoPasajero[0];
			apellido = infoPasajero[1];
			cedula = infoPasajero[2];
			ciudad = infoPasajero[3];
			telefono = infoPasajero[4];
			fechaNacimiento = infoPasajero[5];

			pasajero = new Pasajero(nombre,apellido, cedula, ciudad, telefono,fechaNacimiento);


		}

	}

	/**
	 * Este metodo guarda los estudiantes
	 * @throws IOException
	 */
	public static void guardarPasajero(Aerolinea aerolinea) throws IOException {

		String contenido = "";


		for (Pasajero pasajero : aerolinea.getListaPasajeros()) {
			contenido += pasajero.getNombre()+"@@"+pasajero.getApellido()+"@@"+pasajero.getCedula()+"@@"+
			pasajero.getCiudad()+"@@"+pasajero.getTelefono()+"@@"+ pasajero.getFechaNacimiento()+"\n";
		}

		ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_ESTUDIANTES, contenido, true);


	}


	/**
	 * Este metodo escribe en el log
	 */
	public static void escribirLog(String notificacion, String nivel, String event) {

		ArchivoUtil.escribirEnLog(RUTA_ARCHIVO_COLEGIOLOG,nivel,event);

	}

}
