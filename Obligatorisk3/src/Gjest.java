import java.util.Calendar;
import java.util.Scanner;

public class Gjest extends Kort {

	Gjest(String navn) {
		super(navn, 9999);

		this.dateCreated = Calendar.getInstance();
		this.dateExpires = Calendar.getInstance();
		this.dateExpires.add(Calendar.WEEK_OF_YEAR, 1);

	}

	@Override
	public boolean checkPIN(int PIN) {
		if (this.PIN == PIN) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isExpired() {
		Calendar today = Calendar.getInstance();
		if (today.after(dateExpires)) {
			setSperretKort(true);
			return true;
		} else {
			int timeLeft = (int) (this.dateExpires.getTimeInMillis() - today
					.getTimeInMillis());
			int hoursLeft = timeLeft / (1000 * 60 * 60);
			System.out.println("\n" + this.fullNavn
					+ "'s key card has not expired yet. Hours Left: "
					+ hoursLeft);
			return false;
		}
	}

	public boolean Access() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		if (this.sperretKort == false) {

			System.out.println("\n" + this.fullNavn
					+ ", please input PIN for access");

			if (input.nextInt() == this.PIN) {
				System.out.println("Access granted for: " + this.fullNavn);
				
				return true;
			} else {
				System.out.println("Invalid PIN, access denied for: "
						+ this.fullNavn);
				
				return false;
			}
		} else {
			System.out.println("\n Key card is deactivated or expired for: "
					+ this.fullNavn);
			return false;
		}
	}

	@Override
	public Kort Clone() throws CloneNotSupportedException {
		return (Kort) super.clone();
	}

}