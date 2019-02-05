package arrayList;

public class TestArray {

    public static void main(String[] args) {
        MyOwnArrayList<String> myArrayList = new MyOwnArrayList<>();
        String name1 = "name1", name2 = "name2", name3 = "name3";

        myArrayList.add(name2);
        myArrayList.add(3, name1);
        myArrayList.add(2, name2);
        myArrayList.add(1, name3);

        System.out.println("get index:1 (name3)" + "\n" + myArrayList.get(1) + "\n");
        System.out.println("array: " + "\n" + myArrayList.toString() + "\n");
        System.out.println("removing index:2 (name2)");
        myArrayList.remove(2);
        System.out.println(myArrayList.toString() + "\n");
        myArrayList.add(5, name1);
        System.out.println("added name1 with index 5 " + "\n" + myArrayList.toString());
    }
}
