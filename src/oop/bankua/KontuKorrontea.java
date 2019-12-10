package oop.bankua;

public class KontuKorrontea {

	//atributuak
	private String kontuZenbakia;
	private String titularIzena;
	private double saldoa;
	private double urtekoInteresa;
	
	
	
	//metodoak
			//ariketan eskatzen diren metodoak
	public void ingresatu(double kopurua){
		this.saldoa = this.saldoa + kopurua;
	}
	
	public void diruaAtera(double kopurua){
		this.saldoa = this.saldoa - kopurua;
	}
	
	public double hilekoInteresak(){
		return this.urtekoInteresa * this.saldoa / 1200;
	}
		
	public boolean saldoaGorrian(){
		return this.saldoa < 0;
//		if(this.saldoa < 0){
//			return true;
//		}else{
//			return false;
//		}
	}
	
	public void pantailaratu(){
		System.out.println("Kontu zenbakia: " + this.kontuZenbakia);
		System.out.println("Titular izena: " + this.titularIzena);
		System.out.println("Saldoa:  " + this.saldoa);
		System.out.println("Urteko interesa: " + this.urtekoInteresa);
		
	}
	
	/**
	 * @return the kontuZenbakia
	 */
	public String getKontuZenbakia() {
		return kontuZenbakia;
	}
	/**
	 * @param kontuZenbakia the kontuZenbakia to set
	 */
	public void setKontuZenbakia(String kontuZenbakia) {
		this.kontuZenbakia = kontuZenbakia;
	}
	/**
	 * @return the titularIzena
	 */
	public String getTitularIzena() {
		return titularIzena;
	}
	/**
	 * @param titularIzena the titularIzena to set
	 */
	public void setTitularIzena(String titularIzena) {
		this.titularIzena = titularIzena;
	}
	/**
	 * @return the saldoa
	 */
	public double getSaldoa() {
		return saldoa;
	}
	/**
	 * @param saldoa the saldoa to set
	 */
	public void setSaldoa(double saldoa) {
		this.saldoa = saldoa;
	}
	/**
	 * @return the urtekoInteresa
	 */
	public double getUrtekoInteresa() {
		return urtekoInteresa;
	}
	/**
	 * @param urtekoInteresa the urtekoInteresa to set
	 */
	public void setUrtekoInteresa(double urtekoInteresa) {
		this.urtekoInteresa = urtekoInteresa;
	}
	
	
	
}
