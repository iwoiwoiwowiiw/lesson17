package Task5;

import static Task5.Grades.capitalize;
import static Task5.Grades.gradeToString;

public class fivethTask {
    public static void outPut(String grades){
        String[] data = grades.split(";");

        for (String item : data) {
            String[] info = item.split(",");
            String name = capitalize(info[0]);
            String surname = capitalize(info[1]);
            String subject = info[2].toLowerCase();
            String grade = gradeToString(info[3]);
            System.out.println(String.join(" ", name, surname, subject, "-", grade));
        }
    }
}
