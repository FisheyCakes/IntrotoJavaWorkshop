package Day2JavaWorkshop;

import javax.swing.JOptionPane;

public class QuizShowFab {
	public static void main(String[] args) {
		int Score = 0;
		JOptionPane.showMessageDialog(null, "You are going to be tested. Thats all you know");
		String CorrectAnswer1 = A;
		String UserAnswer1 = JOptionPane.showInputDialog("First Question. Dinosaurs are A) Ancestors of Birds"
				+ "B) Ancestors of reptiles) " + "or C) Delecious.");
		String A = UserAnswer1;
		If(UserAnswer1.equals(A));
		{
			Score++;
		}
		else {
			Score--;}
	}

	private static void If(boolean equals) {
		// TODO Auto-generated method stub

	}

}
