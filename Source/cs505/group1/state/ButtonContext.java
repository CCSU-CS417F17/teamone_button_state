/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs505.group1.state;

/**
 * @author CS505 Fall17 Group1
 * @version 2017.10.29
 */
abstract class ButtonContext {
    
    private ButtonState buttonState;
    
    /**
     * Constructor.  In concrete extensions buttonState  
     * must be assigned an initial value such as
     * this.buttonState =  new StateA();
     */
    public ButtonContext(){
        this.buttonState = null;
    }
    
    /**
     * Implements code for a single button press.
     * @return State allows a state change 
     */
    public abstract ButtonState singlePress();
    
    /**
     * Implements code for a double button press.
     * @return State allows a state change 
     */
    public abstract ButtonState doublePress();
    
    /**
     * Implements code for a long button press.
     * @return State allows a state change 
     */
    public abstract ButtonState longPress();
    
    /**
     * Sets the state to be equal to the passed State.
     * @param newState 
     */
    public void setState(ButtonState  newState){
      this.buttonState = newState;
    };
    
    /**
     * Gets the current state.
     * @return State
     */
    public ButtonState getState(){
      return this.buttonState;
    };
    
    /**
     * Invokes the toString method of the concrete class for the
     * current state.  
     * @return toString or empty string if state is null.
     */
    public String toString()
    {
      if(this.buttonState == null)
        return "";
      else
      {
        return this.buttonState.toString();
      }
      
    };
    
}
