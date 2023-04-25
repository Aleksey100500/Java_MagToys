public class Toy {
    private int id;
    private String name;
    private int quantity;
    private int frequency;

    public Toy(int id, String name, int quantity, int frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void removeQuantity(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Not enough toys!");
        }
    }
}


/* Функциями можно воспользоваться, скрыл т.к. они не обязательны */

//    public int getId() {
//        return id;
//    }

//    public int getQuantity() {
//        return quantity;
//    }

//    public void setFrequency(int frequency) {
//        this.frequency = frequency;
//    }

//    public void addQuantity(int quantity) {
//        this.quantity += quantity;
//    }


