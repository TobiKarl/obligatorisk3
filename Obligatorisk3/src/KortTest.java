import java.util.ArrayList;

public class KortTest {

	public static void main(String[] args) {

		ArrayList<Kort> reg = new ArrayList<Kort>();

		Kort k1 = new Ansatt("Ole Olsen", 1234);
		Kort k2 = new Gjest("Marit Olsen");

		System.out.println(k1.fornavn);
		System.out.println(k1.etternavn);

		reg.add(k1);
		reg.add(k2);


		for (int i = 0; i < reg.size(); i++) {
			Kort kort = reg.get(i);
			System.out.println(kort);
			System.out.println("Test av kort: med kode 1234 er"
					+ (kort.checkPIN(1234) ? " gyldig" : " ugyldig"));
			System.out.println("Test av kort: med kode 9999 er"
					+ (kort.checkPIN(9999) ? " gyldig" : " ugyldig\n"));
		}
		
		((Gjest)k2).isExpired();
		k1.Access();
		k2.Access();

	
	}

}