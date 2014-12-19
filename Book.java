import javax.swing.*;

public class Book {

	void has(String title) {
		
		String book_knows = new String (" The book with title: "+" '" + title +"'" + " is available!");
		
		JOptionPane.showMessageDialog(
					null, book_knows+" ", "Book (title)",JOptionPane.PLAIN_MESSAGE);
		
	}//end of has()
	
}//end of class