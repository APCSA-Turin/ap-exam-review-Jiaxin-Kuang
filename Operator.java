public class Operator {
    /** IMPLEMENTATION PROVIDED TO ENABLE TESTING */
    public static int transform(String str) {
        if (str.equals("orang")) {
          return 2;
        } else if (str.equals("epear")) {
          return 6;
        } else if (str.equals("bl")) {
          return 5;
        } else if (str.equals("ah")) {
          return 4;
        } else {
          return 0;
        }
    }
  
    /** Returns an integer based on two input strings, as described in part (a)
      *
      * Precondition: input and op are not null.
      *               The length of input is even.
      *               op is either "$$", "^^", or "##".
      */
      public static int compute(String input, String op){
        int middle = input.length()/2;
        String firstHalf = input.substring(0, middle);
        String secondHalf = input.substring(middle, input.length());
        int firstTransform = transform(firstHalf);
        int secondTransform = transform(secondHalf);
        if(op.equals("$$")){
            return firstTransform + secondTransform;
        }
        else if(op.equals("^^")){
            return firstTransform * secondTransform;
        }
        else{
            return firstTransform - secondTransform;
        }
    }    
  }
  