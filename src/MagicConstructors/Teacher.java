package MagicConstructors;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 15:07
 */
public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void teach(String lessonName) {
        System.out.println("Teaching lesson: " + lessonName);
    }
}
