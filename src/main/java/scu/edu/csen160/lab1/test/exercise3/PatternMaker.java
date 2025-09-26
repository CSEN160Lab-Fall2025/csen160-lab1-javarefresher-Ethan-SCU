package scu.edu.csen160.lab1.test.exercise3;

public class PatternMaker {
    private int noOfTimes, offset;
    private char symbol;

    public static String drawOneLine(char symbol, int noOfTimes, int
            offset){
        // Write Java code to draw the symbol for the noOfTimes
        // after drawing a number of blankspaces (offset) .
        // For example, if the symbol is "*", noOfTimes is 10
        // and offset is 3,it should draw 3 blank spaces and
        // then draw 10 stars.

        int countoff = 0;
        int counttimes = 0;
        StringBuilder result = new StringBuilder();
        while (countoff < offset || counttimes < noOfTimes){
            if (countoff < offset){
                result.append(" ");
                countoff++;
            }
            else if(counttimes < noOfTimes){
                result.append(symbol);
                counttimes++;
            }

        }
        // Write a for – loop to draw offset number of blank spaces.
        // for example, if offset is 3, it should draw 3 blank
        // spaces. Use System.out.print(" ") to print a single
        // blank space. Write a for – loop to draw the symbol,
        // the noOfTimes.

        /*for (int i = 0; i < offset; i++) {
           result.append(" ");
        }
        for (int j = 0; j < noOfTimes; j++) {
           result.append(symbol);
        }
        */
        return result.toString();
    }
    public static String drawPattern() {
        // This method should draw the following pattern:
        // 1. line, should have 4 blank spaces followed by 4 stars.
        // 2. line will have 8 blank spaces followed by 8 stars.
        // 3. line will have 12 blank spaces followed by 12 stars.
        // ****
        // ********
        // ************
        // The method should call the method, drawOneLine()
        //
        StringBuilder pattern = new StringBuilder();
        pattern.append(drawOneLine('*',4,4)).append("\n");
        pattern.append(drawOneLine('*',8,8)).append("\n");
        pattern.append(drawOneLine('*',12,12)).append("\n");

        return pattern.toString();
    }
}
