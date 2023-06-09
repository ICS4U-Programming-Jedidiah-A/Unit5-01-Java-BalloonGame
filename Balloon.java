import java.awt.*;

/**
* This program calculates amount of mean median and mode.
*
* @author  Jedidiah Alfred
* @version 1.0
* @since   2023-05-13
*/

public class Balloon {

    // Creating the fields for balloon position
    Color color;
    int xPosition;
    int yPosition;
    boolean popped;
    int id;

    public Balloon(int xPos, int yPos, Color mainColor, int intId) {

        // Setting the values of the fields
        xPosition = xPos;
        yPosition = yPos;
        color = mainColor;
        popped = false;
        id = intId;
    }

    /**
    * This is the method changes a ballon's position.
    *
    * @param xChange This is the new x-position
    * @param yChange This is the new y-position
    */

    public void moveBalloon(int xSpaces, int ySpaces) {
        // "This." is a reference to the current object. In this case, it is
        // reassigning the current x and y values
        this.xPosition = xSpaces;
        this.yPosition = ySpaces;
    }

    /**
    * This is the method changes a ballon's color.
    *
    * @param newColor This is the color to be changed to
    */

    public void changeColor(Color newColor) {
        // "This." is a reference to the current object. In this case, it is
        // reassigning the current color
        this.color = newColor;
    }

}
