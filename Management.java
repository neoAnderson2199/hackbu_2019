package hackbu_2019;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class Management implements ActionListener{
	final JFrame frame = new JFrame("Advice Giver");

	private JPanel fieldPanel = new JPanel(); 	
	private JPanel panel = new JPanel();
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();
	private JLabel label4 = new JLabel();
	private JTextField textField = new JTextField(20);
	private JComboBox<String> cBox = new JComboBox<String>();
	private String question;
	private String selected;
	
	public void initialize() {
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			       
		frame.setVisible(true);
		frame.add(buildPanel());

	}

	public JPanel buildPanel() {
		//Whole Panel
		panel.setLayout(new GridLayout(3,1));
		//Input Panel
		JPanel ipanel = new JPanel();
		ipanel.add(new JLabel("Enter Text: "));
		ipanel.add(textField);
		ipanel.add(enterButton());
		ipanel.add(buildcBox());
		//Question Panel
		JPanel qpanel = new JPanel();
		qpanel.add(new JLabel("your question:"));
		qpanel.add(label3);
		qpanel.add(label2);
		//Output Panel
		JPanel opanel = new JPanel();
		opanel.add(new JLabel("suggestion:"));
		opanel.add(label4);
		//Panel
		panel.add(ipanel);
		panel.add(qpanel);
		panel.add(opanel);
		return panel; 
	}
	

	public JComboBox<String> buildcBox() {
		String[] concerns = { "Food", "Drugs/Alcohol","Fitness/Wellness", "Maintenance",
				"Technology","Teachers", "Students","Classes","Future Plans", "Housing", "Activities",
				"Financial","Medical","Transport"};    
	    cBox = new JComboBox<String>(concerns);
	    cBox.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                selected = (String)cBox.getSelectedItem();
	            }
	        });
		cBox.setSelectedItem(null);
		return cBox;
	}


	public JButton enterButton() {
		JButton enter = new JButton("Enter");
		enter.addActionListener(this);
		return enter;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String action = ae.getActionCommand();
        if (action.equals("Enter")) {
            question = textField.getText();
            label3.setText(selected);
            int intVal = transtoInt(selected);
            String output = Answer.read_in(question,intVal);
            label4.setText(output);
            label2.setText(question);
            textField.setText("");
        }
	}
	
	public int transtoInt(String input) {
		int retVal = -1;
		if(input.equals("Food")){
			retVal = 0;
		}else if(input.equals("Drugs/Alcohol")){
			retVal = 1;
		}else if(input.equals("Fitness/Wellness")){
			retVal = 2;
		}else if(input.equals("Maintenance")) {
			retVal = 3;
		}else if(input.equals("Technology")) {
			retVal = 4;
		}else if(input.equals("Teachers")) {
			retVal = 5;
		}else if(input.equals("Students")) {
			retVal = 6;
		}else if(input.equals("Classes")) {
			retVal = 7;
		}else if(input.equals("Fulture Plans")) {
			retVal = 8;
		}else if(input.equals("Housing")) {
			retVal = 9;
		}else if(input.equals("Activities")) {
			retVal = 10;
		}else if(input.equals("Financial")) {
			retVal = 11;
		}else if(input.equals("Medical")) {
			retVal = 12;
		}else {
			retVal = 13;
		}
		return retVal;
	}
}
