public class Greeter {
    private final String who;

    public Greeter(String who) {
        this.who = who;
    }

    public String greet() {
        return "Hello, " + who;
    }
}
