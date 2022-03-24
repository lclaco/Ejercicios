package atencion;


public class Cliente {
	
	
	private String run,nombre,telefono,email;			
	private boolean solicitud = false;
		
	
	
	
	public Cliente() {
	}
	
	public Cliente(String run, String nombre, String telefono, String email,boolean solicitud) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;		 
		this.solicitud = solicitud;
	}

	public boolean isSolicitud() {
		return solicitud;
	}

	public void setSolicitud(boolean solicitud) {
		this.solicitud = solicitud;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		if (nombre.length()>=9)
            this.nombre = run;
        else
            System.out.println("El RUT debe tener el formato 1234567-8");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		 if (nombre.length()>0)
	            this.nombre = nombre;
	        else
	            System.out.println("Nombre debe tener al menos un caracter");
	}

	public String getTelefono() {
		return telefono;
		}
	

	public void setTelefono(String telefono) {
		if (telefono.length()>9)
            this.telefono = telefono;
        else
            System.out.println("El numero telefonico debe tener 9 numeros ej:977993520");
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length()>0)
            this.email = email;
        else
            System.out.println("el mail debe tener ser en el siguiente formato mail@dominio.xxx");
	}

	@Override
	public String toString() {
		return "Cliente [run=" + run + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email
				+ ", solicitud=" + solicitud + "]";
	}
	
	
	

}
