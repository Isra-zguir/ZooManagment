public class ZooManagment {
    public static void main(String[] args) {

        Animal lion = new Animal("Simba", "Lion", 5, true);


        Zoo myZoo = new Zoo("Belvidaire", "Tunis", 25);

        myZoo.displayZoo();


        System.out.println(myZoo);
        System.out.println(lion);
    }
}

