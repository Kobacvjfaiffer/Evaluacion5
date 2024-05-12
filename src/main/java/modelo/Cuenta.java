package modelo;



	public class Cuenta {
	    private double saldo;
	    private String moneda;

	    // Constructor
	    public Cuenta(double saldoInicial, String moneda) {
	        this.saldo = saldoInicial;
	        this.moneda = moneda;
	    }

	    // Método para depositar fondos
	    public void depositar(double cantidad) {
	        saldo += cantidad;
	    }

	    // Método para retirar fondos
	    public void retirar(double cantidad) {
	        if (cantidad > saldo) {
	            throw new IllegalArgumentException("Saldo insuficiente");
	        }
	        saldo -= cantidad;
	    }

	    // Método para convertir saldo a otra moneda
	    public void convertirSaldo(String nuevaMoneda, double tasaDeConversion) {
	        if (!moneda.equals(nuevaMoneda)) {
	            saldo *= tasaDeConversion;
	            moneda = nuevaMoneda;
	        }
	    }

	    // Getters y setters
	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }

	    public String getMoneda() {
	        return moneda;
	    }

	    public void setMoneda(String moneda) {
	        this.moneda = moneda;
	    }
	}


