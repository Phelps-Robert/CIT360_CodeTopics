package parallelprocessing;

import java.util.ArrayList;

public class SimpleThreads extends Thread {

    static ArrayList<String> rankings = new ArrayList<>();
    static int numberOfThreads;
    int numberOfRounds = 100;

    public static void simpleThreadsExample(int numberOfRacers) {
        numberOfThreads = numberOfRacers;
        for (int threadCnt = 0; threadCnt < numberOfThreads; threadCnt++) {
            SimpleThreads simpleThreads = new SimpleThreads();
            simpleThreads.start();
        }
    }

    @Override
    public void run() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfRounds; i++) {
            sb.setLength(0);
            for (int j = 0; j < numberOfRounds; j++) {
                if (j == i) {
                    sb.append(Thread.currentThread().getName().charAt(Thread.currentThread().getName().length() - 1));
                } else {
                    sb.append('-');
                }
            }
            System.out.println(sb.toString());
            
            int sleepTime = 4 * (1 + (int) (Math.random() * 50));
            try {
                Thread.currentThread().sleep(sleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (i == numberOfRounds - 1) {
                if (rankings.isEmpty()) {
                    rankings.add(Thread.currentThread().getName());
                } else {
                    rankings.add(Thread.currentThread().getName());
                }
            }
        }
        if (numberOfThreads == rankings.size()) {
            System.out.println("\nRank\tRacer\n----------------");
            for (int k = 0; k < rankings.size(); k++) {
                System.out.println((k + 1) + ".\t" + rankings.get(k));
            }
            System.out.println("\n" + rankings.get(0) + " wins!");
        }
    }
}
