# Button Interface
### CS505 Fall17 Group1: <br>
Emily Park, Jeffrey Blankenship, Cecelia Oluwadoyinsola, James Luczynski, Melissa Mulcahy <br>

-----
Usage
-----

This is a java interface for usage with the button device that connects to
the Raspberry Pi.  It follows a state design pattern and is customizable for most  desired uses.

NOTE: StateA.java, StateB.java, StateC.java, and ButtonAContext.java are samples of how to utilize the abstract class and interface provided. StateDemo.java demonstrates a way to implement this.

Update notes will be included in this ReadMe file for easy reference.

**11/15/17 Update**
- Renamed StateTester class to StateDemo to more accurately indicate that this is a demonstration of how the provided State pattern can be implemented.
- Changed ButtonContext.buttonState visibility to protected and removed redundant class variable ButtonAContext.buttonState.
- Provided default functionality in ButtonContext methods and removed abstract designation.
- Updated javadoc and readme to reflect these changes.


**10/31/17 Update**
- Created source folder structure to reflect package structure.
- Added Javadoc for all classes.
- ButtonContext constructor changed to protected and to require an initial state.
- ButtonContext methods changed to void, state changes are kept within ButtonContext.
- Clarified instructions for state changes via button methods. Moved this guidance to the more generic ButtonState class description.
- Updated Javadoc to include formatting per [Oracle styleguide](http://www.oracle.com/technetwork/articles/java/index-137868.html)
