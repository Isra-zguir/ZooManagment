public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;


    public Zoo() {
        this.animals = new Animal[25]; // max 25 animaux
    }


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25]; // max 25 animaux
    }


    public void displayZoo() {
        System.out.println("Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]");
    }


    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}
