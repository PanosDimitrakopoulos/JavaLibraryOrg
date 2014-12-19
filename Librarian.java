import javax.swing.*;

public class Librarian {
	private String id, title;
	private static int credits;

	public Librarian (String id, String title) {
		this.id = id;
		this.title = title;
		
		String str_credits = (String)JOptionPane.showInputDialog(
                null, "How many credits (credits) apply to the book?","Credits (credits)",
                 JOptionPane.INFORMATION_MESSAGE,
                null, null, null);
			
		Librarian.credits=Integer.parseInt(str_credits);
	}//end Constructor
	

	public void request() {
		Shelf rafi = new Shelf();
		rafi.has(this.id, this.title);
	}//end request()
	

	public void response(String id, String title, int credits) {
		
		String book_receipt = new String ("The student got the book with code" 
				+" '" + id +"'" + " and title " +"'" + title+"' ");
		
		String credits_receipt = new String ("and charged with " + credits + " credits");
		
		JOptionPane.showMessageDialog(
				null, book_receipt+" "+credits_receipt, "Rent form",JOptionPane.PLAIN_MESSAGE);
	}//end response()
	
	
	public static int getCredits(){
		return credits;
	}//end getCredits()
	
	
}//end of class