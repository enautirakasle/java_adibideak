package oop;

public class Pertsona {
	//atributuak
	private String izena;
	private String abizena1;
	private String abizena2;
	private int adina;
	private String dni;
	private String telefonoa;
	
	//metodoak
	public Pertsona(){
		
	}
	
	public Pertsona(String izena, String abizena1, String abizena2){
		this.izena = izena;
		this.abizena1 = abizena1;
		this.abizena2 = abizena2;
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
	 * @return the abizena1
	 */
	public String getAbizena1() {
		return abizena1;
	}
	/**
	 * @param abizena1 the abizena1 to set
	 */
	public void setAbizena1(String abizena1) {
		this.abizena1 = abizena1;
	}
	/**
	 * @return the abizena2
	 */
	public String getAbizena2() {
		return abizena2;
	}
	/**
	 * @param abizena2 the abizena2 to set
	 */
	public void setAbizena2(String abizena2) {
		this.abizena2 = abizena2;
	}
	/**
	 * @return the adina
	 */
	public int getAdina() {
		return adina;
	}
	/**
	 * @param adina the adina to set
	 */
	public void setAdina(int adina) {
		this.adina = adina;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the telefonoa
	 */
	public String getTelefonoa() {
		return telefonoa;
	}
	/**
	 * @param telefonoa the telefonoa to set
	 */
	public void setTelefonoa(String telefonoa) {
		this.telefonoa = telefonoa;
	}
	
	
	
}
