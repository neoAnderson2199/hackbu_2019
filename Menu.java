package hackbu_2019;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Menu {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(
			UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) { 
			e.printStackTrace();
		}

		//Schedule a job for the event-dispatching thread:
 	    //creating and showing this application's GUI.
 		// see http://download.oracle.com/javase/tutorial/uiswing/concurrency/initial.html
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				int i = JOptionPane.showConfirmDialog(null, "THIS APPLICATION FILLS YOUR SCREEN\n" +
 	        			"Do not run it until you know how to close\n" +
 	        			"an application from the keyboard.\n" +
 	        			"On Linux and Windows use ALT-F4.\n" +
 	        			"On Mac, it may be Command+W\n" +
 	        			"--test it using another window first!");
 	        	if(i == JOptionPane.OK_OPTION) {
 	        		Management screen = new Management();
 	        		screen.initialize();
 	        	}
 	        }
 	    });
 	}
}

