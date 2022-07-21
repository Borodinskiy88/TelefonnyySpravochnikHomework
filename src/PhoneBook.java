import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    protected Map<String, List<Contact>> phoneContact = new HashMap<>();

    public boolean addBand(String name) {
        if (!phoneContact.containsKey(name)) {
            phoneContact.put(name, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addContact(Contact contact, String... bandNames) {
        for (String bandName : bandNames) {
            if (!phoneContact.containsKey(bandName)) {
                return false;
            }
            phoneContact.get(bandName).add(contact);
        }
        return true;
    }

    public List<Contact> searchContact(String bandName) {
        return phoneContact.get(bandName);
    }

    public Contact searchContactNumber(String number) {
        for (List<Contact> band : phoneContact.values()) {
            for (Contact contact : band)
                if (contact.getNumber().equals(number))
                    return contact;
        }
        return null;
    }

    public static Contact madeContact(String name, String number) {
        return new Contact(name, number);
    }

}
