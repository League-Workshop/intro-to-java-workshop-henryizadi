package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		JOptionPane.showMessageDialog(null, "HelloWorld");
		String name = JOptionPane.showInputDialog("username");
		System.out.println(name);
		JOptionPane.showMessageDialog(null, "Hello " + name);
	}
}
