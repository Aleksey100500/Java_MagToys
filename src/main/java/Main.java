public class Main {
    public static void main(String[] args) {
        ToyMachine toyMachine = new ToyMachine();
        Toy toy1 = new Toy(1, "Teddy Bear", 10, 5);
        Toy toy2 = new Toy(2, "Doll", 10, 3);
        Toy toy3 = new Toy(3, "Mickey Mouse", 10, 2);
        Toy toy4 = new Toy(4, "Snake", 10, 5);
        toyMachine.addToy(toy1);
        toyMachine.addToy(toy2);
        toyMachine.addToy(toy3);
        toyMachine.addToy(toy4);
        Toy selectedToy = toyMachine.selectToy();
        if (selectedToy != null) {
            System.out.println("Congratulations! You won a " + selectedToy.getName());
        } else {
            System.out.println("Sorry, no toys left.");
        }
    }
}
