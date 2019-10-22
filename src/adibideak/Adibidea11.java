package adibideak;
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
	
	

}
