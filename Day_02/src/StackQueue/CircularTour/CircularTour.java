package StackQueue.CircularTour;

import java.util.Scanner;

public class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int start = 0, deficit = 0, surplus = 0;

        for (int i = 0; i < pumps.length; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }
        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of petrol pumps: ");
        int n = scanner.nextInt();
        PetrolPump[] pumps = new PetrolPump[n];

        System.out.println("Enter petrol and distance for each pump:");
        for (int i = 0; i < n; i++) {
            int petrol = scanner.nextInt();
            int distance = scanner.nextInt();
            pumps[i] = new PetrolPump(petrol, distance);
        }

        int start = findStartingPoint(pumps);
        if (start == -1) {
            System.out.println("No valid starting point");
        } else {
            System.out.println("Start at petrol pump: " + start);
        }
    }
}
