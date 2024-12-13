
/**
 * Write a description of class Trailer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trailer {
    private String name;

    public Trailer(String name) {
        this.name = name;
    }

    public void tow() {
        System.out.println("Towing the " + name + " trailer.");
    }
}
