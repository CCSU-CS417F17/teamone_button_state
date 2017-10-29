/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs505.group1.state;

/**
 *
 * @author CS505 Fall17 Group1
 * 
 * TO CHANGE THE STATE:
 * The line "ButtonStateA newState = new ButtonStateA();"
 * in each method can be changed to a different state such as
 * "ButtonStateA newState = new ButtonStateB();"
 * This allows the method to return a different state.
 */
public class StateA implements ButtonState{

    public StateA() {
    }
    
    public ButtonState singlePress(){
        System.out.println("StateA, singlePress detected.");
        ButtonState newState = new StateA();  //See comments for usage
        return (ButtonState) newState;
    };
    
    public ButtonState doublePress(){
        System.out.println("StateA, doublePress detected. Going to State B.");
        ButtonState newState = new StateA();  //See comments for usage
        return  newState;
    };
    
    public ButtonState longPress(){
        System.out.println("StateA, longPress detected.");
        ButtonState newState = new StateA();  //See comments for usage
        return (ButtonState) newState;
    };
    
    @Override
    public String toString(){
      return "StateA";
    };
    
    
}
