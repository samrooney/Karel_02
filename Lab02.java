/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Sam Rooney>  // replace <sam Rooney> with your name
* @version <29/10/14> // replace <30/10/14> with the date
*/


import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Lab02 {

     public static void main(String[] args) {
        
            Display.openWorld("maps/maze.map");
            Display.setSize(8, 8);
            Athlete Sammy = new Athlete();
            Sammy.putBeeper();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.turnRight();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.turnRight();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.turnLeft();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.turnLeft();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.turnRight();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.turnRight();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.turnLeft();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.turnLeft();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.turnRight();
            Sammy.move();
            Sammy.putBeeper();
            Sammy.move();
     }
}