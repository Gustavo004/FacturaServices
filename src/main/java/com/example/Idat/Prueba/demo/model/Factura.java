package com.example.Idat.Prueba.demo.model;

public class Factura {

	private int NroFactura;
	private int IdCliente;
	private double MontoFactura;
	private String EstadoFactura;

	public Factura(int nroFactura, int idCliente, double montoFactura, String estadoFactura) {
		super();
		NroFactura = nroFactura;
		IdCliente = idCliente;
		MontoFactura = montoFactura;
		EstadoFactura = estadoFactura;
	}

	public Factura() {

	}

	public int getNroFactura() {
		return NroFactura;
	}

	public void setNroFactura(int nroFactura) {
		NroFactura = nroFactura;
	}

	public int getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}

	public double getMontoFactura() {
		return MontoFactura;
	}

	public void setMontoFactura(double montoFactura) {
		MontoFactura = montoFactura;
	}

	public String getEstadoFactura() {
		return EstadoFactura;
	}

	public void setEstadoFactura(String estadoFactura) {
		EstadoFactura = estadoFactura;
	}

	@Override
	public String toString() {
		return "Factura [NroFactura=" + NroFactura + ", IdCliente=" + IdCliente + ", MontoFactura=" + MontoFactura
				+ ", EstadoFactura=" + EstadoFactura + "]";
	}
	

}
