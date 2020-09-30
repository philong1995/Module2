package exercise;

public class InsertionSort {

    public static void insertionSort(int arr[]){

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int element = i - 1;

            while (element >= 0 && arr[element] > key) {
                arr[element + 1] = arr[element];
                element = element - 1;
            }
            arr[element + 1] = key;
        }
    }

    public static void display(int arr[]){
        System.out.println("------------------------");
        for (int i =0; i < arr.length;i ++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        int list[] = {2, 9, 5, 4, 8, 1, 6};
        insertionSort(list);
        display(list);
    }
}
