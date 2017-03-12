import javax.swing.JOptionPane;

public class Rollercoaster {
	int limit = 59;
	int capacity = 5;
	String name = "";

	Rollercoaster(String aName) {
		name = aName;
	}

	public static void main(String[] args) {
		Rollercoaster coaster = new Rollercoaster("roller");
		for (int i = 0; i == coaster.capacity; i++) {
			String height = JOptionPane.showInputDialog("How tall are you (in inches)?");
			int tall = Integer.parseInt(height);
			if (tall < coaster.limit) {
				JOptionPane.showMessageDialog(null, "You are not tall enough to ride the rollercoaster.");
			} else {
				JOptionPane.showMessageDialog(null, "You are tall enough to ride the rollercoaster.");
			}
		}

	}

}
