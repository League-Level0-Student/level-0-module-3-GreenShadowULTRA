package _05_horoscope;

import javax.swing.JOptionPane;

public class Steel {
public static void main(String[] args) {
String input	=JOptionPane.showInputDialog("What is ur zodiac");

if(input.equalsIgnoreCase("Aries")) {
	JOptionPane.showMessageDialog(null, "U will get hacked today.");
	
}
else if(input.equalsIgnoreCase("Taurus")) {
	JOptionPane.showMessageDialog(null, "U will win a contest");
	
}
else if(input.equalsIgnoreCase("Gemini")) {
	JOptionPane.showMessageDialog(null, "U will become rich... in a video game");
	
}
else if(input.equalsIgnoreCase("Cancer")) {
	JOptionPane.showMessageDialog(null, "Cancer will be cured today");
	
}
else if(input.equalsIgnoreCase("Leo")) {
	JOptionPane.showMessageDialog(null, "U will see ur best friend");
	
}
else if(input.equalsIgnoreCase("Virgo")) {
	JOptionPane.showMessageDialog(null, "U will walk on the earth");
	
}
else if(input.equalsIgnoreCase("Libra")) {
	JOptionPane.showMessageDialog(null, "U will not be able to deside between cake or cookies");
	
}
else if(input.equalsIgnoreCase("Scorpido")) {
	JOptionPane.showMessageDialog(null, "U will stub ur toe");
	
}
else if(input.equalsIgnoreCase("Sagittarius")) {
	JOptionPane.showMessageDialog(null, "U will be suscessfull");
	
}
else if(input.equalsIgnoreCase("Capricorn")) {
	JOptionPane.showMessageDialog(null, "Good luck for rest of life");
	
}
else if(input.equalsIgnoreCase("Aquarius")) {
	JOptionPane.showMessageDialog(null, "U will survive in water");
	
}
else if(input.equalsIgnoreCase("Piscese")) {
	JOptionPane.showMessageDialog(null, "U will have fun");
	
}
else {
	JOptionPane.showMessageDialog(null, "error 404 scope not found");
	
}
System.exit(0);
}
}
