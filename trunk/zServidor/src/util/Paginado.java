package util;

public class Paginado {
	static int desde;
	static int maximo;
	
	public static int getDesde() {
		return desde;
	}

	public static void setDesde(int desde) {
		Paginado.desde = desde;
	}

	public static int getMaximo() {
		return maximo;
	}

	public static void setMaximo(int maximo) {
		Paginado.maximo = maximo;
	}
	
}
