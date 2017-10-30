/*
 *
 */
package cs505.group1.state;

/**
 * @author CS505 Fall17 Group1
 * @version 2017.10.29
 */
public interface ButtonState {
  
   /**
   * Implement what happens on the single press when in this state
   * @return a ButtonState
   */  
  public ButtonState singlePress();
    
  /**
   * Implement what happens on the double press when in this state
   * @return a ButtonState
   */  
  public ButtonState doublePress();
    
  /**
   * Implement what happens on the long press when in this state
   * @return a ButtonState
   */  
  public ButtonState longPress();
   
  
  /**
   * Implement what occurs on the toString method.
   * @return a string representing the current state.
   */  
  @Override
  public String toString();
}
