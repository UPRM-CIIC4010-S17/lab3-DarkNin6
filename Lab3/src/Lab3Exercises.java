import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Christopher Roman");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(800, 450);
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
		
		//Application window's location based on computer monitor screen used in the laboratory.
		
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
	}
}