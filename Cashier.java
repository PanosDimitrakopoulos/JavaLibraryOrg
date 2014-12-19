import javax.swing.*;

public class Cashier {
	
	int charge(String id, String title) {
			
			int credits = Librarian.getCredits();
			
			String cashier_knows = new String ("The book " +" '" + id+"'" + 
					" with title "+"'" +title+"'" +" was charged " +" '" +credits+"'" + " credits");
			
			JOptionPane.showMessageDialog(
						null, cashier_knows+" ", "checker",JOptionPane.PLAIN_MESSAGE);
			
			
		return credits;
	}//end charge()

}//end of class



