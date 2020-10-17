package co.edu.uniquindio.aerollinea.model;

public class Tiquete {
	private String codigo;
	private Pasajero pasajero;
	private Vuelo vuelo;
	
	public Tiquete(String codigo, Pasajero pasajero, Vuelo vuelo) {
		super();
		this.codigo = codigo;
		this.pasajero = pasajero;
		this.vuelo = vuelo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Pasajero getPasajero() {
		return pasajero;
	}
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	

}
