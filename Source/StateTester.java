/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs505.group1.state;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author CS505 Fall17 Group1
 */
public class StateTester {

    /**
     * @param args the command line arguments
   * @throws java.io.IOException
     */
  
  /*
  public static void main(String[] args) throws IOException {
  Scanner scan = new Scanner(System.in);
  State stateA  = (State) new StateA();
  State stateB  = (State) new StateB();
  State stateC  = (State) new StateC();
  
  char input;
  ButtonStateContext state = new ButtonAStateContext();
  state.setState(stateA);
  
  System.out.println("State Tester.");
  System.out.println("1 : single press. \ta : setStateA");
  System.out.println("2 : double press. \tb : setStateB");
  System.out.println("3 : long press (hold)\tc : setStateC");
  System.out.println("e: exit");
  
  do {
  System.out.println("\nCurrent State:  " + state.toString() );
  System.out.print("Enter next input: ");
  input = scan.nextLine().charAt(0);
  
  switch (input) {
  case '1' : state.setState( state.singlePress()); break;
  case '2' : state.setState( state.doublePress()); break;
  case '3' : state.setState( state.longPress()  ); break;
  case 'a' : state.setState(stateA); break;
  case 'b' : state.setState(stateB); break;
  case 'c' : state.setState(stateC); break;
  case 'e' : break;  // caught in the loop condition, just here to avoid the default.
  default  : System.out.println("Error, switch default reached.");
  }
  
  } while (input != 'e');
  System.out.println("testing complete.");
  
  
  
  }
  */
}
