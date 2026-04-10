import Task1.Practicum;
import Task5.fivethTask;
import Task4.Palindrome;
import Task6.sixthTask;
import Task3.FindRepeats;
import Task2.Prac;

public class Main {
    public static void main(String[] args) {
        System.out.println("№1");
        Practicum.outPut();
        System.out.println("№2");
        Prac.outPut();
        System.out.println("№3");
        FindRepeats.outPut();
        System.out.println("№4");
        Palindrome.outPut();
        System.out.println("№5");
        fivethTask.outPut("вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5");
        System.out.println("№6");
        String[] grades = {
                "Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"
        };
        System.out.println(sixthTask.outPut(grades));
    }
}