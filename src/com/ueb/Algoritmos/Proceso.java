package com.ueb.Algoritmos;

public class Proceso {
	private String nombreProceso;
	private int duracionProceso;
	private int tiempoLlegada;

	private int id;

	public Proceso(String pNombreProceso, int pDuracionProceso, int pTiempoLlegada) {
		this.nombreProceso = pNombreProceso;
		this.duracionProceso = pDuracionProceso;
		this.tiempoLlegada = pTiempoLlegada;

	}

	public String getNombreProceso() {
		return nombreProceso;
	}

	public void setNombreProceso(String nombreProceso) {
		this.nombreProceso = nombreProceso;
	}

	public int getDuracionProceso() {
		return duracionProceso;
	}

	public void setDuracionProceso(int duracionProceso) {
		this.duracionProceso = duracionProceso;
	}

	public int getTiempoLlegada() {
		return tiempoLlegada;
	}

	public void setTiempoLlegada(int tiempoLlegada) {
		this.tiempoLlegada = tiempoLlegada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
