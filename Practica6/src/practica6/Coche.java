package practica6;

public class Coche {
	String matricula;
	String combustible;
	String modelo;
	String fabricante;
   
	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}


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
	
	public String metodoGasolina(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + " y gasta 1,337 euros por litro.";
		return res;
	}
	
	public String metodoDiesel(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + " y gasta 1,052 euros por litro.";
		return res;
	}

	public String metodoHibrido(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + " y no necesita combustible.";
		return res;
	}
}