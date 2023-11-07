import java.util.Scanner;

public class Marks_entry {
    static class Student {
        String name;
        int marks;
        String subject;

        public void setName(String name) {
            this.name = name;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }

        public String getSubject() {
            return subject;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students' data do you want to enter?");
        int enter = sc.nextInt();


        Student[] array = new Student[enter];

        for (int i = 0; i < enter; i++) {

            Student s1 = new Student();
            sc.nextLine();

            System.out.print("Enter student " + (i + 1) + "'s name: ");
            String name = sc.nextLine();
            s1.setName(name);

            System.out.print("Enter student " + (i + 1) + "'s marks: ");
            int marks = sc.nextInt();
            s1.setMarks(marks);

            sc.nextLine();

            System.out.print("Enter student " + (i + 1) + "'s subject: ");
            String subject = sc.nextLine();
            s1.setSubject(subject);

            array[i] = s1; //object ko array me store krne ke liye
        }

        display(array);
    }

    public static void display(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student " + (i + 1) + " Details:");
            System.out.println("Name: " + arr[i].getName());
            System.out.println("Marks: " + arr[i].getMarks());
            System.out.println("Subject: " + arr[i].getSubject());
        }

    }
}