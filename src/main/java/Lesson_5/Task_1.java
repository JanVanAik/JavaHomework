// Реализовать консольное приложение - телефонный справочник.
//У одной фамилии может быть несколько номеров.
//Пользователь может вводить команды:
//1: ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый аргумент - фамилия, второй - номер телефона
//2: GET Ivanov - получить список всех номеров по фамилии
//3: REMOVE Ivanov - удалить все номера по фамилии
//4: LIST - Посмотреть все записи
//5: EXIT - Завершить программу
//
//Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом
//.
//
//Пример взаимодействия (=> - это вывод на консоль):
//ADD Ivanov 8 800 555 35 35
//ADD Ivanov 8 800 100 10 10
//GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
//ADD Petrov 8 555 12 34
//LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
//REMOVE Ivanov
//LIST => Petrov = [8 555 12 34]
//GET NoName => Не найдена запись с фамилией "NoName"
//REMOVE NoName => Не найдена запись с фамилией "NoName"3
package Lesson_5;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        HashMap<String, String> storage = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] UserInput = scanner.nextLine().split(" ");
            if ("exit".equals(UserInput[0])){
                System.out.println("Thanks for using this");
                break;
            }
            switch (UserInput[0].toLowerCase()){
                case "add":
                    if (!storage.containsKey(UserInput[1])){
                        storage.put(UserInput[1], UserInput[2]+";");
                } else {
                        storage.replace(UserInput[1], UserInput[2]+"; "+storage.get(UserInput[1]));
                    }
                    break;
                case "get":
                    if (storage.containsKey(UserInput[1])) {
                        System.out.println(storage.get(UserInput[1]));
                    } else {
                        System.out.println("This surname does not exist");
                    }
                    break;
                case "remove":
                    if (storage.containsKey(UserInput[1])) {
                        storage.remove(UserInput[1]);
                    } else {
                        System.out.println("This surname does not exist");
                    }
                    break;
                case "list":
                    for (Map.Entry<String, String> str: storage.entrySet()) {
                        System.out.println(str.getKey()+"="+str.getValue());
                    }
            }
        }
    }
}
