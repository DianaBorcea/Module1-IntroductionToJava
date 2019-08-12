import java.util.Scanner;

public class Main {
    static Agenda agenda;

    public static void main(String args[]) {

        agenda = new Agenda();

        myMenu();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter option");

        int myOption = myObj.nextInt();

        while (true) {
            switch (myOption) {
                case 1:
                    addContact();
                    break;

                case 2:
                    deleteContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    getAll();
                    break;

                case 5:
                    getByNameAndNumber();
                    break;

                case 6:
                    System.exit(0);

            }
            myMenu();
            System.out.println("Enter option:");
            myOption = myObj.nextInt();

        }


    }

    public static void addContact() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Set name and number:");
        String name = myObj.nextLine();
        String telephoneNumber = myObj.nextLine();

        Contact contact = new Contact(name, telephoneNumber);
        agenda.addContact(contact);
        System.out.println(contact);

    }

    public static void deleteContact() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Give name and number of the contact you want to delete:");
        String name = myObj.nextLine();
        String telephoneNumber = myObj.nextLine();

        Contact contact = new Contact(name, telephoneNumber);
        agenda.deleteContact(contact);

    }

    public static void updateContact() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Give name and number of the contact you want to update:");
        String name = myObj.nextLine();
        String telephoneNumber = myObj.nextLine();

        Contact contact = new Contact(name, telephoneNumber);
        agenda.updateContact(contact);

    }

    public static void getAll() {
        for(Contact cont: agenda.getAllContacts()){
            System.out.println(cont);
        }

    }

    public static void getByNameAndNumber() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Give name and number of the contact you want to show:");
        String name = myObj.nextLine();
        String telephoneNumber = myObj.nextLine();

        System.out.println(agenda.getByNameAndNumber(name, telephoneNumber));

    }


    public static void myMenu() {
        System.out.println("Choose from next options: \n" +
                "1. Add new contact\n" +
                "2. Remove contact\n" +
                "3. Edit contact\n" +
                "4. Export\n" +
                "5. Search\n" +
                "6. Exit");

    }
}
