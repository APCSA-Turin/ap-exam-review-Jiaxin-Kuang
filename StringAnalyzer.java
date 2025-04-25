public class StringAnalyzer {
    /** Returns a count of how many times smallStr occurs in largeStr, as
      * described in part (a)
      *
      * Precondition: largeStr is not null; smallStr is not null.
      *          The length of smallStr is less than the length of largeStr.
      */
      public static int countRepeat(String largeStr, String smallStr){
        int smallStrLen = smallStr.length();
        int occurence = 0;
        for(int i = 0; i < largeStr.length() - smallStrLen + 1; i ++){
            if(largeStr.substring(i, i + smallStrLen).equals(smallStr)){
                occurence ++;
                i += smallStrLen - 1;		
            }
        }
        return occurence;
    }    
  }
  