package cs505.group1.state;

/**
 * A framework for developing and using contexts in a finite state machine
 * to set actions generated by a GrovePi button sensor.
 * This class can be used as provided for a single context, or extended into 
 * multiple contexts for additional flexibility. 
 * 
 * 
 * @author CS505 Fall17 Group1: <br>
 * Emily Park, Jeffrey Blankenship, Cecelia Oluwadoyinsola, James Luczynski, Melissa Mulcahy <br>
 * @version 2017.11.15
 */
public class ButtonContext {
 
    /**
     * This instance variable stores the current buttonState.
     */
    protected ButtonState buttonState;
    
    /**
     * Constructs a newly allocated ButtonContext object that represents the specified buttonState.
     * 
     * @param buttonState sets the initial value of buttonState.
     */
    protected ButtonContext(ButtonState buttonState){
        this.buttonState = buttonState;
    }
    
    /**
     * Invokes the singlePress method of the concrete class for the
     * current state.  
     */
    public void singlePress(){
      this.buttonState.singlePress();
    };
    
    /**
     * Invokes the doublePress method of the concrete class for the
     * current state.  
     */
    public void doublePress(){
      buttonState = buttonState.doublePress();
    };
    
    /**
     * Invokes the longPress method of the concrete class for the
     * current state.  
     */
    public void longPress(){
      buttonState = buttonState.longPress();
    };
    
    /**
     * Sets the state to be equal to the passed state.
     * @param buttonState The state to be set.
     */
    public void setState(ButtonState  buttonState){
      this.buttonState = buttonState;
    };
    
    /**
     * Gets the current state.
     * @return ButtonState
     */
    public ButtonState getState(){
      return this.buttonState;
    };
    
    /**
     * Invokes the toString method of the concrete class for the
     * current state.  
     * @return String
     */
    @Override
    public String toString(){
        return this.buttonState.toString();
    };
}
