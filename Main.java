package OOP_3HW;

public class Main{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);
        list.add(88);
        list.add(99);

        list.forEach(System.out::println);
        System.out.println();
        System.out.println(String.format("Size: %d", list.size()));
        System.out.println();
        System.out.println(list.getPreviousByIndex(1));
        System.out.println(list.getByIndex(1));
        System.out.println(list.getNextByIndex(1));
        list.replaceByIndex(8, 66);
        System.out.println(list.getByIndex(8));
    }
}