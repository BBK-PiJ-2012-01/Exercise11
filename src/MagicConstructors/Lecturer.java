package MagicConstructors;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 15:08
 */

/**
 * A lecturer has both teaching and research responsibilities
 */
public class Lecturer extends Teacher {
    public Lecturer(String name) {
        super(name);
    }

    public void doResearch(String topic) {
        System.out.println("Doing research on: " + topic);
    }
}