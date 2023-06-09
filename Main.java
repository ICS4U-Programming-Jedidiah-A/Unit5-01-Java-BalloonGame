import java.awt.Color;

/**
* This program calculates amount of mean median and mode.
*
* @author  Jedidiah Alfred
* @version 1.0
* @since   2023-05-13
*/

public class Main {
    public static void main(String[] args) {
        // creating the balloon and spike objects
        Balloon balloon1 = new Balloon(65, 18, Color.GREEN, 1);
        Spike spike = new Spike(30);

        // This next section we will be hardcoding input to show that all
        // the methods work
        System.out.println("Starting values for the balloon are | X: "
                + balloon1.xPosition + " | Y: " + balloon1.yPosition + " | id: "
                + balloon1.id + " | Popped? " + balloon1.popped
                + " | RGB Color Value: " + balloon1.color);
        System.out.println("The starting position of the spike is x: "
                + spike.xPosition + " | y: 0");
        // using the methods to manipulate the first balloon
        System.out.println("change the color of the balloon to "
            + "RED and move it's position to x: 65 | y: 0");
        balloon1.changeColor(Color.RED);
        balloon1.moveBalloon(65, 0);
        System.out.println(outputB(balloon1));
        System.out.println("spike Moved to x: 65 | y: 0");
        spike.moveSpike(65);
        System.out.println(outputS(spike));
        spike.popBalloon(balloon1);
        System.out.println(outputB(balloon1));
    }

    /**
    * This is the method returns a string.
    *
    * @param spike This is the spike for the output
    * @return A string that will be outputted
    */

    public static String outputS(Spike spike) {
        return "The spike's new position is x: " + spike.xPosition + " | y: 0";
    }

    /**
    * This is the method returns a string.
    *
    * @param balloon This is the balloon that the output is being based off
    * @return A string that will be outputted
    */
    public static String outputB(Balloon balloon) {
        return (balloon.popped) ? "Balloon" + balloon.id + " has popped"
            : "New values for balloon" + balloon.id + " | X: "
                + balloon.xPosition + " | Y: " + balloon.yPosition + " | id: "
                + balloon.id + " | Popped? " + balloon.popped
                + " | RGB Color value: " + balloon.color;
    }
}