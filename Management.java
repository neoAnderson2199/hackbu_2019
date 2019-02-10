package hackbu_2019;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class Management implements ActionListener{
	final JFrame frame = new JFrame("Advice Giver");
	private JPanel panel = new JPanel();
	private JTextField textField = new JTextField(20);
	private JLabel label2 = new JLabel("what");
	private String question;
	
	public void initialize() {
		//frame.setLayout(null);
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
            Point pt = label2.getLocation();
    		System.out.println(pt);
    		label2.setHorizontalTextPosition(SwingConstants.CENTER);
    		System.out.println(pt);
            label2.setText(question);
            textField.setText("");
        }
	}
	
	public String getQuestion() {
		return question;
	}
}
