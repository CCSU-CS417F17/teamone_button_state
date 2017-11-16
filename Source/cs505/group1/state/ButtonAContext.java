package cs505.group1.state;

/**
 * An example extension of ButtonContext.  
 * 
 * Extensions of ButtonContext require only their own constructor.  
 * All methods of ButtonContext pass method calls to ButtonState and its
 * subclasses, but may be overridden if non-generic behavior is required.
 * 
 * @author CS505 Fall17 Group1: <br>
 * Emily Park, Jeffrey Blankenship, Cecelia Oluwadoyinsola, James Luczynski, Melissa Mulcahy <br>
 * @version 2017.11.15
 */
public class ButtonAContext extends ButtonContext{
        
    /**
     * Constructs a new ButtonAContext object and initializes it with the specified ButtonState
     * @param buttonState The initial ButtonState
     */
    public ButtonAContext(ButtonState buttonState){
        super(buttonState);  //calls the parent class constructor
        this.buttonState = buttonState; 
    }
       
}
