package cs505.group1.state;

/**
 * An example concrete subclass of ButtonContext.  
 * 
 * @author CS505 Fall17 Group1: <br>
 * Emily Park<br>
 * Jeffrey Blankenship  <br>
 * Cecelia Oluwadoyinsola<br>
 * James Luczynski<br>
 * Melissa Mulcahy <br>
 * @version 2017.10.29
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
    
    public void setState(ButtonState  buttonState){
      this.buttonState = buttonState;
    };
    
    public ButtonState getState(){
      return this.buttonState;
    };
    
    public String toString(){
        return this.buttonState.toString();
    };
        
}
