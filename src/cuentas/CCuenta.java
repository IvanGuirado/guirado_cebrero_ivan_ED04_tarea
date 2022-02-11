package cuentas;
/**
 * 
 * @author Ivan Guirado Cebrero
 * 
 */

public class CCuenta {
//Variables de la clase CCuenta	
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipo;
//Constructores
	public CCuenta() {
	}

	/**
	 * @param nom es un String nombre
	 * @param cue es un String cuenta
	 * @param sal es double saldo
	 * @param tipo es double tipo
	 * 
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}
	//Metodo estado nos devolverá el saldo.
	/**
	 * @return saldo
	 */
	public double estado() {
		return getSaldo();
	}
	
//Metodo ingresar, la cual nos mostrara el mensaje en el caso de que sea negativo.
	/**
	 * método que permite hacer un ingreso, en el caso de que la cantidad
	 * sea negativa mostrará el mensaje de error.
	 * @param cantidad es un double
	 * @throws Exception mensaje que se mostrará cuando se cumplá el if.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}
	
	//Metodo retirar, la cual nos mostrara el mensaje en el caso de que sea negativo.
	/**
	 * método que permite hacer un retiro y siempre y cuando la cantidad sea positiva
	 * si es negativa mostrará el mensaje de error.
	 * @param cantidad double
	 * @throws Exception mensaje que se mostrará cuando se cumplá el if.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * @return String nombre
	 */
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return String cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return double saldo
	 */
	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return double tipo
	 */
	private double getTipo() {
		return tipo;
	}

	private void setTipo(double tipo) {
		this.tipo = tipo;
	}

}
