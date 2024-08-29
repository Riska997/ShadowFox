/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplecontactmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Riska
 */
public class ContactManager {

    //Getters and Setters
    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    // Constructor
    public ContactManager() {
         this.contactList = new ArrayList<>();
    }

    //Decalring ArrayList
    ArrayList<Contact> contactList;

    // Method to add a contact
    public void addContact(String name, String phoneNumber, String emailAddress) {

        // A new Contact object 
        Contact contact = new Contact(name, phoneNumber, emailAddress);

        // Add the Contact object to contactList
        contactList.add(contact);
    }

    // Method to view all contacts
    public void viewContacts() {

        //if statements to check if list is empty
        if (contactList.isEmpty()) {
            System.out.println("No contacts available");
        } else {
            // Iterate over the contact list
            for (Contact contact : contactList) {
                // Print the contact details
                System.out.println("Name: " + contact.getName() + "\nPhone Number: " + contact.getPhoneNumber() + "\nEmail: " + contact.getEmailAddress());
                System.out.println();
            }
        }
    }

    //Method to update a contact
    public void updateContact(String name) {

        // Find contact in contactList by name
        Contact contact = findContactByName(name);

        if (contact != null) {
            // Prompt user for new phone number and email address
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter new phone number: ");
            String newPhoneNumber = scanner.nextLine();

            System.out.print("Enter new email address: ");
            String newEmail = scanner.nextLine();

            // Update contact details
            contact.setPhoneNumber(newPhoneNumber);
            contact.setEmailAddress(newEmail);

            System.out.println("Contact details updated successfully.");
        } else {
            // If contact is not found
            System.out.println("Contact not found.");
        }
    }

    // Method to delete a contact
    public void deleteContact(String name) {

        // Find contact in contactList by name
        Contact contact = findContactByName(name);

        if (contact != null) {
            contactList.remove(contact);
            System.out.println("Contact deleted");
        } else {
            System.out.println("Contact not found");
        }

    }

    // Method to search for a contact
    public void searchContact(String name) {

        // Find contact in contactList by name
        Contact contact = findContactByName(name);

        if (contact != null) {
            System.out.println("Name: " + contact.getName() + "\nPhone Number: " + contact.getPhoneNumber() + "\nEmail: " + contact.getEmailAddress());
            System.out.println();
        } else {
            System.out.println("Contact not found");
        }
    }

    private Contact findContactByName(String name) {
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }
}
