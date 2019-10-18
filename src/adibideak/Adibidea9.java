package adibideak;
/*
 * arrayak javan
 */
public class Adibidea9 {

	public static void main(String[] args) {
		//10 luzerako zenbakien arraya definitu
		int[] zenbakiak = new int[12];
		
		int[] notak = {1, 3, 5, 8, 9, 10, 1};
		String[] izenak = {"Galder", "Igor", "Iker"};
		
		double[] tenperaturak;
		tenperaturak = new double[365];
		
		//array batean idatzi
		zenbakiak[0] = 15;
		zenbakiak[1] = 8;
		zenbakiak[9] = 9;
		zenbakiak[2] = zenbakiak[1]; //1etik irakurri eta 2an idatzi
		
		//array index out of bound
		//zenbakiak[10] = 2344;
		
		//arraytik irakurri eta pantailan idatzi
		System.out.println(zenbakiak[5]);
		System.out.println(zenbakiak[2]);
		
		
		int luzera = zenbakiak.length; //arrayIzena.length atributuak edo propietateak luzera gordetzen du
		
		System.out.println();
		System.out.println("----zenbakiak array pantilaratu----");
		//zenbakiak arraya pantailan idatzi
		for(int i=0; i < zenbakiak.length; i++){
			System.out.println(zenbakiak[i]);
		}

	
		
		System.out.println();
		System.out.println("----izenak array pantilaratu----");
		//izenak arraya pantailan idatzi
		int i = 0;
		while(i < izenak.length){
			System.out.println(izenak[i]);
			i++;
		}


		
		
		

	}

}
