public class Bird extends Animals {
    public Bird(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return name + " takes off in flight.";
    }

    @Override
    public String breathe() {
        return "Breathes air";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}

