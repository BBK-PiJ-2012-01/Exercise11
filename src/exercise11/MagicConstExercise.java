package exercise11;

import MagicConstructors.Lecturer;
import common.Exercise;
import common.IOGeneric;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 15:09
 */
public class MagicConstExercise implements Exercise {
    @Override
    public String getTitle() {
        return "Magic constructors";
    }

    @Override
    public String getDescription() {
        return "When a superclass has a non-default constructor, all subclasses\n" +
                "must refer to it with 'super' in the subclass constructor.";
    }

    @Override
    public void run() {
        Lecturer bob = new Lecturer("Bob");

        IOGeneric.printTitle("Lecturer Bob has a lesson");
        bob.teach("Programming in Java");
        System.out.println();

        IOGeneric.printTitle("Lecturer Bob is doing some research");
        bob.doResearch("Cooperative models in data mining");
        System.out.println();
    }
}
