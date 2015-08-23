package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
	
	private Date fecha;
	private List<CotizacionRodamiento> cotizacionesRodamiento =  new ArrayList<CotizacionRodamiento>();
	private boolean estaConfirmado;
	
}
