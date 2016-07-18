/*
*this is the viw or the display in the mvc format
*/
package fifteensquares;

import static fifteensquares.FifteenSquares.squares;

    public class Display {

        // implements the numbers to be placed in format style layout
        public void display() {
            System.out.println();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++)
                    System.out.print(format(squares[i * 4 + j]));
                System.out.println();
            }
        }

        // creates the grid style layout
        public String format(int number) {
            if (number == 0) return "   ";
            return ((number < 10) ? " " : "") + number + " ";
        }
    

    }
