import java.util.Scanner;

class Student 
{
    String studentName, courseName;
    int rollNumber, courseCredits;
    double marks;

    Student(String studentName, int rollNumber, double marks,
            String courseName, int courseCredits) 
    {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    double calculateFee() 
    {
        return courseCredits * 1500;
    }

    boolean checkEligibility() 
    {
        return marks >= 50;
    }

    double calculateScholarship() 
    {
        if (marks >= 85) return 20;
        if (marks >= 70) return 10;
        return 0;
    }

    double calculateFinalFee() 
    {
        return calculateFee() -
               calculateFee() * calculateScholarship() / 100;
    }

    void displayDetails() 
    {
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + courseName);
        System.out.println("Credits: " + courseCredits);
        System.out.println("Fee: Rs." + calculateFee());
        System.out.println("Scholarship: " + calculateScholarship() + "%");
        System.out.println("Final Fee: Rs." + calculateFinalFee());
    }
}

public class StudentCourseRegistration
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String n = sc.nextLine();
        System.out.print("Roll No: ");
        int r = sc.nextInt();
        System.out.print("Marks: ");
        double m = sc.nextDouble();
        sc.nextLine();
        System.out.print("Course: ");
        String c = sc.nextLine();
        System.out.print("Credits: ");
        int cr = sc.nextInt();

        Student s = new Student(n, r, m, c, cr);

        if (s.checkEligibility())
            s.displayDetails();
        else
            System.out.println("Not eligible for registration.");

        sc.close();
    }
}