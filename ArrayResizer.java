public class ArrayResizer {

    public static boolean isNonZeroRow(int[][] array2D, int r) {
        // TYPE UP YOUR PART A CODE HERE
        for(int i = 0; i < array2D[0].length; i ++){
            if(array2D[r][i] == 0){
                return false;
            }
        }
        return true;
    }

    public static int[][] resize(int[][] array2D) {
        int nonZeroRows = numNonZeroRows(array2D);
	    int j = 0; 
	    int[][] newArray = new int[nonZeroRows][array2D[0].length];
	    for(int i = 0; i < array2D.length; i ++){
		    boolean noZeroes = isNonZeroRow(array2D, i);
		    if(noZeroes){
			    newArray[j] = array2D[i];
			    j ++;
		    }   
	    }
	    return newArray;
    }

   // CODE BELOW ADDED TO ENABLE TESTING; NOT SHOWN IN ORIGINAL FRQ
    public static int numNonZeroRows(int[][] array2D) {
        int nonZeroRowCount = 0;
        for (int row = 0; row < array2D.length; row++) {
            boolean hasZeros = false;
            for (int col = 0; col < array2D[0].length; col++) {
                if (array2D[row][col] == 0) {
                    hasZeros = true;
                }
            }
            if (!hasZeros) {
                nonZeroRowCount++;
            }
        }
        return nonZeroRowCount;
    }
}
