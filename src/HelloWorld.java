import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class HelloWorld {
	public static void main (String[] arg){
	//System.out.println("Hello World");	
	//System.out.print("Hello again");
	//System.out.println("Hello a third time");
	//JOptionPane.showMessageDialog(null, "This is me");
		
		int i =1;
	Robot Timmy = new Robot();
	Timmy.penDown();
	Timmy.setSpeed(5);
	while(i<7){
	
	Timmy.move(100);
	Timmy.turn(60);
	i++;
	}
	}

}
