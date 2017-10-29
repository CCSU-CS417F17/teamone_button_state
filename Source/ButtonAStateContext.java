/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs505.group1.state;

/**
 * @author CS505 Fall17 Group1
 */
public class ButtonAStateContext extends ButtonStateContext{
    // buttonState is the current state 
    private ButtonState buttonState;
        
    // Constructor
    public ButtonAStateContext(){
        this.buttonState = null;
    }
    
    public ButtonState singlePress(){
      buttonState = buttonState.singlePress();
      return buttonState;
    };
    
    public ButtonState doublePress(){
      buttonState = buttonState.doublePress();
      return buttonState;
    };
    
    public ButtonState longPress(){
      buttonState = buttonState.longPress();
      return buttonState;
    };
    
    @Override
    public String toString(){
      return buttonState.toString();
    }
    
}
