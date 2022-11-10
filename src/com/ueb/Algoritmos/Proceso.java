package com.ueb.Algoritmos;

public class Proceso {
	private String nombreProceso;
	private int tiempoServicio;
	private int tiempoLlegada;
	//private int tiempoFinalizacion;

	private int id;

	public Proceso(String pNombreProceso, int pTiempoServicio, int pTiempoLlegada/*int pTiempoFinalizacion*/) {
		this.nombreProceso = pNombreProceso;
		this.tiempoServicio = pTiempoServicio;
		this.tiempoLlegada = pTiempoLlegada;
		//this.tiempoFinalizacion = pTiempoFinalizacion;
	}

	public String getNombreProceso() {
		return nombreProceso;
	}

	public void setNombreProceso(String nombreProceso) {
		this.nombreProceso = nombreProceso;
	}

	public int getDuracionProceso() {
		return tiempoServicio;
	}

	public void setDuracionProceso(int duracionProceso) {
		this.tiempoServicio = duracionProceso;
	}

	public int getTiempoLlegada() {
		return tiempoLlegada;
	}

	public void setTiempoLlegada(int tiempoLlegada) {
		this.tiempoLlegada = tiempoLlegada;
	}
	
	/*public int getTiempoFinalizacion() {
		return tiempoFinalizacion;
	}

	public void setTiempoFinalizacion(int tiempoFinalizacion) {
		this.tiempoFinalizacion = tiempoFinalizacion;
	}
	*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
