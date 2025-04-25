import java.util.ArrayList;


public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        // TYPE UP YOUR PART A CODE HERE
	 double allScores = 0;
        for(int i = 0; i < allReviews.length; i ++){
		allScores += allReviews[i].getRating();
	 }
	 return allScores/allReviews.length; 
    }

    public ArrayList<String> collectComments() {
        // TYPE UP YOUR PART B CODE HERE
	 ArrayList<String> collectedComments = new ArrayList<>();
        for(int i = 0; i < allReviews.length; i ++){
		if(allReviews[i].getComment().indexOf("!") > -1){
			String commentFormat = i + "-" + allReviews[i].getComment();
			boolean periodEnd = commentFormat.substring(commentFormat.length() - 1).equals(".");
			boolean exclamationEnd = commentFormat.substring(commentFormat.length() - 1).equals("!");
			if(!periodEnd && !exclamationEnd){
				commentFormat += ".";
			}
			collectedComments.add(commentFormat);
		}
	 }
	 return collectedComments; 
    }
}

