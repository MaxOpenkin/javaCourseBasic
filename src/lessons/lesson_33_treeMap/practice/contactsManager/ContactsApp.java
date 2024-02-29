package lessons.lesson_33_treeMap.practice.contactsManager;

public class ContactsApp {

    public static void main(String[] args) {

        ContactManager contactManager = new ContactManager();

        Contact contact1 = new Contact("Ramin", "12345");
        Contact contact2 = new Contact("Clayton", "67890");
        Contact contact3 = new Contact("Ahmed", "54321");


        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);


        contactManager.addContact(new Contact("Ramin", "12345"));

        System.out.println("Все контакты: ");
        for (Contact contact : contactManager.getContacts()) {
            System.out.println(contact);
        }


        contactManager.removeContact(contact2);
        contactManager.removeContactByName("Liza");

        System.out.println("Контакты после удаления одного: ");
        for (Contact contact : contactManager.getContacts()) {
            System.out.println(contact);
        }


        System.out.println("Контакт с именем 'Ramin': " + contactManager.getContactByName("Ramin"));

        System.out.println("Контакт с номером '54321': " + contactManager.getContactByPhoneNumber("54321"));

        System.out.println("Контакт с именем 'Irina': " + contactManager.getContactByName("Irina"));

    }
}
