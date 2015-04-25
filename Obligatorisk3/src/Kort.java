import java.util.Calendar;

public abstract class Kort {

	protected String fornavn, etternavn;
	protected String fullNavn = fornavn + " " + etternavn;
	protected int PIN;
	protected int kortNummer;
	protected boolean sperretKort;
	protected Calendar dateCreated, dateExpires;

	Kort() {}

	Kort(String fullNavn, int PIN) {
		this.fullNavn = fullNavn;
		this.fornavn = fullNavn.split(" ")[0];
		this.etternavn = fullNavn.split(" ")[1];
		this.PIN = PIN;
		this.sperretKort = false;
		kortNummer = (int) Math.round((float) Math.random() * 9999999);
	}

	public void setKortNummer(int kortnummer) {
		this.kortNummer = kortnummer;
	}

	public String getNavn() {
		return fullNavn;
	}

	public Calendar getDateCreated() {
		return dateCreated;
	}

	public Calendar getDateExpires() {
		return dateExpires;
	}

	public boolean isSperret() {
		return this.sperretKort;
	}

	public void setSperretKort(boolean sperretKort) {
		this.sperretKort = sperretKort;
	}

	public String toString() {
		String description = "Navn: " + getNavn() + "\n";
		description += "PIN kode: " + this.PIN + "\n";
		description += "Kortnummer: " + kortNummer + "\n";
		description += "Kortet er sperret: " + this.sperretKort + "\n";
		return description;
	}

	public abstract boolean checkPIN(int PIN);

	public abstract boolean Access();

	}

