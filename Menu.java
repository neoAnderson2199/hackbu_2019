package hackbu_2019;
import javax.swing.*;
import java.awt.*;


public class Menu {
	public static void main(String args[]){
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					//Set the frame
				       JFrame frame = new JFrame("Advice Giver"); //Setting name
				       frame.setSize(800,600);
				       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			       
				       frame.setVisible(true);
				}
			});
		
	       
	}
	
}
