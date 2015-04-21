
public abstract class Kort {
	private String fornavn, etternavn;
	private int PIN;
	private static int kortnummer=(int)Math.round((float)Math.random() *9999999);
	private boolean sperretKort;
	
	
	Kort(String fornavn, String etternavn, int PIN){
		this.fornavn=fornavn;
		this.etternavn=etternavn;
		this.PIN=PIN;
		this.sperretKort=false;
	}
	
	public String getNavn(){
		String navn=this.fornavn+" "+this.etternavn;
		return navn;
	}
	
	public boolean isSperret(){
		return this.sperretKort;
	}
	
	@SuppressWarnings("static-access")
	public String toString(){
		String description="Navn: " +getNavn()+"\n";
		description+="PIN kode: "+this.PIN+"\n";
		description+="Kortnummer: "+this.kortnummer+"\n";
		description+="Kortet er sperret: "+this.sperretKort;
		return description;
		}
	
	public abstract boolean sjekkPIN(int PIN);
}