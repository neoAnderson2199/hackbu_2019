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
				       
						JPanel panel = new JPanel();
						
						//Area to Text 
						JTextArea textArea = new JTextArea();
						JTextField textField = new JTextField(20);
					
						//Labels
						JLabel label = new JLabel("Enter Text: ");
						
						//Buttons
						JButton enter = new JButton("Enter");

						//Add To Panel and Frame
						panel.add(label);
						panel.add(textField);
						panel.add(enter);
						
						frame.getContentPane().add(BorderLayout.SOUTH,panel);
						frame.getContentPane().add(BorderLayout.CENTER,textArea);
				}
			});
		
	       
	}
	
}
