import java.util.Scanner;


public class AdvKal2 {

  private static Scanner s = new Scanner(System.in);
	private static int eingabe;
	private static int seed;
	private static String ergebnis;
	private static String seedTmp;
	private static int asd;
	
	public static void main(String[] args) {
		
		eingabe = s.nextInt();
		if (eingabe < 1 || eingabe > 99) {
			System.exit(0);
		} else {
			seed = eingabe;
			seed *= seed;
			seedTmp = String.valueOf(seed);
			if (String.valueOf(seed).length() < 4) {				//Weniger als 4 Ziffern
				int stellen = 4 - String.valueOf(seed).length();
				for (int i = 0; i < stellen; i++) {
					seedTmp += "0";
				}
			}
			
			seedTmp = seedTmp.charAt(1) + "" + seedTmp.charAt(2);
			
			seed = Integer.parseInt(seedTmp);
			ergebnis = "" + (eingabe * seed);
			if (ergebnis.length() < 2) {
				int stellen = 2 - ergebnis.length();
				for (int i = 0; i < stellen; i++) {
					ergebnis += seedTmp.charAt(0);
				}
			}
			ergebnis = ergebnis.substring(0, 2);
			if (ergebnis.equals("00")) {
				ergebnis = "13";
			}
			System.out.println(ergebnis);
			
		}

	}

}
