package arrayList;

public class testArray {

    public static void main(String[] args) {
        MyOwnArrayList<String> myArrayList = new MyOwnArrayList<>();
        String name1 = "name1", name2 = "name2", name3 = "name3";

        myArrayList.add(name1, 3);
        myArrayList.add(name2, 2);
        myArrayList.add(name3, 1);

        System.out.println("get index:1 (name3)" + "\n" + myArrayList.get(1) + "\n");
        System.out.println("array: " + "\n" + myArrayList.toString() + "\n");
        System.out.println("removing index:2 (name2)");
        myArrayList.remove(2);
        System.out.println(myArrayList.toString() + "\n");
        myArrayList.add(name1, 5);
        System.out.println("added name1 with index 5 " + "\n" + myArrayList.toString());
    }
}
