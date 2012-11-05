package NoahArc;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 15:39
 */
public enum TimeFrame {
    now("%s is coming..."),
    after_flying("%s now flying, will come later when tired..."),
    never("%s will not come...");

    private String preformatted_string;

    TimeFrame(String preformatted_string) {
        this.preformatted_string = preformatted_string + "\n";
    }

    void call(String animal) {
        System.out.format(preformatted_string, animal);
    }
}
