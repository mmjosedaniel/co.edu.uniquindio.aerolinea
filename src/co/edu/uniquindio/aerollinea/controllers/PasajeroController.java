package co.edu.uniquindio.aerollinea.controllers;

import co.edu.uniquindio.aerollinea.model.Aerolinea;

public class PasajeroController {
	private ModelFactoryController modelFactoryController;
    Aerolinea aerolinea;
    
    
	public PasajeroController() {
		super();
		modelFactoryController = ModelFactoryController.getInstance();
		aerolinea = modelFactoryController.getAerolinea();
	}


	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public String crearPasajero(String nombre, String apellido, String cedula,
			String ciudad, String telefono, String fechaNacimiento) {
		
	return modelFactoryController.crearPasajero(nombre, apellido, cedula, ciudad, telefono, fechaNacimiento);
			}


	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}


	public ModelFactoryController getModelFactoryController() {
		return modelFactoryController;
	}


	public void setModelFactoryController(ModelFactoryController modelFactoryController) {
		this.modelFactoryController = modelFactoryController;
	}
	
	

	
	

}
