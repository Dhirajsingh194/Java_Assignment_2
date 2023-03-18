package assignment2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Student:");
        int num = sc.nextInt();
        sc.nextLine(); 
        
        
        String[] names = new String[num];
        String[] emails = new String[num];
        String[] phones = new String[num];
        String[] addresses = new String[num];
        String[] statuses = new String[num];

       
        for (int i = 0; i < num; i++) {
           
            System.out.print("Pleae Enter Name: ");  
            names[i] = sc.nextLine();
            
            System.out.print("Pleae Enter Email: ");
            emails[i] = sc.nextLine();
            
            System.out.print("Pleae Enter Phone: ");
            phones[i] = sc.nextLine();
            
            System.out.print("Pleae Enter Address: ");
            addresses[i] = sc.nextLine();
            
            System.out.print("Pleae Enter Status: ");
            statuses[i] = sc.nextLine();
            System.out.println();
        }
  
        System.out.print("Pleaase Enter which student id details are you looking for:");
        int studentID = sc.nextInt();

        
        System.out.println(names[studentID-1]);
        System.out.println(emails[studentID-1]);
        System.out.println(phones[studentID-1]);
        System.out.println(addresses[studentID-1]);
        System.out.println(statuses[studentID-1]);
    }
}
