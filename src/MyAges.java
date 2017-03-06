import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {
		String ageString = JOptionPane.showInputDialog("What is your age?");
		String message = "";
		int age;
		try {
			age = Integer.parseInt(ageString);
		} catch (Exception e) {
			age = 0;
		}
		for (int i = 0; i < age; i++) {
			if (i == 1) {
				message = "You have been 1 year old\n";
			}

			if (i != 1) {
				message = message + "You have been " + i + " years old\n";
			}
		}
		message = message + "You are " + age + " years old";
		JOptionPane.showMessageDialog(null, message);
	}
}
