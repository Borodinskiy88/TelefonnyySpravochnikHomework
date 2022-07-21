import java.util.List;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        createBands(phoneBook);
        createContacts(phoneBook);

        List<Contact> familyNumbers = phoneBook.searchContact("Семья");
        System.out.println("Семья:");
        for (Contact familyNumber : familyNumbers) {
            System.out.println(familyNumber);
        }
        System.out.println();

        List<Contact> workNumbers = phoneBook.searchContact("Работа");
        System.out.println("Работа:");
        for (Contact workNumber : workNumbers) {
            System.out.println(workNumber);
        }

        Contact contactFindNumber = phoneBook.searchContactNumber("12-34-56");
        System.out.println();
        System.out.println("По данному запросу найден контакт: " + " " + contactFindNumber);
    }

    protected static void createBands(PhoneBook phoneBook) {
        phoneBook.addBand("Работа");
        phoneBook.addBand("Друзья");
        phoneBook.addBand("Семья");
    }

    protected static void createContacts(PhoneBook phoneBook) {
        phoneBook.addContact(PhoneBook.madeContact("Боба", "12-34-56"), "Работа", "Друзья");
        phoneBook.addContact(PhoneBook.madeContact("Синара", "78-90-12"), "Семья", "Друзья");
        phoneBook.addContact(PhoneBook.madeContact("Маня", "34-56-78"), "Семья");
        phoneBook.addContact(PhoneBook.madeContact("Пудр", "90-12-34"), "Работа");
        phoneBook.addContact(PhoneBook.madeContact("Трофимыч", "56-78-90"), "Работа");

    }
}
