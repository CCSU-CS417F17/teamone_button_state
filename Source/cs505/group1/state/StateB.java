
package cs505.group1.state;

/**
 * Example of a concrete subclass of ButtonState
 * 
 * @author CS505 Fall17 Group1: <br>
 * Emily Park<br>
 * Jeffrey Blankenship  <br>
 * Cecelia Oluwadoyinsola<br>
 * James Luczynski<br>
 * Melissa Mulcahy <br>
 * @version 2017.10.29
 */
public class StateB implements ButtonState{

  /**
   * Constructs a newly allocated StateB object.
   */
    public StateB() {
    }
    
    public ButtonState singlePress(){
        System.out.println("StateB, singlePress detected.");
        ButtonState newState = new StateB(); 
        return (ButtonState) newState;
    };
    
    public ButtonState doublePress(){
        System.out.println("StateB, doublePress detected.");
        ButtonState newState = new StateB(); 
        return  newState;
    };
    
    public ButtonState longPress(){
        System.out.println("StateB, longPress detected.");
        ButtonState newState = new StateB(); 
        return (ButtonState) newState;
    };
    
    @Override
    public String toString(){
      return "StateB";
    };
    
    
}
