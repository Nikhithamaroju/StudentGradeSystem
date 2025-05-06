import java.util.*;

public class StudentGradeSystem {
    static class Student {
        String name;
        int[] marks;

        Student(String name, int[] marks) {
            this.name = name;
            this.marks = marks;
        }

        double getAverage() {
            int sum = 0;
            for (int mark : marks) sum += mark;
            return sum / (double) marks.length;
        }

        String getResult() {
            return getAverage() >= 50 ? "Pass" : "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Student 2. View All 3. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.next();
                int[] marks = new int[3];
                System.out.println("Enter 3 subject marks:");
                for (int i = 0; i < 3; i++) {
                    marks[i] = sc.nextInt();
                }
                students.add(new Student(name, marks));
            } else if (choice == 2) {
                for (Student s : students) {
                    System.out.println(s.name + " - Avg: " + s.getAverage() + " - " + s.getResult());
                }
            } else {
                break;
            }
        }
        sc.close();
    }
}
    

