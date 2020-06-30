package studentdatapase_app;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Запрашивает ФИ студента и год обучения
    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\n Enter student class level: ");
        this.gradeYear = scanner.nextInt();

        setStudentID();
    }

    // Генерирует ID
    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Регистрирует курсы студента
    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse; // Вычисляет итоговую сумму
            } else {
                break;
            }
        } while (1 != 0);
    }

    // Выводит итоговый счёт
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Запрашивает оплату счёта
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        if (payment > 0) {
            System.out.println("Thank you for your payment of $" + payment); // Счёт был оплачен полностью или частично
        } else {
            System.out.println("Payment is canceled"); // Счёт не был оплачен (при вводе 0)
        }
    }

    // Показывает статус
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance $" + tuitionBalance;
    }
}