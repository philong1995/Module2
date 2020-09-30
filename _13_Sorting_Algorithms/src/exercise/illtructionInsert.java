package exercise;

public class illtructionInsert {
    public static void main(String[] args) {
        System.out.println("Before insert: ");
        System.out.println("----------------------------------");

        int list[] = {2, 9, 5, 4, 1, 8};
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------------------");

        System.out.println("After insert: ");
        System.out.println();
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                System.out.println("insert "+list[k]+" to "+list[k+1]);
                list[k + 1] = list[k];
            }

            list[k + 1] = currentElement;

            for (int j = 0;j<list.length;j++){
                System.out.print(list[j]+" ");
            }
            System.out.println();
        }
    }
}

