package exercise;

public class test {
    public static void main(String[] args) {
        System.out.println("Before insert: ");
        System.out.println("----------------------------------");

        int list[] = {2, 9, 5, 4, 1, 8};
        for (int i =0; i < list.length;i ++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
        System.out.println("----------------------------------");

        System.out.println("After insert: ");
        System.out.println();
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int k = i -1;
            for (; k >= 0 && list[k] > temp; k--) {
                System.out.println("insert "+list[k]+ " to "+list[k+1]);
                list[k + 1] = list[k];
                list[k] = temp;

                for (int j = 0; j < list.length; j++){
                    System.out.print(list[j]+" ");
                }
                System.out.println();
            }
        }
        System.out.println("----------------------------------");
    }
}

