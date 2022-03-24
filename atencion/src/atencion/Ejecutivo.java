package atencion;



public class Ejecutivo {
	
	


	private String run,nombre,email,tipo,especialidad;	
	

	public Ejecutivo() {
		super();
	}


	public Ejecutivo(String run, String nombre, String email, String tipo, String especialidad) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.email = email;
		this.tipo = tipo;
		this.especialidad = especialidad;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		if (email.length()>0)
            this.email = email;
        else
            System.out.println("el mail debe tener ser en el siguiente formato mail@dominio.xxx");
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		if (tipo.length()>0)
            this.tipo = tipo;
        else
            System.out.println("El tipo de Ejecutivo debe tener al menos un caracter");
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Ejecutivo [run=" + run + ", nombre=" + nombre + ", email=" + email + ", tipo=" + tipo
				+ ", especialidad=" + especialidad + "]";
	}
	
	
	
}
