package hackbu_2019;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class Management implements ActionListener{
	final JFrame frame = new JFrame("Advice Giver");
<<<<<<< HEAD
	private JPanel panel = new JPanel(new GridLayout(1, 1));
	private JPanel fieldPanel = new JPanel(); 
	
	private JTextField textField = new JTextField(30);
	
	private JLabel label2 = new JLabel("");
=======
	private JPanel panel = new JPanel();
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();
	private JTextField textField = new JTextField(20);
>>>>>>> branch 'master' of https://github.com/neoAnderson2199/hackbu_2019.git
	private String question;
	private String selected;
	
	public void initialize() {
		//frame.setLayout(null);
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			       
		frame.setVisible(true);
		frame.add(buildPanel());

<<<<<<< HEAD
		//Drop Menu 
	    frame.add(panel, BorderLayout.NORTH);
	    frame.add(fieldPanel, BorderLayout.CENTER);

	    // Combobox
	    JLabel labelCombo = new JLabel("Overview of Complaint");

	    // Options in the combobox
	    String[] concerns = { "Food", "Drugs/Alcohol","Fitness/Wellness", "Maintenance",
=======
/*
		JComboBox<String> cBox = new JComboBox(concerns);
		cBox.setSelectedItem(null);
		selected = (String)cBox.getSelectedItem();
		frame.getContentPane().add(cBox);
*/
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
		panel.add(ipanel);
		panel.add(qpanel);
		panel.add(opanel);
		return panel; 
	}
	
	public JComboBox buildcBox() {
		String[] concerns = { "Food", "Drugs/Alcohol","Fitness/Wellness", "Maintenance",
>>>>>>> branch 'master' of https://github.com/neoAnderson2199/hackbu_2019.git
				"Technology","Teachers", "Students","Classes","Future Plans", "Housing", "Activities",
				"Financial","Medical","Transport"};
<<<<<<< HEAD
	    
	    JComboBox<String> cBox = new JComboBox(concerns);
	    cBox.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Do something when you select the type of concern
	            }
	        });
	    
		cBox.setSelectedItem(null);
		
        // Add fields
        fieldPanel.add(cBox);

        
        frame.getContentPane().add(cBox);

=======
		JComboBox cBox = new JComboBox(concerns);
		return cBox;
>>>>>>> branch 'master' of https://github.com/neoAnderson2199/hackbu_2019.git
	}
	
<<<<<<< HEAD
	public void buildPanel() {				
		//Labels
		JLabel label = new JLabel("Enter Text: ");
		// set the position of label2
		label2.setBounds(new Rectangle(new Point(200, 300), label2.getPreferredSize()));
		//Add To Panel and Frame
		panel.add(label);
		panel.add(label2);
		panel.add(textField);
		panel.add(enterButton());
	}

=======
>>>>>>> branch 'master' of https://github.com/neoAnderson2199/hackbu_2019.git
	public JButton enterButton() {
		JButton enter = new JButton("Enter");
		enter.addActionListener(this);
		return enter;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String action = ae.getActionCommand();
        if (action.equals("Enter")) {
            question = textField.getText();
            label3.setText(selected);
            label2.setText(question);
            textField.setText("");
        }
	}
	
	public String getQuestion() {
		return question;
	}
}
