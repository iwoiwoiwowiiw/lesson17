package Task1;

public class Practicum {
    public static void outPut(){
        String start = "Привет! Меня зовут ";

        StringBuilder hello = new StringBuilder(); // создайте StringBuilder с началом start
        // добавьте подстроку "<ваше имя>"
        hello.append("Иван. ");
        // добавьте подстроку ". Я из города "
        hello.append("Я из города ");
        // добавьте подстроку "<ваш город>."
        hello.append("Зеленодольск.");



        String asString = start + hello.toString();
        System.out.println(asString);
    }
}
