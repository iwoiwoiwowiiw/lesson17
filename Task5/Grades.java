package Task5;

public class Grades {
    public static String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    public static String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }
}
