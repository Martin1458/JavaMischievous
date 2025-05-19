package stueckliste;
import java.util.*;

public class Programm {
    public static void main(String[] args) {
        System.out.println("Hallo Welt");
        Einzelteil t1 = new Einzelteil("E001", 2.30); 
        Einzelteil t2 = new Einzelteil("E002", 4.70); 
        Baugruppe t3 = new Baugruppe("B001", t1); 
        Baugruppe t4 = new Baugruppe("B002", t2); 
        t3.addBauteil(t4);
        t3.addBauteil(t2);
        t3.addBauteil(t4);
        bfsPrint(t3);
    }

    public static void bfsPrint(Bauteil root) {
        class NodeLevel {
            Bauteil node;
            int level;
            NodeLevel(Bauteil node, int level) {
                this.node = node;
                this.level = level;
            }
        }

        Queue<NodeLevel> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(new NodeLevel(root, 0));

        while (!queue.isEmpty()) {
            NodeLevel current = queue.poll();
            Bauteil bauteil = current.node;
            int level = current.level;

            if (visited.contains(bauteil.getId())) continue;
            visited.add(bauteil.getId());

            String indent = "  ".repeat(level);
            if (bauteil instanceof Baugruppe) {
                System.out.println(indent + "Baugruppe: " + bauteil.getId());
                Baugruppe bg = (Baugruppe) bauteil;
                for (Bauteil b : bg.getBauteile()) {
                    queue.add(new NodeLevel(b, level + 1));
                }
            } else if (bauteil instanceof Einzelteil) {
                System.out.println(indent + "Einzelteil: " + bauteil.getId());
            }
        }
    }
}