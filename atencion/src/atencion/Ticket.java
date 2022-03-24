package atencion;

import java.time.LocalDateTime;
import java.util.Scanner;



public class Ticket {
	//	Número de ticket
	//	La fecha y hora de la llamada
	//	Los datos del cliente (nombre, rut, teléfono y correo electrónico como mínimo)
	//	Producto afectado (fibra300, fibra600, fibra900 o Movil80G, Movil150G, Movil200G)
	//	La consulta o problema
	//	El estado (abierto, cerrado o derivado)
	//	La solución que se entregó (necesario para cerrar el ticket)
	//	Quién atendió
	//	Y el especialista a quién se derivó el problema en caso que corresponda
	
	
	//System.out.println( fechaHoraActual );	
	
		
	private LocalDateTime fechaHoraActual = LocalDateTime.now();
	private Cliente cliente;
	private Producto producto;
	private String consulta;
	private String solucion;
	private String estado;
	private Ejecutivo ejecutivo;
	private Ejecutivo especialista;
	
	
	public final static String ESTADO_ABIERTO = "ABIETO";
	public final static String ESTADO_CERRADO = "CERRADO";
	public final static String ESTADO_DERIVADO = "DERIVADO";
	
	public Ticket(String consulta,
			String solucion) {
		this.consulta = consulta;
		this.solucion = solucion;
	}


	public Ticket(LocalDateTime fechaHoraActual, Cliente cliente, Producto producto, String consulta,
			String solucion, String estado, Ejecutivo ejecutivo, Ejecutivo especialista) {
		super();
		
		this.fechaHoraActual = fechaHoraActual;
		this.cliente = cliente;
		this.producto = producto;
		this.consulta = consulta;
		this.solucion = solucion;
		this.estado = estado;
		this.ejecutivo = ejecutivo;
		this.especialista = especialista;
	}


	

	public LocalDateTime getFechaHoraActual() {
		return fechaHoraActual;
	}


	public void setFechaHoraActual(LocalDateTime fechaHoraActual) {
		this.fechaHoraActual = fechaHoraActual;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public String getConsulta() {
		return consulta;
	}


	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}


	public String getSolucion() {
		return solucion;
	}


	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Ejecutivo getEjecutivo() {
		return ejecutivo;
	}


	public void setEjecutivo(Ejecutivo ejecutivo) {
		this.ejecutivo = ejecutivo;
	}


	public Ejecutivo getEspecialista() {
		return especialista;
	}


	public void setEspecialista(Ejecutivo especialista) {
		this.especialista = especialista;
	}
	
	
	

	@Override
	public String toString() {
		return "Ticket [ fechaHoraActual=" + fechaHoraActual + ", cliente=" + cliente
				+ ", producto=" + producto + ", consulta=" + consulta + ", Solucion=" + solucion + ", estado=" + estado
				+ ", ejecutivo=" + ejecutivo + ", especialista=" + especialista + "]";
	}
	

	
	
}