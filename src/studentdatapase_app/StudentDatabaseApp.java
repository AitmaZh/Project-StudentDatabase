package studentdatapase_app;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Спрашивает количество новых студентов
        System.out.print("Enter number of new students to enroll: ");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

        // Создаёт n количество студентов
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println();
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        System.out.println("Whole students Information: ");

        // Отображает введённую информацию всех студентов
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println();
            System.out.print(students[n].showInfo());
            System.out.println();
        }
    }
}