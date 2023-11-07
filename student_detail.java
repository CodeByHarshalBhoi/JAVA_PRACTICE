import java.util.Scanner;

public class student_detail {

    static class student {
        static int id;
        static String name;
        static int marks;

        public void student(int id, String name, int marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        public static void print() {
            System.out.println("Student id is " + id);
            System.out.println("Student name " + name);
            System.out.println("Student marks " + marks);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        student s1 = new student();

        System.out.println("enter student id");
        s1.id = sc.nextInt();

        System.out.println("Enter student name");
        sc.nextLine();

        s1.name = sc.nextLine();

        System.out.println("Enter student marks");
        s1.marks = sc.nextInt();

        s1.print();

    }
}
