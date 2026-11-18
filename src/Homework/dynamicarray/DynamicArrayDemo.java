package Homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(10);
        da.add(7);
        da.add(3);
        da.add(5);
        da.add(30);
        da.print();
        DynamicArray da2 = new DynamicArray();
        for (int i = 1; i <= 15; i++) {
            da2.add(i);
        }
        da2.print();
        DynamicArray da3 = new DynamicArray();
        for (int i = 1; i <= 25; i++) {
            da3.add(i);
        }
        da3.print();
        System.out.println(da3.getByIndex(0));
        System.out.println(da3.getByIndex(24));
        System.out.println(da3.getByIndex(-1));
        System.out.println(da3.getByIndex(26));
        DynamicArray da4 = new DynamicArray();
        System.out.println(da4.getByIndex(0));
    }
}
