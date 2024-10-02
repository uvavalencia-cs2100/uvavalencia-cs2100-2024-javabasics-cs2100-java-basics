package generics;

public class Animal implements MyComparable<Animal> {
    
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Animal o) {
        Animal other = (Animal) o;
        return this.name.compareTo(other.getName());
    }
}
