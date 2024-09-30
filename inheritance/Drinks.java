package inheritance;

// Base Class
class Drink {
    protected String name;
    protected int volume; // in ml

    public Drink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String describe() {
        return name + " contains " + volume + " ml.";
    }
}

// Derived Class: AlcoholicDrink
class AlcoholicDrink extends Drink {
    private double alcoholContent; // in percentage

    public AlcoholicDrink(String name, int volume, double alcoholContent) {
        super(name, volume);
        this.alcoholContent = alcoholContent;
    }

    @Override
    public String describe() {
        return super.describe() + " It has " + alcoholContent + "% alcohol content.";
    }
}

// Derived Class: NonAlcoholicDrink
class NonAlcoholicDrink extends Drink {
    public NonAlcoholicDrink(String name, int volume) {
        super(name, volume);
    }
}
