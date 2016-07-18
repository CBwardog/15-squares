/*
* 15 squares
 */
package fifteensquares;

/**
 *
 * @author Mitchell Vessair
 */

    import java.util.Random; // utility library for randomizer
    import java.util.Scanner; // Scanner library

public class FifteenSquares {
       

    static Display display = new Display();
    static Controller controller = new Controller();
    //to call the methods from the controller class and display class
    
    public static Random rn    = new Random();
    public static int[]  squares = new int[16];

    public FifteenSquares() {
        for (int i = 1; i < squares.length; i++)
            squares[i - 1] = i;
        for (int i = 0; i < 400; i++)
            controller.move(rn.nextInt(squares.length - 1) + 1);
    }

    // main allows user to move blank space
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FifteenSquares puzzle = new FifteenSquares();
        int number;
        while (true) {
            display.display();
            //calling the display method from the Display class
            System.out.print("\nMove: ");
            number = input.nextInt();
            if (number == 0)
                break;
            controller.move(number);
            //calling the move() method from the Controller class
        }
    }
}
    
    

