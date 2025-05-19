package collections1;

import java.util.*;

/**
 * Zum Selbststudium: Ein paar Beispiele, die demonstrieren was mit Listen
 * und Generics möglich ist und was nicht.
 */
public class ListExamples {
    public static void main(String[] args) {
        // Primitive Typen können nicht als generische Typparameter genutzt werden:
        // List<int> numbers1 = new ArrayList<int>();

        // Bei Arrays war das noch möglich, dafür muss beim Erzeugen die Größe
        // feststehen:
        int[] numberArray = new int[100];

        // Im Zusammenhang mit Generics muss stattdessen die jeweilige
        // Wrapper-Klasse genutzt werden:
        List<Integer> numberList = new ArrayList<Integer>();

        // Arrays haben eine statische Größe:
        System.out.println(numberArray.length);

        // Listen können dynamisch wachsen:
        System.out.println(numberList.size());
        numberList.add(42);
        System.out.println(numberList.size());

        // Zugriff bei beiden via Index, aber Arrays haben eigene Syntax:
        numberArray[0] = 10;
        System.out.println(numberArray[0]);
        numberList.set(0, 20);
        System.out.println(numberList.get(0));
    }
}
