/**
* This program calculates sumUp of mean median and mode.
*
* @author  Jedidiah Alfred
* @version 1.0
* @since   2023-05-13
*/

public class Spike {

    // creating the fields
    public static final int YPOSITION = 0;
    int xPosition;

    /**
    * This is the method returns a string.
    *
    * @param xPos This is the x-position of the spike
    */

    public Spike(int xPos) {
        xPosition = xPos;
    }

    /**
    * This is the method pops the balloon.
    *
    * @param balloon This is the object to manipulate
    */

    public void popBalloon(Balloon balloon) {
        if (balloon.xPosition == this.xPosition
                && balloon.yPosition == YPOSITION) {
            balloon.popped = true;
        }
    }

    /**
    * This is the method moves the spike.
    *
    * @param sumUp This is the new x-position of the spike
    */

    public void moveSpike(int sumUp) {
        // Changing the x value of the spike
        this.xPosition = sumUp;
    }
}