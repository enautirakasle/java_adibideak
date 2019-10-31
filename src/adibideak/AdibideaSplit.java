package adibideak;

public class AdibideaSplit {

	public static void main(String[] args) {
		String janaria = "acederas;crudas;18;2,50;0,40;2,20;hotaliza";
		
		String[] zatiak = janaria.split(";");
		System.out.println(zatiak[0] + ": " + zatiak[2] + " Kaloria");

	}

}
