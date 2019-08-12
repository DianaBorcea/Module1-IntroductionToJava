import java.util.ArrayList;

public class Agenda {
    ArrayList<Contact> contactList;

    public Agenda() {
        this.contactList = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        this.contactList.add(contact);
    }

    public void deleteContact(Contact contact) {
        for (int i=0; i<contactList.size();i++){
            if (contactList.get(i).getName().equalsIgnoreCase(contact.getName())  &&  contactList.get(i).getTelephoneNumber().equalsIgnoreCase(contact.getTelephoneNumber())){
                contactList.remove(i);
                break;
            }

            }
        }


    public void updateContact(Contact contact){
        for (int i=0; i<contactList.size();i++){
            if (contactList.get(i).getName().equalsIgnoreCase(contact.getName()) ){
                contactList.get(i).setTelephoneNumber(contact.getTelephoneNumber());
                break;
            }

        }
    }

    public ArrayList<Contact> getAllContacts() {
        return contactList;
    }

    public Contact getByNameAndNumber(String name, String telephoneNumber) {
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name) && contact.getTelephoneNumber().equalsIgnoreCase(telephoneNumber)) {
                return contact;
            }

        }
        return null;
    }
}
