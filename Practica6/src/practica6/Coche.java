package practica6;

/**
 * Clase Coche que contiene los atributos y m�todos que lo definen.
 * @author Alberto Rus G�mez
 * @version 1.0
 */

public class Coche {
	public static final String COCHE_MATRICULA = "El coche con matricula ";

	private static final String GASTO_HIBRIDO = " y no necesita combustible.";

	public static final String GASTO_DIESEL = " y gasta 1,052 euros por litro.";

	public static final String GASTO_GASOLINA = " y gasta 1,337 euros por litro.";

	
	String matricula;
	String combustible;
	String modelo;
	String fabricante;
	
	/**
	 * Constructor vac�o (sin par�metros).
	 */
   
	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	/**
	 * Constructor con par�metros.
	 * @param m = matr�cula
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
	 * M�todo por el cual obtendremos informaci�n de un objecto Coche en funci�n del tipo de combustible que tenga.
	 * @return Devuelve un String con la matr�cula, el fabricante y el modelo del coche, adem�s del consumo del mismo.
	 */

	public String metodoCombustibleCoche() {
		String resultado = "";
		if (combustible == "Gasolina") {
			resultado += COCHE_MATRICULA + " " + matricula + " " + metodoGasolina(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += COCHE_MATRICULA + " " + matricula + " " + metodoDiesel(modelo, fabricante);
		} else if (combustible == "H�brido") {
			resultado += COCHE_MATRICULA + " " + matricula + " " + metodoHibrido(modelo, fabricante);
		} else {
			resultado += COCHE_MATRICULA + " " + matricula + " no dispone de informaci�n";
		}
		return resultado;
	}
	
	/**
	 * M�todo para obtener el gasto de un coche de gasolina.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche de gasolina.
	 */
	
	public String metodoGasolina(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + GASTO_GASOLINA;
		return res;
	}
	
	/**
	 * M�todo para obtener el gasto de un coche Diesel.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche Diesel.
	 */
	
	public String metodoDiesel(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + GASTO_DIESEL;
		return res;
	}
	
	/**
	 * M�todo para obtener el gasto de un coche H�brido.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche H�brido.
	 */
	
	public String metodoHibrido(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + GASTO_HIBRIDO;
		return res;
	}
}