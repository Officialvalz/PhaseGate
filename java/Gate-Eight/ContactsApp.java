import java.util.*;
public class ContactsApp {

    static String[] nameList  = new String[100];
    static String[] phoneList = new String[100];
    static int totalContacts = 0;

    public void add(String name, String phone) {
        nameList[totalContacts] = name;
        phoneList[totalContacts] = phone;
        totalContacts++;
    }
    public String find(String phone) {
        for (int index = 0; index < totalContacts; index++) {
            if (phoneList[index].equals(phone)) {
                return nameList[index];
            }
        }
        return null;
    }
    public boolean remove(String phone) {
        for (int count = 0; count < totalContacts; count++) {
            if (phoneList[count].equals(phone)) {

                for (int index = count; index < totalContacts - 1; index++) {
                    nameList[index] = nameList[index + 1];
                    phoneList[index] = phoneList[index + 1];
                }
                totalContacts--;
                return true;
            }
        }
        return false;
    }
}
