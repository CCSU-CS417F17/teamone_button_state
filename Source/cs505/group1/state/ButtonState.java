/*
 *
 */
package cs505.group1.state;

/**
 * A set of methods for GrovePi button interactions which depend on machine state. 
 *    
 * Button actions include singlePress, doublePress, and longPress.  Additional actions
 * can be defined for specific requirements.<br>
 * <br>
 * Button press methods can return a different state by setting the returned object
 * to any implemented concrete state cast to ButtonState.
 * 
 * @author CS505 Fall17 Group1: <br>
 * Emily Park, Jeffrey Blankenship, Cecelia Oluwadoyinsola, James Luczynski, Melissa Mulcahy <br>
 * @version 2017.11.15
 */
public interface ButtonState {
  
   /**
   * Calls singlePress method of the concrete subclass.
   * @return a ButtonState object set by the concrete subclass.
   */  
  public ButtonState singlePress();
    
  /**
   * Calls doublePress method of the concrete subclass.
   * @return a ButtonState object set by the concrete subclass.
   */  
  public ButtonState doublePress();
    
  /**
   * Calls longPress method of the concrete subclass.
   * @return a ButtonState object set by the concrete subclass.
   */  
  public ButtonState longPress();
   
  
  /**
   * Calls toString method of the concrete subclass.
   * @return a string set by the concrete subclass.
   */  
  @Override
  public String toString();
}
