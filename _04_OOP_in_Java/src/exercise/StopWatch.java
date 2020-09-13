package exercise;

import java.util.Random;

public class AlgorithmsSort {
    public static void sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int current = list[i];
            int j;
            for (j = i - 1; j > 0 && list[j] > current; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = current;
        }
    }
}

public class Application {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Random random = new Random(100000);

        int[] list = new int[100000];
        for (int i = 0; i < list.length; i++) {
            int rd = random.nextInt(100000);
            list[i] = rd;
        }
        System.out.println("Start time: " + stopWatch.start());
        AlgorithmsSort.sort(list);
        System.out.println("End time: " + stopWatch.stop());
        System.out.println("Elapsed: " + stopWatch.getElapsedTime());
    }
}

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long start() {
        return startTime = System.currentTimeMillis();
    }

    public long stop() {
        return endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}


