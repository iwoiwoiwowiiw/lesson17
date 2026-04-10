package Task6;

import java.util.ArrayList;
import java.util.List;

import static Task6.GradesReversed.gradeStringToInt;

public class sixthTask {
    public static String outPut(String[] grades){
        List<String> records = new ArrayList<>();

        for (String grade : grades) {
            String[] parts = grade.split(" ");

            String name = parts[0].toLowerCase();
            String surname = parts[1].toLowerCase();
            String subject = parts[2].toLowerCase();
            String gradeText = gradeStringToInt(parts[4]);

            String record = String.join(",", name, surname, subject, gradeText);
            records.add(record);
        }

        return String.join(";", records);
    }
}
