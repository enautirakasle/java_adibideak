package adibideak;

public class Adibidea12 {

	public static void main(String[] args) {
		int[] zenbakiak = new int[10];
		int[] zenbakiak2 = new int[10];
		
		arrayaZenbakizBete(zenbakiak, 100);
		zenbakiak2 = arrayaZenbakizBete1(zenbakiak2, 100);
		arrayaPantailaratu(zenbakiak);
		System.out.println("----------");
		arrayaPantailaratu(zenbakiak2);

	}
	
	static void arrayaZenbakizBete(int[] array, int max){
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random()* (max+1)));
		}
	}
	
	static int[] arrayaZenbakizBete1(int[] array, int max){
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random()* (max+1)));
		}
		return array;
	}
	

	static void arrayaPantailaratu(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
