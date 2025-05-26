package stocks;

import java.util.ArrayList;
import java.util.List;

/**
 * Einfacher elektronischer Briefkasten, der das Senden und Lesen von
 * Nachrichten simuliert.
 */
public class Mailbox {
    private List<String> messages = new ArrayList<>();

    public void sendMessage(String message) {
        messages.add(message);
    }

    public List<String> getMessages() {
        return messages;
    }

    public int getSize() {
        return messages.size();
    }
}
