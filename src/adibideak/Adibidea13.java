package adibideak;

public class Adibidea13 {

	public static void main(String[] args) {

		int[][] matrizea = new int[5][10]; // zenbakiz osatutako (int[lerrokop][zutabekop])
		String[][] izenMatrizea = new String[2][3];
		
//		matrizea[0][0] = 6;
//		matrizea[2][5] = 12;
//		matrizea[1][3] = 5;
//		matrizea[3][3] = 3;
//		matrizea[4][9] = (int)(Math.random()*11);//0-10 arteko ausazko zenbakia
		
		//System.out.println(matrizea[2][5]);
		
		//matrizea errekorritu eta zenbakiz bete
		for(int i = 0; i < 5;i++){
			//azpiko for-ak lerro bat betetzen du
			for(int j = 0; j<10; j++){
				matrizea[i][j] = (int)(Math.random()*101);
			}
		}
		
		//matrizea errekorritu eta zenbakiak pantailan atera
		for(int i = 0; i < 5;i++){
			//lerro bat pantailaratzen du
			for(int j = 0; j<10; j++){
				//System.out.println(i+ " x " + j);
				System.out.print(matrizea[i][j] + "\t");
			}
			System.out.println();
		}
		
	}	//main bukaera


}//classbukaera
