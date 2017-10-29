/*
 *
 */
package cs505.group1.state;

/**
 * @author CS505 Fall17 Group1
 */
public interface ButtonState {
  
  /**
   * Include a constructor in concrete implementations
   * @return 
   */
  //public State(){
  //};
  
  public ButtonState singlePress();
    
  public ButtonState doublePress();
    
  public ButtonState longPress();
   
  @Override
  public String toString();
}
