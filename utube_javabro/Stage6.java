package utube_javabro;
import javax.swing.JOptionPane;

public class Stage6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*GUI -> graphical user interface
		if javax.swing does not allow for import, just add this to you
		module-info java file "requires java.desktop;"
		*/
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Your are " + age + " years");
		

	}

}
