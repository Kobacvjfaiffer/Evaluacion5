package modelo;

public class Usuario {
	
	    private String nombre;
	    private String correoElectronico;
	    private String contrasena;
	    private Cuenta cuenta;

	    // Constructor
	    public Usuario(String nombre, String correoElectronico, String contrasena, Cuenta cuenta) {
	        this.nombre = nombre;
	        this.correoElectronico = correoElectronico;
	        this.contrasena = contrasena;
	        this.cuenta = cuenta;
	    }

	    // Getters y setters
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getCorreoElectronico() {
	        return correoElectronico;
	    }

	    public void setCorreoElectronico(String correoElectronico) {
	        this.correoElectronico = correoElectronico;
	    }

	    public String getContrasena() {
	        return contrasena;
	    }

	    public void setContrasena(String contrasena) {
	        this.contrasena = contrasena;
	    }

	    public Cuenta getCuenta() {
	        return cuenta;
	    }

	    public void setCuenta(Cuenta cuenta) {
	        this.cuenta = cuenta;
	    }

	    // Otros métodos que puedan ser necesarios para la clase Usuario
	}


