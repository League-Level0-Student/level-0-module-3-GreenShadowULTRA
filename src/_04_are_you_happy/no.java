package _04_are_you_happy;

import javax.swing.JOptionPane;

public class no {
public static void main(String[] args) {
String input =JOptionPane.showInputDialog("are u happy");

if (input.equalsIgnoreCase("yes")) {
	
	JOptionPane.showMessageDialog(null, "Ok den");
	
	System.exit(0);
	
}

else {
	
String mega=JOptionPane.showInputDialog("would u like to be happy");
	
	if(mega.equalsIgnoreCase("yes")) {
		
	JOptionPane.showInputDialog("Be happy den");	
		
		
	}
	
	else {
		
		JOptionPane.showMessageDialog(null, "Ok den");
		
	}
}








}
}
