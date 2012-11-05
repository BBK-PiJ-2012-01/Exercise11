package phone;

import common.Exercise;
import common.IOGeneric;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 14:06
 */
public class PhoneLauncherExercise implements Exercise {
    @Override
    public String getTitle() {
        return "Phone Inheritance";
    }

    @Override
    public String getDescription() {
        return "Demonstration of implementing an interface, then extending.";
    }

    @Override
    public void run() {
        SmartPhone smartPhone = new SmartPhone("Sony Xperia");

        IOGeneric.printTitle("Calling twelve numbers", "-");
        for (int i=0; i<12; ++i) {
            smartPhone.call( String.format("000%d", i) );
        }

        IOGeneric.printTitle("Recall last ten numbers", "-");
        smartPhone.printLastNumbers();
        System.out.println();

        IOGeneric.printTitle("Browsing the web", "-");
        smartPhone.browseWeb("http://www.dcs.bbk.ac.uk/courses/msccs/");
        System.out.println();

        IOGeneric.printTitle("Playing a game", "-");
        smartPhone.playGame("Pong");
        System.out.println();

        IOGeneric.printTitle("Ringing the alarm", "-");
        smartPhone.ringAlarm("Time to get up...");
        System.out.println();

        IOGeneric.printTitle("Finding my location", "-");
        System.out.format("My location is: %s\n", smartPhone.findPosition());
        System.out.println();

        IOGeneric.printTitle("Calling international number", "-");
        smartPhone.call("+34549585");
        System.out.println();
    }
}
