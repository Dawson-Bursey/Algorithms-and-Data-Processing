// Program to calculate the average temperature and number of temperature values above average.

import java.util.Scanner;

public class AverageTemp{ 
    public static void main(String[] args){
        System.out.println(); // Print a blank line for better readability
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
        System.out.println("Enter the number of Temperature Values: "); 
        int n = scanner.nextInt(); 

        double[] temperature = new double[n];   // Create an array to store the temperature values
        System.out.println("Enter the Temperature Values: ");  
        for(int i=0; i<n; i++){ 
            temperature[i] = scanner.nextDouble();  // Read the temperature values
        }

        double sum = 0; 
        for (double temp : temperature){
            sum += temp;   // Calculate the sum of temperature values
        }
        double average = sum / n;  // Calculate the average temperature

        int countAboveAverage = 0; 
        for (double temp : temperature){
            if (temp > average){
                countAboveAverage++; // Calculate the count of temperature values above average
            }
        }
        System.out.println();
        System.err.println("Average Temperature: " + average); 
        System.err.println("Number of Temperature Values above Average: " + countAboveAverage);

        scanner.close();
    }
}