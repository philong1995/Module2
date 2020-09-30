package practice;

public class InsertionSort {
    void sort(int list[]) {

        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement; }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
}
