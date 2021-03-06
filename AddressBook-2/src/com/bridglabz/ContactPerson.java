package com.bridglabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

// Declaring Variable
public class ContactPerson<Person> {
    String firstName;
    String lastName;
    String city;
    String state;
    String address;
    String emailId;
    long phoneNo;
    int zipCode;
    int count = 1;

    public void ContactPerson() {
    }

    // Display User Details
    public void addressBook(ArrayList<ContactPerson> contactPerson) {
        for (int i = 0; i < contactPerson.size(); i++) {
            System.out.println("contact" + count);
            System.out.println("First Name: " + contactPerson.get(i).firstName);
            System.out.println("Last Name: " + contactPerson.get(i).lastName);
            System.out.println("Address: " + contactPerson.get(i).address);
            System.out.println("City Name : " + contactPerson.get(i).city);
            System.out.println("State Name : " + contactPerson.get(i).state);
            System.out.println("Email-Id : " + contactPerson.get(i).emailId);
            System.out.println("Zip Code : " + contactPerson.get(i).zipCode);
            System.out.println("phone Number Name : " + contactPerson.get(i).phoneNo);
            count++;
        }
    }

    //          Update the Contact Details
    public void updateData(String name, ArrayList<ContactPerson> contactDetails) {
        for (int i = 0; i < contactDetails.size(); i++) {
            if (name.equals(contactDetails.get(i).firstName)) {
                contactDetails.remove(i);
                contactDetails.add(i, getInput(contactDetails));
            }
        }
        System.out.println("Record Updated Successfully");
    }

    // Creating function to get user Input

    public ContactPerson getInput(ArrayList<ContactPerson> contactDetails) {
        ContactPerson contactPersonDetails = new ContactPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Name : ");
        contactPersonDetails.firstName = sc.next();

        System.out.print("Enter the Last Name : ");
        contactPersonDetails.lastName = sc.next();
        if (count > 1){
            checkDuplicateRecords(contactPersonDetails.firstName, contactPersonDetails.lastName, contactDetails);
        }

        System.out.print("Enter the Address: ");
        contactPersonDetails.address = sc.next();

        System.out.print("Enter the City Name : ");
        contactPersonDetails.city = sc.next();

        System.out.print("Enter the state Name : ");
        contactPersonDetails.state = sc.next();

        System.out.print("Enter the Email-Id : ");
        contactPersonDetails.emailId = sc.next();

        System.out.print("Enter the Zip Code : ");
        contactPersonDetails.zipCode = sc.nextInt();

        System.out.print("Enter the  Phone Number: ");
        contactPersonDetails.phoneNo = sc.nextLong();
        count++;
        return contactPersonDetails;
    }

    //   Delete the Contact Details
    public void deleteRecord(String name, ArrayList<ContactPerson> contactDetails) {
        if (contactDetails.size() > 0) {
            for (int i = 0; i < contactDetails.size(); i++) {
                if (name.equals(contactDetails.get(i).firstName)) {
                    contactDetails.remove(i);
                } else System.out.println("There is no any person contact for " + name);
            }
        } else System.out.println("There is no person address available to delete");
        System.out.println("Record Deleted Successfully");
    }

    public void getAddressbook(Map<String, ContactPerson> addressBookHashMap) {
        for (String addressbook : addressBookHashMap.keySet()) {
            System.out.println("Person contact for the " + addressbook + " is " + addressBookHashMap.get(addressbook).toString());
        }
    }

    public void checkDuplicateRecords(String name, String lastName, ArrayList<ContactPerson> contactDetails) {
        for (int i = 0; i < contactDetails.size(); i++) {
            String existingRecordName = contactDetails.get(i).firstName + " " + contactDetails.get(i).lastName;
            String newRecordName = name + " " + lastName;
            if (newRecordName.equals(existingRecordName)) {
                System.out.println("Record with same Name already exists");
                AddressBookMain.contactBookOptions();
                break;
            } else {
                continue;
            }
        }
    }

    // Search contact Person using city name
    public static void search(String city, Map<String, ArrayList<AddressBookMain>> addressHashMap) {
        addressHashMap.values()
                .stream().
                forEach(value -> {
                    value.stream()
                            .forEach(person -> {
                                if (person.city.contains(city) || person.state.contains(city))
                                    System.out.println(person);
                            });
                });
    }

    // Show the Persons by City or State
    static Map<String, ContactPerson> cityStateRelatedData(String cityStateName, Map<String, ArrayList<ContactPerson>> addressHashMap) {
        Map<String, ContactPerson> CityName = new HashMap<>();
        AtomicInteger cityCounter = new AtomicInteger(1);
        addressHashMap
                .values()
                .forEach(value -> {
                    value.forEach(person -> {
                        if (person.city.equals(cityStateName) || person.state.equals(cityStateName))
                            CityName.put((cityCounter.getAndIncrement() + ""), person);
                    });
                });
        return CityName;
    }

    @Override
    public String toString() {
        return "ContactPersonDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNo=" + phoneNo +
                ", zipCode=" + zipCode +
                ", count=" + count +
                '}';
    }
}
