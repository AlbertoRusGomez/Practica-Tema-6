package practica6;

/**
 * Clase Coche que contiene los atributos y métodos que lo definen.
 * @author Alberto Rus Gómez
 * @version 1.0
 */

public class Coche {
	String matricula;
	String combustible;
	String modelo;
	String fabricante;
	
	/**
	 * Constructor vacío (sin parámetros).
	 */
   
	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	/**
	 * Constructor con parámetros.
	 * @param m = matrícula
	 * @param c = combustible
	 * @param mo = modelo
	 * @param f = fabricante
	 */
	
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}
	
	/**
	 * Método por el cual obtendremos información de un objecto Coche en función del tipo de combustible que tenga.
	 * @return Devuelve un String con la matrícula, el fabricante y el modelo del coche, además del consumo del mismo.
	 */

	public String metodoCombustibleCoche() {
		String resultado = "";
		if (combustible == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " " + metodoGasolina(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += "El coche con matricula " + matricula + " " + metodoDiesel(modelo, fabricante);
		} else if (combustible == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " " + metodoHibrido(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " no dispone de información";
		}
		return resultado;
	}
	
	/**
	 * Método para obtener el gasto de un coche de gasolina.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche de gasolina.
	 */
	
	public String metodoGasolina(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + " y gasta 1,337 euros por litro.";
		return res;
	}
	
	/**
	 * Método para obtener el gasto de un coche Diesel.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche Diesel.
	 */
	
	public String metodoDiesel(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + " y gasta 1,052 euros por litro.";
		return res;
	}
	
	/**
	 * Método para obtener el gasto de un coche Híbrido.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche Híbrido.
	 */
	
	public String metodoHibrido(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + " y no necesita combustible.";
		return res;
	}
}