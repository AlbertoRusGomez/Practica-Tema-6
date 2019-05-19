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
}