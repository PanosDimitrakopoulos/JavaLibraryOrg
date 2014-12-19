import javax.swing.*;

public class Library {
	
	public static void main (String [] args) {
		
		String librarian_id = (String)JOptionPane.showInputDialog(
                null, "Please give the book's ID;","Code (id)",
                 JOptionPane.INFORMATION_MESSAGE,
                null, null, null);
		
		String librarian_title = (String)JOptionPane.showInputDialog(
                null, "Please give the book's title;","Title (title)",
                 JOptionPane.INFORMATION_MESSAGE,
                null, null, null);

		Cashier checker = new Cashier();
		
		
		Librarian vivliothikarios = new Librarian(librarian_id, librarian_title);
		vivliothikarios.request();
		vivliothikarios.response(librarian_id, librarian_title, checker.charge(librarian_id,
				librarian_title));
		
	}//end of main()
	
}//end of class