public class Fish extends Animals {
    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return name + "swimming.";
    }

    @Override
    public String breathe() {
        return "Breathes under water";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}
