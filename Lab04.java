/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04
{
  public static void takeTheField(Athlete arg)
  {
	arg.move();
	arg.move();
	arg.move();
	arg.move();
	arg.turnRight();
	arg.move();
	arg.move();
  }
  public static void coach(Athlete arg){
  arg.move();
  arg.move();
  arg.move();
  arg.move();
  arg.move();
  arg.move();
  arg.turnRight();
  arg.move();
}
  
  public static void main(String[] args) {
          
             Display.openWorld("maps/arena.map");
   Display.setSize(10, 10);
   Display.setSpeed(5);

   Athlete pete = new Athlete();
   Athlete john = new Athlete();
   Athlete jack = new Athlete();
   Athlete pat = new Athlete();
   Athlete alex = new Athlete();
   Athlete joe = new Athlete();
   Athlete bob = new Athlete();
   
   takeTheField(pete);
	takeTheField(john);
   takeTheField(jack);
   takeTheField(pat);
   takeTheField(alex);
   takeTheField(joe);
   pete.move();
   pete.move();
   pete.move();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.turnAround();
   john.move();
   john.move();
   john.move();
   john.move();
   john.move();
   john.turnLeft();
   john.move();
   john.turnAround();
   jack.move();
   jack.move();
   jack.move();
   jack.move();
   jack.turnRight();
   pat.move();
   pat.move();
   pat.move();
   pat.turnRight();
   alex.move();
   alex.move();
   alex.turnRight();
   joe.move();
   joe.turnLeft();
   joe.move();
   joe.turnAround();
   coach(bob);
   

   }
   
}

