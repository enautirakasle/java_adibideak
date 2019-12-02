package opp.aurikularrak;

public class Aurikular {
	
	//atributuak
	private String izena;
	private String marka;
	private double prezioa;
	private int stocka;
	
	//metodoak
	public void pantailaratu(){
		System.out.println(this.izena + " - " + this.marka + ": " + this.prezioa + "E");
	}
	
	/**
	 * @return the izena
	 */
	public String getIzena() {
		return izena;
	}
	/**
	 * @param izena the izena to set
	 */
	public void setIzena(String izena) {
		this.izena = izena;
	}
	/**
	 * @return the marka
	 */
	public String getMarka() {
		return marka;
	}
	/**
	 * @param marka the marka to set
	 */
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	/**
	 * @return the prezioa
	 */
	public double getPrezioa() {
		return prezioa;
	}
	
	/**
	 * @param prezioa the prezioa to set
	 */
	public void setPrezioa(double prezioa) {
		if(prezioa < 0){
			this.prezioa = 0;
			System.out.println("Prezio negatiborik ez da onartzen");
		}else{
			this.prezioa = prezioa;
		}
		
	}
	
	/**
	 * @return the stocka
	 */
	public int getStocka() {
		return stocka;
	}
	
	/**
	 * @param stocka the stocka to set
	 */
	public void setStocka(int stocka) {
		if(stocka >= 0){
			this.stocka = stocka;
		}else{
			this.stocka = 0;
			System.out.println("Stocka ezin da izan negatiboa");
		}
		
	}
	
	

}
