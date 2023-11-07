import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class UserIntput_Student_Detail {

    public static class studentDetail implements Comparable<studentDetail> {
        int roll;
        String name;
//        int marks;

        public studentDetail(int roll, String name) {
            this.roll = roll;
            this.name = name;
//            this.marks = marks;
        }

        public int compareTo(studentDetail s2) {
            return this.roll = s2.roll;

        }
    }

    public static void main(String[] args) {

        PriorityQueue<studentDetail> pq = new PriorityQueue<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students you want to add");
        int studentDetailedNo = sc.nextInt();
        sc.nextLine();


        for (int i = 1; i <= studentDetailedNo; i++) {
            System.out.println("Enter roll: " + i);
            String roll = sc.nextLine();

//            sc.nextLine();

            System.out.println("Enter name: " + i);
            int name = sc.nextInt();

//            System.out.println("Enter marks: "+ i);
//            sc.nextInt();

            sc.nextLine();

            studentDetail s = new studentDetail(name, roll);
            pq.add(s);
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().roll + " " + pq.peek().name);
            pq.remove();
        }
    }
}
