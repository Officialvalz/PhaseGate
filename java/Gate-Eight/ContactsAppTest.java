import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactsAppTest {

    @Test
    void testAddContact() {
        ContactsApp service = new ContactsApp();
        service.add("John", "08012345678");
        assertEquals("John", service.find("08012345678"));
    }

    @Test
    void testFindContactNotFound() {
        ContactsApp service = new ContactApp();
        assertNull(service.find("09000000000"));
    }

    @Test
    void testRemoveContact() {
        ContactsApp service = new ContactsApp();
        service.add("John", "08012345678");
        boolean result = service.remove("08012345678");
        assertTrue(result);
        assertNull(service.find("08012345678"));
    }

    @Test
    void testRemoveContactNotFound() {
        ContactsApp service = new ContactsApp();
        boolean result = service.remove("09000000000");
        assertFalse(result);
    }
}
