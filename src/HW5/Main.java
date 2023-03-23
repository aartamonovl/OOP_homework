package HW5;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, XMLStreamException {
        PhonebookUI phonebook = new PhonebookUI("contacts");
        phonebook.run();
    }
}
