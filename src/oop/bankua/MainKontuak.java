package oop.bankua;

import java.util.ArrayList;

public class MainKontuak {
	
	static final int IRTEN = 0;
	static final int KONTUA_SORTU = 1;
	static final int KONTUA_EZABATU = 2;
	
	static final int KONTUA_IKUSI = 3;
	static final int INGRESOA_EGIN = 4;
	static final int DIRUA_ATERA = 5;
	
	
	public static void main(String[] args) {
		ArrayList<KontuKorrontea> kontuKorronteak = new ArrayList<KontuKorrontea>();
		
		//kontu konrronte bat sortu
		KontuKorrontea kontuKorrontea = new KontuKorrontea();
		
		//balio literalekin bete
		kontuKorrontea.setKontuZenbakia("1111 1111");
		kontuKorrontea.setSaldoa(1000);
		kontuKorrontea.setTitularIzena("Enaut");
		kontuKorrontea.setUrtekoInteresa(0.1);
		
		//kontua listara gehitu
		kontuKorronteak.add(kontuKorrontea);
		
			
		//do while
		//	menua
		//	aukera irakurri
		//	swicha
		
		
		
		
	}
	
	static void menuNagusia(){

		System.out.println("--Menua--"
				+ IRTEN + " - irten");
	}
}
