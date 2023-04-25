import java.util.ArrayList;
import java.util.List;

public class ToyMachine {
    private List<Toy> toys;

    public ToyMachine() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public Toy selectToy() {
        int totalFrequency = 0;
        for (Toy toy : toys) {
            totalFrequency += toy.getFrequency();
        }
        int random = (int) (Math.random() * totalFrequency);
        int cumulativeFrequency = 0;
        for (Toy toy : toys) {
            cumulativeFrequency += toy.getFrequency();
            if (random < cumulativeFrequency) {
                toy.removeQuantity(1);
                return toy;
            }
        }
        return null;
    }

//    public void changeFrequency(int toyId, int frequency) {
//        for (Toy toy : toys) {
//            if (toy.getId() == toyId) {
//                toy.setFrequency(frequency);
//                break;
//            }
//        }
//    }
}
