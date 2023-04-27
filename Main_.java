public class Main_ {
    public static void main(String[] args) {
        
        Toy hare = new Toy(1, "Hare");
        Toy rabbit = new Toy(2, "Rabbit");
        Toy blocks = new Toy(3, "Blocks");
        Toy clock = new Toy(4, "Clock");
        Toy plane = new Toy(5, "Plane");
        Toy drum = new Toy(6, "Drum");
        Toy doll = new Toy(7, "Doll");

        
        Toy_Lottery toy_lottery = new Toy_Lottery();
        toy_lottery.add_toy_in_listToy(hare);
        toy_lottery.add_toy_in_listToy(rabbit);
        toy_lottery.add_toy_in_listToy(blocks);
        toy_lottery.add_toy_in_listToy(clock);
        toy_lottery.add_toy_in_listToy(plane);
        toy_lottery.add_toy_in_listToy(drum);
        toy_lottery.add_toy_in_listToy(doll);

        
        toy_lottery.lottteryToy();
        toy_lottery.readFile();
        toy_lottery.lottteryToy();
        toy_lottery.readFile();
        
        toy_lottery.getToys();
        
        toy_lottery.getToy_count();
    }
}