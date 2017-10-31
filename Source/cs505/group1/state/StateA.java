/**
 * This class is provided as an example of a concrete 
 * implementation of ButtonState
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
        ButtonState newState = new StateB();  //See comments for usage
        return (ButtonState) newState;
    };
    
    public ButtonState doublePress(){
        System.out.println("StateA, doublePress detected.");
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