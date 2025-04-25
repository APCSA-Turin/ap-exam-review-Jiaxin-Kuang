import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[][] words = new String[2][3];
        words[0][1] = "hello";
        words[0][2] = "echo";
        words[1][0] = "eek";
        words[1][2] = "plea";
        
        for(int i = 0; i < words.length; i ++){
            for(int j = 0; j < words[0].length; j ++){
                if(words[i][j] != null && words[i][j].substring(0, 1).equals("e")){
                    words[i][j] = "CSA";
                }
            }
        }
        

        for (String[] row : words) {
            for (String word : row) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
            }
}
