package atencion;



public class Producto {
	
	
	


	private String nombreProducto1,nombreProducto2;	
	

	public Producto(String nombreProducto1, String nombreProducto2) {
		super();
		this.nombreProducto1 = nombreProducto1;
		this.nombreProducto2 = nombreProducto2;
	}

	public Producto(String nombreProducto1) {
		super();
		this.nombreProducto1 = nombreProducto1;
	}


	public Producto() {
		super();
	}


	public String getProductoAfectado() {
		return nombreProducto1;
	}


	public void setProductoAfectado(String nombreProducto1) {
		this.nombreProducto1 = nombreProducto1;
	}



	public String getNombreProducto2() {
		return nombreProducto2;
	}


	public void setNombreProducto2(String nombreProducto2) {
		this.nombreProducto2 = nombreProducto2;
	}
	

	@Override
	public String toString() {
		return "Producto [nombreProducto1=" + nombreProducto1 + ", nombreProducto2=" + nombreProducto2 + "]";
	}





}
