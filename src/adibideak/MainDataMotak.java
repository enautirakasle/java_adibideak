package adibideak;

import java.sql.Date;

public class MainDataMotak {

	public static void main(String[] args) {
		/*
		 * Adibidea
		 * uneko data java.util.Date-ren konstruktorearikin sortu
		 * eta java.sql.Date motako aldagaian gordetzea
		 */
		
		//java.util.Date sortu, uneko data eta orduarekin sortzen da.
		java.util.Date utilData = new java.util.Date();
		//util.Date motako aldagi bat sql.Date motako aldagai batean gordetzen.
		//modu honetan egin behar da
		java.sql.Date sqlData =  new java.sql.Date(utilData.getTime());
		
		System.out.println(utilData);
		System.out.println(sqlData);
		
		//sql.Date motako aldagai bat util.Date motako aldagai batean gordetzen,
		//ikusten den bezala ez dago ezer berezirik egin beharrik
		java.util.Date utilData2 = sqlData;
		System.out.println(utilData2);

	}

}
