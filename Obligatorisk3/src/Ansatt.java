import java.util.Calendar;
import java.util.Scanner;

public class Ansatt extends Kort implements Fast {

	private double kredittFaktor;
	private double timelonn;
	private int ansiennitet;
	private double bonusFaktor;

	public Ansatt(String navn, int PIN) {
		super(navn, PIN);
		this.dateCreated = Calendar.getInstance();
	}

	@Override
	public boolean checkPIN(int PIN) {
		if (this.PIN == PIN) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean Access() {
		DateHelper now = new DateHelper();

		if (this.sperretKort == false) {
			if (now.getHour() < 17 && now.getHour() > 7) {
				System.out.println("\nAccess Granted for:" + this.fullNavn
						+ " (Automatic access in work hours)");
				return true;
			}

			else {
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				System.out.println("\n" + this.fullNavn
						+ ", Please input PIN for access");

				if (input.nextInt() == this.PIN) {
					System.out.println("Access granted for: " + this.fullNavn);
					return true;
				} else {
					System.out.println("Invalid PIN, access denied for: "
							+ this.fullNavn);
					return false;
				}
			}
		} else {
			System.out.println("\n Key card is deactivated for: "
					+ this.fullNavn);
			return false;
		}
	}

	@Override
	public void setForNavn(String fornavn) {
		this.fornavn = fornavn;

	}

	@Override
	public String hentForNavn() {
		return fornavn;
	}

	@Override
	public void setEtterNavn(String etternavn) {
		this.etternavn = etternavn;

	}

	@Override
	public String hentEtterNavn() {
		return etternavn;
	}

	@Override
	public void setFulltNavn(String fornavn, String etternavn) {
		this.fullNavn = fornavn + " " + etternavn;

	}

	@Override
	public String hentFulltNavn() {
		String fullNavn = this.fornavn + " " + this.etternavn;
		return fullNavn;
	}

	@Override
	public double beregnKreditt() {
		double kreditt = kredittFaktor * timelonn;
		return kreditt;
	}

	@Override
	public double beregnBonus() {
		return this.timelonn * this.bonusFaktor;
	}

	public double getKredittFaktor() {
		return kredittFaktor;
	}

	public double getTimelonn() {
		return timelonn;
	}

	public int getAnsiennitet() {
		return ansiennitet;
	}

	public double getBonusFaktor() {
		return bonusFaktor;
	}

	public void arbeidsVilkaar(int ansiennitet, double timelonn,
			double bonusFaktor, double kredittFaktor) {
		this.timelonn = timelonn;
		this.kredittFaktor = kredittFaktor;
		this.bonusFaktor = bonusFaktor;
		this.ansiennitet = ansiennitet;
	}

}
