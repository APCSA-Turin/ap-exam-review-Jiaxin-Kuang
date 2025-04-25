public class WordMatch {

    private String secret;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        // TYPE UP YOUR PART A CODE HERE
        int guessLength = guess.length();
        int occurences = 0;
        for(int i = 0; i <= secret.length() - guessLength; i ++){
            if(secret.substring(i, i + guessLength).equals(guess)){
                occurences ++;
            }
        }
        return guessLength * guessLength * occurences;

    }

    public String findBetterGuess(String guess1, String guess2) {
        int firstScore = scoreGuess(guess1);
        int secondScore = scoreGuess(guess2);
        if(firstScore > secondScore){
            return guess1;
        }
        else if(secondScore > firstScore){
            return guess2;
        }
        else{
            int tieBreaker = guess1.compareTo(guess2);
            if(tieBreaker >= 0){
                return guess1;
            }
            else{
                return guess2;
            }
        }
    }
}
