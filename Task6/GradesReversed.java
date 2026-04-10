package Task6;

public class GradesReversed {
    public static String gradeStringToInt(String grade) {
        return switch (grade) {
            case "Безупречно" -> "5";
            case "Потрясающе" -> "4";
            case "Восхитительно" -> "3";
            case "Прекрасно" -> "2";
            default -> "1";
        };
    }
}
