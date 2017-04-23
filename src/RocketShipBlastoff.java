
public class RocketShipBlastoff {

	public static void main(String[] args) {
		for (int i = 10; i > -1; i--) {
			if (i > 0) {
				System.out.println(i);

				speak(Integer.toString(i));
			}
			if (i == 0) {
				System.out.println("Blastoff");
				speak("blastoff");
			}
		}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
