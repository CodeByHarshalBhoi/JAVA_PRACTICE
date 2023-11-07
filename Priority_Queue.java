import java.util.PriorityQueue;
import java.util.Scanner;

public class Priority_Queue {
    static class classroom implements Comparable<classroom> {
        String name;
        int rank;

        public classroom(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        public int compareTo(classroom s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<classroom> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("how many value you want to add");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter name: " + i);
            String name = sc.nextLine();

            System.out.println("Enter rank: " + i);
            int rank = sc.nextInt();

            sc.nextLine();

            classroom c = new classroom(name, rank);
            pq.add(c);
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }
    }
}
