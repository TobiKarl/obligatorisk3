import java.util.Calendar;
import java.util.Scanner;

public class Ansatt extends Kort{

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
				System.out.println("Access Granted for:" + this.fullNavn
						+ " (Automatic access in work hours)");
				return true;
			}

			else {
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				System.out.println(this.fullNavn
						+ ", Please input PIN for access");

				if (input.nextInt() == this.PIN) {
					System.out.println("\n Access granted for: " + this.fullNavn);
					return true;
				} else {
					System.out.println("Invalid PIN, access denied for: "
							+ this.fullNavn);
					return false;
				}
			}
		} else {
			System.out.println("\n Key card is deactivated for: " + this.fullNavn);
			return false;
		}
	}


	}



