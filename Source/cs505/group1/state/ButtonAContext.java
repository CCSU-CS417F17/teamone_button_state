/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs505.group1.state;

/**
 * @author CS505 Fall17 Group1
 */
public class ButtonAContext extends ButtonContext{
    // buttonState is the current state 
    private ButtonState buttonState;
        
    // Constructor
    public ButtonAContext(ButtonState buttonState){
        super(buttonState);  //calls the parent class constructor
        this.buttonState = buttonState; 
    }
    
    public void singlePress(){
      buttonState = buttonState.singlePress();
    };
    
    public void doublePress(){
      buttonState = buttonState.doublePress();
    };
    
    public void longPress(){
      buttonState = buttonState.longPress();
    };
    
    public void setState(ButtonState  newState){
        System.out.println("setState method in ButtonAAAAAContext");
      this.buttonState = newState;
    };
    
    public ButtonState getState(){
      return this.buttonState;
    };
    
    public String toString(){
        return this.buttonState.toString();
    };
        
}
