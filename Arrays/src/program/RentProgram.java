package program;

import entities.Rent;

import java.util.Scanner;

public class RentProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rent[] rents = new Rent[10];

        System.out.println("How many rooms will be rented ? ");
        int rooms = sc.nextInt();

        for (int index = 0; index < rooms; index += 1) {
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Room: ");
            int room = sc.nextInt();

            rents[room] = new Rent(name, email);
        }

        System.out.println("Busy Rooms: ");

        for (int index = 0; index < rents.length; index++) {

            if (rents[index] != null) {
                System.out.println(index + ": " + rents[index].getName() + ", " + rents[index].getEmail());
            }

        }

        sc.close();

    }


}
