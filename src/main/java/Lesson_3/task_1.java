//Пусть дан произвольный список целых чисел.
//
//1) Найти максимальное значение
//2) Найти минимальное значение
//3) Найти среднее значение
//4) Нужно удалить из него чётные числа

package Lesson_3;

import java.util.Collections;
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> UserList =  new LinkedList();
        Collections.addAll(UserList, 0, 1, 3, 100, 54, 123, 54, 6, 11, 1, 11, 11, 11, 0, 33, 12, 1);
        Integer Max = UserList.getFirst();
        Integer Min = UserList.getFirst();
        Integer Sum = 0;
        Integer Amt = UserList.size();
        for (int i = 0; i < UserList.size(); i++) {
            Sum += UserList.get(i);
            if(Max < UserList.get(i)){
                Max = UserList.get(i);
            } else if (Min > UserList.get(i)) {
                Min = UserList.get(i);
            }
        }
        for (int i = 0; i < UserList.size(); i++) {
            if (UserList.get(i) % 2 == 0){
                UserList.pop();
            }
        }
        System.out.println("Maximum = " + Max + "; \nMinimum = " + Min + ";\n" +
                "Avg = " + Sum/Amt + "\nYour list is clear of even numbers");

    }
}
