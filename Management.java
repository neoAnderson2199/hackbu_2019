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
	private JLabel imagelabel;
	
	private Font font = new Font("Serif", Font.PLAIN, 18);
	private JTextField textField = new JTextField(20);
	private JComboBox<String> cBox = new JComboBox<String>();

	private JComboBox<String> yBox = new JComboBox<String>();
	private String question, selected1, selected2;
	private ImageIcon image;
	
	public void initialize() {
		frame.setSize(800,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			       
		frame.setVisible(true);
		frame.add(buildPanel());

	}

	public JPanel buildPanel() {
		//Whole Panel
		panel.setLayout(new GridLayout(5,1));
		label2.setFont(font);
		label3.setFont(font);
		label4.setFont(font);

		//Title Panel
		JPanel tpanel = new JPanel();
		JLabel title = new JLabel("Advice Giver");
		title.setFont(new Font("Serif", Font.BOLD, 45));
		tpanel.add(title);
		//Y/N Panel
		JPanel ypanel = new JPanel();
		JLabel text1 = new JLabel("Do you have an issue: ");
		text1.setFont(font);
		ypanel.add(text1);
		ypanel.add(buildyBox());
		//Input Panel
		JPanel ipanel = new JPanel();
		JLabel text2 = new JLabel("Enter Issue: ");
		text2.setFont(font);
		ipanel.add(text2);
		ipanel.add(textField);
		ipanel.add(buildcBox());
		ipanel.add(enterButton());
		//Question Panel
		JPanel qpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel text3 = new JLabel("Issue: ");
		text3.setFont(font);
		qpanel.add(text3);
		//qpanel.add(label3);
		qpanel.add(label2);
		//Output Panel
		JPanel opanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel text4 = new JLabel("Reply:");
		text4.setFont(font);
		opanel.add(text4);
		opanel.add(label4);
		
		//Image adding
		 try {
             image = new ImageIcon("./hackbu_2019/light.png");  
             Image im = image.getImage();
             Image newimg = im.getScaledInstance(70, 70,  java.awt.Image.SCALE_SMOOTH);
             image = new ImageIcon(newimg);
             imagelabel = new JLabel("", image, JLabel.CENTER); 
             tpanel.add(imagelabel);
             
             
         }catch(Exception e) {}
		//Panel
		panel.add(tpanel);
		panel.add(ypanel);
		panel.add(ipanel);
		panel.add(qpanel);
		panel.add(opanel);
		return panel; 
	}

	public JComboBox<String> buildyBox() {
		String[] choice = {"<Select One>","Yes", "No"};    
	    yBox = new JComboBox<String>(choice);
	    yBox.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                selected1 = (String)yBox.getSelectedItem();
	            }
	        });
		yBox.setSelectedItem(choice[0]);
		return yBox;
	}
	

	public JComboBox<String> buildcBox() {
		String[] concerns = {"<Select One>", "Food", "Drugs/Alcohol","Fitness/Wellness", "Maintenance",
				"Technology","Teachers", "Students","Classes","Future Plans", "Housing", "Activities",
				"Financial","Medical","Transport"};    
	    cBox = new JComboBox<String>(concerns);
	    cBox.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                selected2 = (String)cBox.getSelectedItem();
	            }
	        });
		cBox.setSelectedItem(concerns[0]);
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
                String output;
                question = textField.getText();
                if(selected1.equals("<Select One>")){
                	output = Answer.reply(30);
                }else if(selected1.equals("No")){
                    output = Answer.reply(28);
                } else{
                    if(selected2.equals("<Select One>") || question.trim().equals("")){
                        output = Answer.reply(30);
                    } else{
                        label3.setText(selected2);
                        int intVal = transtoInt(selected2);
                        output = Answer.read_in(question,intVal);
                        label2.setText(question);
                    }
                }
                label4.setText(output);
                
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
		}else if(input.equals("Future Plans")) {
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
