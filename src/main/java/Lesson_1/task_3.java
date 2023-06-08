//3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

package Lesson_1;

import java.util.Scanner;
import java.time.LocalTime;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Greeting;
        String UserName = sc.nextLine();
        LocalTime CurrentTime = LocalTime.now();
        if (CurrentTime.getHour() < 5 || CurrentTime.getHour() > 23){
            Greeting = "Good night, ";
        } else if (CurrentTime.getHour() < 12) {
            Greeting = "Good morning, ";
        } else if (CurrentTime.getHour() < 18 ) {
            Greeting = "Good evening, ";
        } else {
            Greeting = "Good night, ";
        }
        System.out.println(Greeting + UserName);

    }
}
