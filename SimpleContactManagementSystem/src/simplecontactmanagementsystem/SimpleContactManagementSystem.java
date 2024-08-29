/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecontactmanagementsystem;

import java.util.Scanner;

/**
 *
 * @author Riska
 */
public class SimpleContactManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Scanner object
        Scanner input = new Scanner(System.in);

        //instance of ContactManager
        ContactManager myContactManager = new ContactManager();

        boolean exit = false;

        try {

            while (!exit) {
                // Displaying options to the user
                System.out.println("Simple Contact Management System");
                System.out.println("1. Add Contact");
                System.out.println("2. View Contacts");
                System.out.println("3. Update Contact");
                System.out.println("4. Delete Contact");
                System.out.println("5. Search Contact");
                System.out.println("6. Exit");

                int option = input.nextInt();
                input.nextLine();

                switch (option) {
                    case 1: // Add
                        System.out.println("Enter name: ");
                        String name = input.nextLine();
                        System.out.println("Enter phone number: ");
                        String phoneNumber = input.nextLine();
                        System.out.println("Enter email address: ");
                        String emailAddress = input.nextLine();
                        myContactManager.addContact(name, phoneNumber, emailAddress);
                        break;

                    case 2: // View
                        myContactManager.viewContacts();
                        break;

                    case 3: // Update
                        System.out.println("Enter the name of the contact to update: ");
                        String updateName = input.nextLine();
                        myContactManager.updateContact(updateName);
                        break;

                    case 4: // Delete
                        System.out.println("Enter the name of the contact to delete: ");
                        String deleteName = input.nextLine();
                        myContactManager.deleteContact(deleteName);
                        break;

                    case 5: // Search
                        System.out.println("Enter the name of the contact to search: ");
                        String searchName = input.nextLine();
                        myContactManager.searchContact(searchName);
                        break;

                    case 6: // Exit
                        exit = true;
                        System.out.println("Exiting the system.");
                        break;

                    default:
                        System.out.println("Invalid option. Please choose between 1 and 6.");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer between 1 and 6.");
            input.nextLine(); 
        }
        //Closing the scanner
        input.close();
    }

}
