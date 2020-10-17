package co.edu.uniquindio.aerollinea.model.services;

public interface IModelFactoryServices {
	
	public String crearPasajero(String nombre, String apellido, String cedula,
			String ciudad, String telefono, String fechaNacimiento);


    public boolean eliminarPasajero(String nombre, String apellido, String cedula,
		String ciudad, String telefono, String fechaNacimiento);
}