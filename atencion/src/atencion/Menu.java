package atencion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private static ArrayList<Ejecutivo> ejecutivos = new ArrayList<>();
	private static ArrayList<Producto> productos = new ArrayList<>();
	private static ArrayList<Ticket> tickets = new ArrayList<>();
	
	
	public final static int OPCION_MENU_CREARCLIENTE = 1;
	public final static int OPCION_MENU_CARGAR_DATOS = 2;
	public final static int OPCION_MENU_VERCLIENTE = 3;
	public final static int OPCION_MENU_BUSCARCLIENTE = 4;
	public final static int OPCION_MENU_VERESPECIALISTA = 5;
	public final static int OPCION_MENU_VERESTADO = 6;
	public final static int OPCION_MENU_GENERARTICKET = 7;
	public final static int OPCION_MENU_IMPRIMIR = 8;
	public final static int OPCION_MENU_SALIR = 9;
	
	
	public static void main(String[] args) {
		int opcionSeleccionada;
		do {
			opcionSeleccionada = menu();
			switch (opcionSeleccionada) {
			case OPCION_MENU_CREARCLIENTE:
				crearCliente();
				break;
			case OPCION_MENU_CARGAR_DATOS:
				cargarDatos();
				break;	
			case OPCION_MENU_VERCLIENTE:
				verCliente();
				break;
			case OPCION_MENU_BUSCARCLIENTE:
				buscarCliente();
				break;
			case OPCION_MENU_VERESPECIALISTA:
				verEjecutivo();
				break;
			case OPCION_MENU_VERESTADO:
				verEstado();
				break;
			case OPCION_MENU_GENERARTICKET:
				agregarInformacion();
				break;
			case OPCION_MENU_IMPRIMIR:
				imprimirTicket();
				break;
			}
			
		} while (opcionSeleccionada != OPCION_MENU_SALIR);
		
		System.out.printf("Seleccionó la opción %d", opcionSeleccionada);
	}

	private static void cargarDatos() {
		clientes.add(new Cliente("12312312-1", "Juan Perez", "123456789", "Juan@Juan.com",false));
		clientes.add(new Cliente("12312312-2", "Raul Perez", "123456789", "Raul@Raul.com",true));
		clientes.add(new Cliente("12312312-3", "Pedro Perez", "123456789", "Pedro@Pedro.com",false));
		clientes.add(new Cliente("12312312-4", "Carlos Perez", "123456789", "Carlos@Carlos.com",false));
		clientes.add(new Cliente("12312312-5", "José Perez", "123456789", "Jose@Jose.com",true));
		
		
	    productos.add(new Producto("fibra300")); 
		productos.add(new Producto("fibra600")); 
		productos.add(new Producto("fibra900 o Movil80G"));
		productos.add(new Producto("Movil150G")); 
		productos.add( new Producto("Movil200G"));
		 
		 
		ejecutivos.add(new Ejecutivo("22312312-1", "Juan Perez","Juan@Juan.com","atencion","soporte tecnico N1"));
		ejecutivos.add(new Ejecutivo("22312312-2", "Raul Perez", "Raul@Raul.com","back office","soporte tecnico N2"));
		ejecutivos.add(new Ejecutivo("22312312-3", "Pedro Perez", "Pedro@Pedro.com","redes","tecnico en redes"));
		ejecutivos.add(new Ejecutivo("22312312-4", "Carlos Perez", "Carlos@Carlos.com","redes externas","tecnico en redes"));
		ejecutivos.add(new Ejecutivo("22312312-5", "José Perez", "Jose@Jose.com","supervisor planta","ing redes"));
		
	}

	private static int menu() {
		System.out.println("----------------------- \n *MENU SERVICIO AL CLIENTE * \n-----------------------");
		System.out.println("1. CREAR CLIENTE");
		System.out.println("2. CARGAR DATOS");
		System.out.println("3. VER CLIENTE");
		System.out.println("4. BUSCAR CLIENTE");
		System.out.println("5. VER ESPECIALISTAS");
		System.out.println("6. VER ESTADO DE SOLICITUD");
		System.out.println("7. LLENAR TICKET");
		System.out.println("8. IMPRIMIR TICKET");
		System.out.println("9. EXIT");
		
		System.out.println("\n-------------------------------- \n *POR FAVOR DIGITE UNA OPCIÓN* \n--------------------------------");
		
		Scanner scanner = new Scanner( System.in);		
		int opcionSeleccionada = scanner.nextInt();
		
		return opcionSeleccionada;
		
	}

	private static void imprimirTicket() {
		Ticket ticket = new Ticket(null, null);
		Cliente cliente = new Cliente();
		Producto producto = new Producto();
		String uuidStr=java.util.UUID.randomUUID().toString().replace("-", "");
		
		buscarCliente();
		buscarEjecutivo();
		generarConsulta();
		
		
		System.out.println("************************\n");
		System.out.println("   TICKET DE ATENCION   \n");
		System.out.println("************************\n");
		System.out.println("ID de Atencion:  "+uuidStr);
		System.out.println("Fecha :"+ticket.getFechaHoraActual());
		System.out.println("Consulta : /t Solucion : ");
		for(Ticket ticket2: tickets) {
			System.out.printf("%s /t %s "
			,ticket2.getConsulta()
			,ticket2.getSolucion()
			);
		}
		System.out.printf("%n%n");
		

		// public Ticket(int numeroTicket, LocalDateTime fechaHoraActual, Cliente cliente, Producto producto, String consulta,
		//String solucion, String estado, Ejecutivo ejecutivo, Ejecutivo especialista)
		/*
		 * System.out.println("ingrese el RUN del cliente"); Scanner scanner = new
		 * Scanner(System.in); String run = scanner.nextLine(); for(Cliente cliente1 :
		 * clientes) { if (cliente1.getRun().equalsIgnoreCase(run)) {
		 * System.out.println("ingrese el RUN del Ejecutivo que lo atiende"); Scanner
		 * scanner2 = new Scanner(System.in); String runEjecutivo = scanner2.nextLine();
		 * for(Ejecutivo ejecutivo1 : ejecutivos) { if
		 * (ejecutivo1.getRun().equalsIgnoreCase(run)) {
		 * 
		 * } }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }else {System.out.println("el cliente no existe"); } }
		 */
}
	private static void agregarInformacion() {
		// public Ticket(int numeroTicket, LocalDateTime fechaHoraActual, Cliente cliente, Producto producto, String consulta,
		//String solucion, String estado, Ejecutivo ejecutivo, Ejecutivo especialista)
		
	}

	private static void verEstado() {
		// public Ticket(int numeroTicket, LocalDateTime fechaHoraActual, Cliente cliente, Producto producto, String consulta,
		//String solucion, String estado, Ejecutivo ejecutivo, Ejecutivo especialista)
		System.out.println("ingrese el RUN del cliente");
		Scanner scanner = new Scanner(System.in);
		String run = scanner.nextLine();
		for(Cliente cliente1 : clientes) {
			if (cliente1.getRun().equalsIgnoreCase(run)) {
				System.out.printf("\n-------------------------------- \n Tiene Casos Abiertos: %b%n \n \n",cliente1.isSolicitud());
			}
		}
		
		System.out.println("cliente no existe");;
	}

	

	
	//CLIENTE
	//Cliente(String run, String nombre, String telefono, String email,boolean solicitud ==false)
	
	private static void crearCliente() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el RUN del cliente");
		String rutCliente = scanner.nextLine();
		
		System.out.println("Por favor ingrese el Nombre del cliente");
		String nombreCliente = scanner.nextLine();
			
		System.out.println("Por favor ingrese el Telefóno del cliente");
		int telefonoCliente = scanner.nextInt();
		
		System.out.println("Por favor ingrese el Mail del cliente");
		String emailCliente = scanner.nextLine();
		
		
		
		Cliente nuevoCliente = new Cliente ();
		clientes.add(nuevoCliente);
	}
	
	private static void verCliente() {
		for (Cliente cliente1 : clientes) {
			System.out.printf("\n-------------------------------- \n Run: %s Nombre: %s Telefóno: %s Mail: %s Casos Abiertos: %b%n \n \n",cliente1.getRun(), cliente1.getNombre(),cliente1.getTelefono(), cliente1.getEmail(), cliente1.isSolicitud());
		}
		
	}
	
	private static Cliente buscarCliente() {
		System.out.println("ingrese el RUN del cliente");
		Scanner scanner = new Scanner(System.in);
		String run = scanner.nextLine();
		
		for(Cliente cliente1 : clientes) {
			if (cliente1.getRun().equalsIgnoreCase(run)) {

				System.out.printf("\n-------------------------------- \n Run: %s Nombre: %s Telefóno: %s Mail: %s Casos Abiertos: %b%n \n \n",cliente1.getRun(), cliente1.getNombre(),cliente1.getTelefono(), cliente1.getEmail(), cliente1.isSolicitud());
			}
		}
		
		return null;
		
	}
	
	
	
	//EJECUTIVO
	//Ejecutivo(String run, String nombre, String email, String tipo, String especialidad)
	
	private static void crearEjecutivo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el RUN del ejecutivo");
		String rutEjecutivo = scanner.nextLine();
		
		System.out.println("Por favor ingrese el Nombre del ejecutivo");
		String nombreEjecutivo = scanner.nextLine();
		
		System.out.println("Por favor ingrese el mail del ejecutivo");
		String emailEjecutivo = scanner.nextLine();
		
		System.out.println("Por favor ingrese el cargo del ejecutivo");
		String tipoEjecutivo = scanner.nextLine();
		
		System.out.println("Por favor ingrese la especialidad del ejecutivo");
		String especialidadEjecutivo = scanner.nextLine();
		
		Ejecutivo nuevoEjecutivo = new Ejecutivo ();
		ejecutivos.add(nuevoEjecutivo);
		
	}	
	
	private static void verEjecutivo() {
		for (Ejecutivo ejecutivo1 : ejecutivos) {
			System.out.printf("\n-------------------------------- \n Run: %s Nombre: %s Mail: %s Tipo de Ejecutivo: %s Especialidad: %s \n \n", ejecutivo1.getRun(), ejecutivo1.getNombre(), ejecutivo1.getEmail(), ejecutivo1.getTipo(), ejecutivo1.getEspecialidad());
		}
		
	}
	
	private static Ejecutivo buscarEjecutivo() {		
		System.out.println("ingrese el RUN del Ejecutivo");
		Scanner scanner = new Scanner(System.in);
		String run = scanner.nextLine();
		
		for(Ejecutivo ejecutivo1 : ejecutivos) {
			if (ejecutivo1.getRun().equalsIgnoreCase(run)) {
				System.out.printf("\n-------------------------------- \n Run: %s Nombre: %s Mail: %s Tipo de Ejecutivo: %s Especialidad: %s \n \n", ejecutivo1.getRun(), ejecutivo1.getNombre(), ejecutivo1.getEmail(), ejecutivo1.getTipo(), ejecutivo1.getEspecialidad());
			}
		}
		
		return null;
		
	}
	
	
	
	private static void generarConsulta() {
		
		System.out.println("escriba la consulta del cliente");
		Scanner scanner = new Scanner( System.in);
		String consulta = scanner.nextLine();
		
		System.out.println("escriba la solucion al problema");		
		String solucion = scanner.nextLine();
		
		Ticket ticketNuevo = new Ticket(consulta,solucion);
		tickets.add(ticketNuevo);
		
		
	}
	
	
}
