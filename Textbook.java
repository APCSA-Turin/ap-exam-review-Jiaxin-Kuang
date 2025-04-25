public class Textbook extends Book{
	private int edition;
	public Textbook(String bookTitle, double bookPrice, int edition){
		super(bookTitle, bookPrice);
		this.edition = edition;
	}
	@Override
	public String getBookInfo(){
		return super.getBookInfo() + "-" + edition;
	}
	public int getEdition(){
		return edition;
	}
	public boolean canSubstituteFor(Textbook otherBook){
		if(otherBook.getTitle().equals(getTitle()) && otherBook.getEdition() <= edition){
			return true;
		}
		else{
			return false;
		}
	}
}
