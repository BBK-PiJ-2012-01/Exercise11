package exercise11;

import common.Exercise;
import common.IOGeneric;
import multipleInheritance.Guitar;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 14:59
 */
public class GuitarExercise implements Exercise {

    @Override
    public String getTitle() {
        return "Twisted firestarter";
    }

    @Override
    public String getDescription() {
        return "Tells the tale of Bob, the musical arsonist.";
    }

    @Override
    public void run() {
        Guitar guitar = new Guitar();

        IOGeneric.printTitle("Bob will now play his treasured guitar:");
        guitar.play();
        System.out.println();

        IOGeneric.printTitle("Bob will now BURN his treasured guitar:");
        guitar.burn();
        System.out.println();

    }
}
