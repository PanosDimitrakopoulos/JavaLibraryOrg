import javax.swing.*;

public class Shelf {
	
	void has(String id, String title) {
		
		String shelf_knows = new String (" The Code: " +" '" + id +"'" + " exists!");
		
		JOptionPane.showMessageDialog(
		null, shelf_knows+" ", "Shelf (id)",JOptionPane.PLAIN_MESSAGE);
		
		Book vivlio = new Book();
		vivlio.has(title);
		
		
	}//end has()

}//end of class