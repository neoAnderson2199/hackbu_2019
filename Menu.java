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
 	        		Management screen = new Management();
 	        		screen.initialize();
 	        }
 	    });
 	}
}

