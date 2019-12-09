package oop.bankua;

import java.util.ArrayList;
import java.util.Scanner;

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
		
		Scanner scan = new Scanner(System.in);
		int aukera;
		do{
			menuNagusia();
			aukera = Integer.parseInt(scan.nextLine());
			
			switch (aukera) {
			case INGRESOA_EGIN:
				ingresoaEgin(kontuKorronteak);
				break;

			default:
				System.out.println("Aukera okerra");
				break;
			}
		}while(aukera!=IRTEN);

		
		
		
		
	}
	
	private static void ingresoaEgin(ArrayList<KontuKorrontea> kontuKorronteak) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Idatzi ingresoa egin nahi den KK zenbakia");
		String kontuZenbakia = scan.nextLine();
		
		System.out.println("Idatzi ingresatu nahi den diru kopurua");
		double kopurua = Double.parseDouble(scan.nextLine());
		
		for (int i = 0; i < kontuKorronteak.size(); i++) {
			KontuKorrontea kontuKorrontea = kontuKorronteak.get(i);

			if(kontuKorrontea.getKontuZenbakia().equals(kontuZenbakia)){//kontuZenbakia eta uneko Kontu koroontearen zenbakia berdinak badira
				//ingresaoa egin eta forretik atera
				kontuKorrontea.ingresatu(kopurua);
				
				break;
			}	
		}

	}

	static void menuNagusia(){

		System.out.println("--Menua--\n"
				+ INGRESOA_EGIN + "- ingresoa egin"
				+ IRTEN + " - irten");
	}
}
