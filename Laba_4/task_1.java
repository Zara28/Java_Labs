import java.util.Scanner;

import lib.*;
public class task_1 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the information");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Ege: ");
        int age = sc.nextInt();
        System.out.print("City: ");
        String city = sc.next();
        System.out.println("Is he student?");
        String ans = sc.next();
        if(ans.contentEquals("Yes"))
        {
            System.out.println("Enter the additional information");
            System.out.println("University: ");
            String univer = sc.next();
            System.out.println("Course: ");
            int kurs = sc.nextInt();

            Student s = new Student(name, age, city, univer, kurs);
            System.out.println(s.toString());
            s.Say();
        }
        else
        {
            Human h = new Human(name, age, city);
            System.out.print("Enter the age for comparison: ");
            int age2 = sc.nextInt();
            h.Print(age2);
            System.out.println(h.toString());
        }
        
        
    }
}
