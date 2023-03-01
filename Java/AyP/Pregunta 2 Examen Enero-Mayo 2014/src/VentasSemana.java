/* David López	CU: 173993
 * Pregunta 2
 * 22/04/2018
 */
public class VentasSemana {
	private String mes;
	private int numSemana;
	private Dia [] dias;
	private int diasTranscurridos;
	private final int MAX = 7;
	
	public VentasSemana(){
		this.diasTranscurridos = 0;
		this.dias = new Dia [MAX];
	}
	
	public VentasSemana(String mes, int numSemana){
		this();
		this.mes = mes;
		this.numSemana = numSemana;
	}
	
	public boolean altaDia (int num, int numV1, double monto1, int numV2, double monto2){
		boolean resp = false;
		Dia a;
		
		if(diasTranscurridos<MAX){
			a = new Dia(num, numV1, monto1, numV2, monto2);
			dias[diasTranscurridos] = a;
			resp = true;
			diasTranscurridos++;
		}
		return resp;
	}
	
	private double promedioProducto (int producto){
		double resp = 0;
		
		for (int i=0;i<diasTranscurridos;i++){
			if(producto==1){
				resp+=(dias[i].getNumVentas1());	
			}
			else{
				resp+=(dias[i].getNumVentas2());
			}
		}
		resp/=diasTranscurridos;
		return resp;
	}
	
	private int cuantosDiasMayor(int producto){
		int resp = 0;
		
		for (int i=0;i<diasTranscurridos;i++){
			if (producto == 1){
				if(dias[i].getNumVentas1()>dias[i].getNumVentas2())
					resp++;
			}
			else{
				if(dias[i].getNumVentas1()<dias[i].getNumVentas2())
					resp++;
			}
		}
		return resp;
	}
	
	private String diasBuenos(){
		StringBuilder cad = new StringBuilder ();
		
		for (int i=0;i<diasTranscurridos;i++){
			if(dias[i].getMontoProd1()+dias[i].getMontoProd2()<10000)
				cad.append("\n" + dias[i].toString());
		}
		return cad.toString();
	}
	
	
	

}
