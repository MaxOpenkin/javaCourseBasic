package lessons.lesson_33_treeMap.practice.contactsManager;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContactManager {

    private TreeMap<String, Contact> contactsByName;
    private Map<String, Contact> contactsByPhoneNumber;


    public ContactManager() {
        this.contactsByName = new TreeMap<>();
        this.contactsByPhoneNumber = new HashMap<>();
    }


    public void addContact(Contact contact) {

        if (contactsByName.containsKey(contact.getName()) || contactsByPhoneNumber.containsKey(contact.getPhoneNumber())){
            System.out.println("Ошибка: Контакт с таким именем или номером телефона уже существует");
        } else {
            contactsByName.put(contact.getName(), contact);
            contactsByPhoneNumber.put(contact.getPhoneNumber(), contact);
        }
    }

    public void removeContact(Contact contact) {
        contactsByName.remove(contact.getName());
        contactsByPhoneNumber.remove(contact.getPhoneNumber());
    }


    public void removeContactByName(String name) {
        if (!contactsByName.containsKey(name)) {
            System.out.println("Ошибка: контакт не найден.");
        } else {
            Contact contact = contactsByName.remove(name);
            contactsByPhoneNumber.remove(contact.getPhoneNumber());
            System.out.println("Контакт удален: " + contact);
        }
    }



    public Collection<Contact> getContacts() {
        return contactsByName.values();
    }


    public Contact getContactByName(String name) {
        Contact contact = contactsByName.get(name);
        if (contact == null) {
            System.out.println("Контакт с именем " + name + " не найден.");
            return null;
        } else {
            return contact;
        }
    }


    public Contact getContactByPhoneNumber(String phoneNumber) {
        Contact contact = contactsByPhoneNumber.get(phoneNumber);
        if (contact == null) {
            System.out.println("Контакт с номером: " + phoneNumber + " не найден.");
            return null;
        } else {
            return contact;
        }
    }


}
