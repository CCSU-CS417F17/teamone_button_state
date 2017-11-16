package cs505.group1.state;

/**
 * Example of a concrete subclass of ButtonState
 * 
 * @author CS505 Fall17 Group1
 */
public class StateC implements ButtonState{

  /**
   * Constructs a newly allocated StateC object.
   */
    public StateC() {
    }
    
    public ButtonState singlePress(){
        System.out.println("StateC, singlePress detected.");
        ButtonState newState = new StateC();  
        return (ButtonState) newState;
    };
    
    public ButtonState doublePress(){
        System.out.println("StateC, doublePress detected.");
        ButtonState newState = new StateC();  
        return  newState;
    };
    
    public ButtonState longPress(){
        System.out.println("StateC, longPress detected.");
        ButtonState newState = new StateC();  
        return (ButtonState) newState;
    };
    
    @Override
    public String toString(){
      return "StateC";
    };
}
