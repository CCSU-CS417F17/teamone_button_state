package cs505.group1.state;

/**
 * Example of a concrete subclass of ButtonState
 * 
 * @author CS505 Fall17 Group1
 * 
 */
public class StateA implements ButtonState{

  /**
   * Constructs a newly allocated StateA object.
   */
    public StateA() {
    }
    
    /**
     * Processes a single button press, with capability to change state.
     * 
     * The object returned is StateA in the example.  Assigning an object of another
     * state to newState will result in a state change as a result of the singlePress.
     * 
     * @return ButtonState object 
     */
    @Override
    public ButtonState singlePress(){
        System.out.println("StateA, singlePress detected.");
        ButtonState newState = new StateA();  
        return (ButtonState) newState;
    };
    
    /**
     * Processes a double button press, with capability to change state.
     * 
     * The object returned is StateA in the example.  Assigning an object of another
     * state to newState will result in a state change as a result of the singlePress.
     * 
     * @return ButtonState object 
     */
    public ButtonState doublePress(){
        System.out.println("StateA, doublePress detected.");
        ButtonState newState = new StateA(); 
        return  newState;
    };
    
    /**
     * Processes a long button press, with capability to change state.
     * 
     * The object returned is StateA in the example.  Assigning an object of another
     * state to newState will result in a state change as a result of the singlePress.
     * 
     * @return ButtonState object 
     */
    public ButtonState longPress(){
        System.out.println("StateA, longPress detected.");
        ButtonState newState = new StateA();  
        return (ButtonState) newState;
    };
    
    @Override
    public String toString(){
      return "StateA";
    };
}
