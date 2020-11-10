package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double a=0, b, c=0, d;
            String s;
            System.out.print("Insert a mark: ");
            s=scan.nextLine();	// we read the mark as string to check the word "end"
            while(!s.equals("end")){  // if the mark isn't an end then we pass it to double to work with it
                b= Double.parseDouble(s);
                c++;   //counter of numbers
                a+=b;  // sum of all the notes
                System.out.print("Insert a mark: ");
                s=scan.nextLine();
            }
            if(c!=0){
                d=a/c;  //calculate the average
                System.out.print("The average is "+d+".");
            }
    }
}
