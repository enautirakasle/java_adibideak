package adibideak;

import java.util.Scanner;

/*
 * metodoak praktikatzen (funtzio eta prozedurak)
 */
public class Adibidea11 {
	
	

	public static void main(String[] args) {

		//zenbakizko array bat hasieratu
		int[] tenperaturak = {1,-4,34,44,7,8,3,23,98,101,34,3};
		int[] zenbakiak = {9, 10};
		//maximoa idatzi prozedura erabiliz
		maximoaIdatzi(tenperaturak); //tenperaturak parametro erreala da
		maximoaIdatzi(zenbakiak); //zenbakiak parametro erreala da
	
		
		//maximoa idatzi funtzioa erabiliz
		int maximoa = maximoaItzuli(tenperaturak);
		System.out.println("Tenperatura maximoa " + maximoa + " da.");
		
		System.out.println("Tenperatura maximoa" + maximoaItzuli(tenperaturak) + " da.");

		
		System.out.println("Sartu zenbaki bat");
		int n = readInt();
		System.out.println(n + " idatzi duzu");
	}
	
	/*
	 * prozedura definitu eta implementatu
	 * zenbakizko array bateko maximoa pantailaratzen du
	 */
	static void maximoaIdatzi(int[] zenbakiak){ //zenbakiak parametro formala da
		int maximoa = zenbakiak[0];
		for(int i = 0; i < zenbakiak.length; i++){
			if(maximoa < zenbakiak[i]){
				maximoa = zenbakiak[i];
			}
		}
		
		System.out.println("Arrayko balio maximoa " + maximoa + " da");
	}
	
	
	static int maximoaItzuli(int[] zenbakiak){
		int maximoa = zenbakiak[0];
		for(int i = 0; i < zenbakiak.length; i++){
			if(maximoa < zenbakiak[i]){
				maximoa = zenbakiak[i];
			}
		}
		
		return maximoa; //itzuliko duen balioa 
		
	}
	
	static int zenbakiaIrakurri(){
		Scanner scan = new Scanner(System.in);
		int zenbakia = Integer.parseInt(scan.nextLine());
		scan.close();
		return zenbakia;
	}
	
	static int readInt(){
		Scanner scan = new Scanner(System.in);
		int zenbakia = Integer.parseInt(scan.nextLine());
		scan.close();
		return zenbakia;

	}
	
	

}
