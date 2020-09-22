package exercise.ArrayList;

import exercise.ArrayList.MyList;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> listNumber = new MyList<>();
        MyList<Integer> newlistNumber = new MyList<>();
        listNumber.add(1);
        listNumber.add(4);
        listNumber.add(7);
        listNumber.add(8);


        for(int i = 0;i < listNumber.size();i++){
            System.out.println("element "+(i+1)+" is : "+listNumber.get(i));
        }

        listNumber.add(6,2);
        System.out.println("After add.");

        for(int i = 0;i < listNumber.size();i++){
            System.out.println("element "+(i+1)+" is : "+listNumber.get(i));
        }

        System.out.println("After remove.");

        listNumber.remove(3);
        for(int i = 0;i < listNumber.size();i++){
            System.out.println("element "+(i+1)+" is : "+listNumber.get(i));
        }

//        System.out.println("After clone.");
//        newlistNumber = listNumber.clone();
//        for(int i = 0;i < newlistNumber.size();i++){
//            System.out.println("element "+(i+1)+" is : "+newlistNumber.get(i));
//        }
        System.out.println("After indexOf.");
        System.out.println(listNumber.indexOf(4));
        System.out.println("After constains.");
        System.out.println(listNumber.contains(9));
    }
}
