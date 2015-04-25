import java.util.ArrayList;
import java.util.Collections;

public class KortTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		ArrayList<Kort> reg = new ArrayList<Kort>();

		Kort k1 = new Ansatt("Ole Olsen", 1234);
		Kort k2 = new Gjest("Marit Olsen");
		Kort k3 = new Ansatt("Andreas Jansson", 8474);
		Kort k4 = new Gjest("Tobias Karlsen");
		Kort k5 = new Gjest("Borge Fagerli");
		Kort k6 = new Gjest("Kjell Kjellesen");
		Kort k7 = new Ansatt("Tom Danielsen", 8384);
		Kort k8 = new Ansatt("Kjetil Haraldsen", 9274);
		Kort k9 = new Ansatt("Kim Hansen", 2754);
		
		Ansatt k1Clone=(Ansatt) k1.Clone();

		reg.add(k1);
		reg.add(k2);
		reg.add(k3);
		reg.add(k4);
		reg.add(k5);
		reg.add(k6);
		reg.add(k7);
		reg.add(k8);
		reg.add(k9);
		reg.add(k1Clone);

		System.out.println("Sammligner Ole Olsen med Marit Olsen:");
		System.out.println(k1.compareTo(k2));
		System.out.println("\nSammenligner Ansatt Ole Olsen med kopi Ansatt Ole Olsen:");
		System.out.println(k1.compareTo(k1Clone));

		Collections.sort(reg);

		System.out.println("\nSortert Liste:");
		for (Kort k : reg) {
			System.out.println(k.fullNavn + ": " + k.getClass());
		}

		k1.Access();
		k3.Access();
		k6.Access();
		
		

	}
}