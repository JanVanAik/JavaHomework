package Lesson_4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<String> storage = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String UserInput = scanner.nextLine();
            if ("exit".equals(UserInput)){
                System.out.println("Thanks for using this");
                break;
            }
            switch (UserInput) {
                case "print":
                    Iterator i=storage.descendingIterator();
                    while(i.hasNext())
                    {
                        System.out.println(i.next());
                    }
                    break;
                case "revert":
                    storage.pollLast();
                    System.out.println(storage);
                    break;
                default:
                    storage.add(UserInput);
                    System.out.println(storage);
                    break;
            }
        }

    }
}
