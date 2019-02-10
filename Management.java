package hackbu_2019;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class Management implements ActionListener{
	final JFrame frame = new JFrame("Advice Giver");
	private JPanel panel = new JPanel();
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();
	private JTextField textField = new JTextField(20);
	private String question;
	private String selected;
	
	public void initialize() {
		//frame.setLayout(null);
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			       
		frame.setVisible(true);
		frame.add(buildPanel());

		String[] concerns = { "Food", "Drugs/Alcohol","Fitness/Wellness", "Maintenance",
				"Technology","Teachers", "Students","Classes","Future Plans", "Housing", "Activities",
				"Financial","Medical","Transport"};
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
