package exercise11;

import NoahArc.Animal;
import NoahArc.AnimalFactory;
import NoahArc.TimeFrame;
import common.Exercise;
import common.IOGeneric;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 16:07
 */
public class NoahExercise implements Exercise {
    @Override
    public String getTitle() {
        return "Noah\'s arc";
    }

    @Override
    public String getDescription() {
        return "Demonstrates inheritance (Mammal is-a Animal, NonMammal is-a Animal)\n" +
                "and delegation (Animal has-a TimeFrame in which to board the Arc)\n" +
                "For good measure, I've thrown in a factory method to create an animal\n" +
                "(either Mammal or NonMammal) and return as an Animal (read: polymorphism)";
    }

    @Override
    public void run() {
        List<Animal> animals = new LinkedList<Animal>();

        animals.add( AnimalFactory.create("bear", true, TimeFrame.now, "ROAR!") );
        animals.add( AnimalFactory.create("beatle", true, TimeFrame.now, "Tick") );
        animals.add( AnimalFactory.create("cat", true, TimeFrame.now, "Meow!") );
        animals.add( AnimalFactory.create("crocodile", true, TimeFrame.never, "CHOMP!") );
        animals.add( AnimalFactory.create("dog", true, TimeFrame.now, "Bark!") );
        animals.add( AnimalFactory.create("dolphin", true, TimeFrame.never, "eup!?") );
        animals.add( AnimalFactory.create("eagle", true, TimeFrame.after_flying, "Kaa!") );
        animals.add( AnimalFactory.create("fly", true, TimeFrame.after_flying, "buzzz...") );
        animals.add( AnimalFactory.create("frog", true, TimeFrame.never, "Ribbit") );
        animals.add( AnimalFactory.create("lizard", true, TimeFrame.now, "Hiss!") );
        animals.add( AnimalFactory.create("monkey", true, TimeFrame.now, "Ooh ah ah ah!") );
        animals.add( AnimalFactory.create("pigeon", true, TimeFrame.after_flying, "Cooh cooh!") );
        animals.add( AnimalFactory.create("salmon", true, TimeFrame.never, "Swish swish...") );
        animals.add( AnimalFactory.create("shark", true, TimeFrame.never, "Crunch!") );
        animals.add( AnimalFactory.create("snake", true, TimeFrame.now, "Hiss!") );
        animals.add( AnimalFactory.create("whale", true, TimeFrame.never, "Ooooaaaaaaaooooh...") );

        IOGeneric.printTitle("Calling all animals!");
        for (Animal animal : animals) {
            animal.call();
        }
        System.out.println();

        IOGeneric.printTitle("Animals, attract your mates!");
        for (Animal animal : animals) {
            animal.makeSound();
        }
        System.out.println();

        IOGeneric.printTitle("On your marks, get set, reproduce!");
        for (Animal animal : animals) {
            animal.reproduce();
        }
        System.out.println();

    }
}
