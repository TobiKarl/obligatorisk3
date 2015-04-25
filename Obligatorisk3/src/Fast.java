
public interface Fast {
	public void setForNavn(String fornavn);

	public String hentForNavn();

	public void setEtterNavn(String etternavn);

	public String hentEtterNavn();

	public void setFulltNavn(String fornavn, String etternavn);

	public String hentFulltNavn();

	public double beregnKreditt();

	public double beregnBonus();
}
