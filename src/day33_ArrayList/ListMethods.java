package day33_ArrayList;

import java.util.ArrayList;

public class ListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(200);
        list1.add(300);

        list1.set(1, 400);

        System.out.println(list1);

        ArrayList<String> names = new ArrayList<>();
        names.add("Yalcin");
        names.add("Amina");
        names.add("Ercan");
        names.add("Ercan");
        names.add("Tayfun");
        names.add("Mustafa");
        names.add("Tayfun");
        names.add("Suveyda");
        names.add("Egemen");


        System.out.println(names);

        names.set(3, "Afrooz");
        names.set(6,"Fiona");
        System.out.println(names);

        int[] arr = {10,20,30,40};
        arr[1] = 200;


    }

}
