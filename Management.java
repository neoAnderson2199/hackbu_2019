package hackbu_2019;
import java.awt.event.*;

import javax.swing.*;

public class Management{
	final JFrame frame = new JFrame("Advice Giver");
	private JPanel panel = new JPanel();
	
	public void initialize() {
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			       
		frame.setVisible(true);
		buildPanel();
		frame.getContentPane().add(panel);
		
		//Drop Menu 
		String[] concerns = { "Food", "Drugs/Alcohol","Fitness/Wellness", "Maintenance",
				"Technology","Teachers", "Students","Classes","Future Plans", "Housing", "Activities",
				"Financial","Medical","Transport"};
		
		JComboBox<String> cBox = new JComboBox(concerns);
		cBox.setSelectedItem(null);
		String selected = (String)cBox.getSelectedItem();
		frame.getContentPane().add(cBox);
	}
	
	public void buildPanel() {
						
		//Area to Text 
		JTextField textField = new JTextField(20);
					
		//Labels
		JLabel label = new JLabel("Enter Text: ");
						  
		//Buttons
		JButton enter = new JButton("Enter");
			
		//Add To Panel and Frame
		panel.add(label);
		panel.add(textField);
		panel.add(enter);
	}
	/*
	public String getFieldValue(String fieldName){
        JTextField field = panel.get(fieldName);
        return field.getText();
        
    }
	 */  
}
