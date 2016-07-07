package Day2JavaWorkshop;

import javax.swing.JOptionPane;

public class DialougeThing {
	public static void main(String[] args) {
		//String Answer = JOptionPane.showInputDialog("I am the computer.");
		//JOptionPane.showMessageDialog(null, "I can do that too");
		//System.out.println(Answer);
		JOptionPane.showMessageDialog(null, "This is going to be a story");
		String Adj1 = JOptionPane.showInputDialog("Give me an adjective.");
		String Adj2 = JOptionPane.showInputDialog("Good, now give me another");
		String Adj3 = JOptionPane.showInputDialog("Ok, now give me one more adjective");
		String Name = JOptionPane.showInputDialog("Good, now give me a name.");
		String Noun1 = JOptionPane.showInputDialog("Give me a noun now.");
		String Noun2 = JOptionPane.showInputDialog("Give me another noun.");
		String Noun3 = JOptionPane.showInputDialog("Give me a third noun");
		String Verb1 = JOptionPane.showInputDialog("Good, good, now I need a verb + ing");
		String Verb2 = JOptionPane.showInputDialog("I need another verb");
		String Verb3 = JOptionPane.showInputDialog("Now I need one more verb");
		String Color1 = JOptionPane.showInputDialog("Now I need a color");
		String Color2 = JOptionPane.showInputDialog("Now I need one more color.");
		String Animal = JOptionPane.showInputDialog("Now I need an animal");
		JOptionPane.showMessageDialog(null, "Ok, here is the story");
		JOptionPane.showMessageDialog(null, "Once there was a, " + Adj2 + " " +Color1 + " " + Animal + "Named " + Name + ". He wanted to go " + Verb1 + ". He liked to daydream about using his " + Adj1 + " " + Color2 + " " + Noun1 + " to " + Verb3 + "the " + Noun2 + ". Then ,he thought about the" + Adj3 +" " + Noun3 + " that he would " + Verb2 + "home.");
	}

}
