public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> boxInt = new MagicBox<>(5);
        MagicBox<String> boxStr = new MagicBox<>(3);
        //boxInt.getItems();
        boxInt.add(3);
        boxInt.add(8);
        boxInt.add(1);
        boxInt.add(17);
        boxInt.add(1);
        //System.out.println(boxInt.isFull());
        //boxInt.add(17);
        //boxInt.add(17);
        boxInt.pick();
        //boxInt.getItems();
        //boxStr.pick();
    }
}
