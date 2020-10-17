package co.edu.uniquindio.aerollinea.model;

public class Vuelo {
	private String numeroVuelo,ciudadDestino,fechaRegreso,fechaSalida;

	public Vuelo(String numeroVuelo, String ciudadDestino, String fechaRegreso, String fechaSalida) {
		super();
		this.numeroVuelo = numeroVuelo;
		this.ciudadDestino = ciudadDestino;
		this.fechaRegreso = fechaRegreso;
		this.fechaSalida = fechaSalida;
	}

	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public String getFechaRegreso() {
		return fechaRegreso;
	}

	public void setFechaRegreso(String fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	
	

}
