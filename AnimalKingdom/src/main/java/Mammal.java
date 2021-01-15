public class Mammal extends Animals {
    public Mammal(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return name + " starts walking.";
    }

    @Override
    public String breathe() {
        return "Breathes using lungs";
    }

    @Override
    public String reproduce() {
        return name + " has just had a live birth! Welcome the new " + name;
    }
}

