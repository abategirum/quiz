package org.example;

import org.example.model.Contact;
import org.example.model.Email;
import org.example.model.Phone;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Phone[] phone1 = {
                new Phone("240-133-0011","Home"),
                new Phone("240-112-0123","Mobile")
        };
        Email[] email1 = {
                new Email("dave.sang@gmail.com", "Home"),
                new Email("dsanger@argos.com","Work")
        };
        Phone[] phone2 = {
                new Phone("412-116-9988","Work"),

        };
        Email[] email2 = {
                new Email("ali@bmi.com", "Work"),

        };
      Contact[] contact = {
              new Contact("David", "Sanger", "Argos LLC", "Sales Manager",Arrays.asList(phone1),
                Arrays.asList(email1)),
              new Contact("Carlos","Jimenez","Zappos","Director",null,null),
              new Contact("Ali","Gafar","BMI","HR", Arrays.asList(phone2),Arrays.asList(email2))
      };

        print(contact);
    }

    public static void print(Contact[] contact){
        Arrays.sort(contact, Comparator.comparing(Contact::getLastName));
        System.out.println("Print in Json Format");
        System.out.println("[");
        Arrays.stream(contact).forEach(cont -> {
            System.out.println("{");
            System.out.println("\"contactName\": " + cont.getFirstName() + "," + "\"lastName\": " + cont.getLastName() + "," + "\"company\": " + cont.getCompany());
        });
        System.out.println("]");
    }
}