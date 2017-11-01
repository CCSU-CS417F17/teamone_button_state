
package cs505.group1.state;

import java.io.IOException;
import java.util.Scanner;

/**
 * Example of a Finite State Machine using the provided concrete subclass examples.
 * 
 * @author CS505 Fall17 Group1: <br>
 * Emily Park<br>
 * Jeffrey Blankenship  <br>
 * Cecelia Oluwadoyinsola<br>
 * James Luczynski<br>
 * Melissa Mulcahy <br>
 * @version 2017.10.29
 * 
 * To change the state by button operations:
 * The line "ButtonStateA newState = new ButtonStateA();"
 * in each method can be changed to a different state such as
 * "ButtonStateA newState = new ButtonStateB();"
 * This allows the method to return a different state.
 */
public class StateTester {

  public static void main(String[] args) throws IOException {
  Scanner scan = new Scanner(System.in);
  ButtonState stateA  = (ButtonState) new StateA();
  ButtonState stateB  = (ButtonState) new StateB();
  ButtonState stateC  = (ButtonState) new StateC();
  
  char input;
  
  ButtonAContext buttonState = new ButtonAContext(stateA);
  
  System.out.println("State Tester.");
  System.out.println("1 : single press. \ta : setStateA");
  System.out.println("2 : double press. \tb : setStateB");
  System.out.println("3 : long press (hold)\tc : setStateC");
  System.out.println("e: exit");
  
  do {
    System.out.println("\nCurrent buttonState:  " + buttonState.toString() );
    System.out.print("Enter next input: ");
    input = scan.nextLine().charAt(0);
    switch (input) {
        case '1' : buttonState.singlePress();     break;
        case '2' : buttonState.doublePress();     break;
        case '3' : buttonState.longPress();       break;
        case 'a' : buttonState.setState(stateA);  break;
        case 'b' : buttonState.setState(stateB);  break;
        case 'c' : buttonState.setState(stateC);  break;
        case 'e' : break;  //do nothing for 'e',  loop condition checks for 'e'
        default  : System.out.println("Error, switch default reached.");
    }
  } while (input != 'e');
  System.out.println("testing complete.");
  }
  
}
