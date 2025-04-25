public class StringPatterns{
    public static String letterAndPattern(String letter, String pattern){ 
        if(pattern.indexOf(letter) >= 0){
            return letter;
        }
        else{
            String reversePattern = "";
            for(int i = pattern.length() - 1; i >= 0; i --){
                reversePattern += pattern.substring(i, i + 1);
            }
            return reversePattern;
        }
    }
}
