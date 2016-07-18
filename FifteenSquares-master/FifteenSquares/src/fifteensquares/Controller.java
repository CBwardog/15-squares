/*
*this is the brains of the operation used to make the program work
*Author: Mitchell Vessair
*/
package fifteensquares;

    import static fifteensquares.FifteenSquares.squares;
    //imports squares array to be called in the methods below

    public class Controller {

    //all the methods are set to "public static" to allow them to be called by the methods in the main class
        
        // move allows the blank space to be moved
        public static void move(int number) {
            if (number >= squares.length)
                return;
            int i; 
            for (i = 0; i < squares.length; i++)
                if (squares[i] == number) 
                    // squares[i] += 10;
                    break;
            if (tryAbove(i)) return;
            if (tryBelow(i)) return;
            if (tryLeft(i))  return;
            if (tryRight(i)) {
            }
        }

        //"tryAbove" method checks for blank space then moves the whole line towards its original position if true
        public static boolean tryAbove(int pos) {
            if (pos < 4)
                return false;
            if (squares[pos - 4] != 0 && ! tryAbove(pos - 4))
                return false;
            swap(pos, pos - 4);
            return true;
        }

        // "tryBelow" method checks for blank space then moves the whole line towards its original position if true
        public static boolean tryBelow(int pos) {
            if (pos > 11)
                return false;
            if (squares[pos + 4] != 0 && ! tryBelow(pos + 4))
                return false;
            swap(pos, pos + 4);
            return true;
        }

        //"tryLeft" method checks for blank space then moves the whole line towards its original position if true
        public static boolean tryLeft(int pos) {
            if (pos % 4 == 0)
                return false;
            if (squares[pos - 1] != 0 && ! tryLeft(pos - 1))
                return false;
            swap(pos, pos - 1);
            return true;
        }

        // "tryRight" method checks for blank space then moves the whole line towards its original position if true
        public static boolean tryRight(int pos) {
            if (pos % 4 == 3)
                return false;
            if (squares[pos + 1] != 0 && ! tryRight(pos + 1))
                return false;
            swap(pos, pos + 1);
            return true;
        }

        // swap tells the blank space how much it can move
        public static void swap(int one, int two) {
            int     temp = squares[one];
            squares[one] = squares[two];
            squares[two] = temp;
        }
        
    }
