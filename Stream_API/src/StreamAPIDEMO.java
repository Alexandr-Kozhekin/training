import java.util.*;
import java.util.stream.Stream;

public class StreamAPIDEMO {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();

        Collections.addAll(cities, "Париж", "Лондон", "Мадрид", "Малибу", "Казахстае");

        cities.stream() // получаем поток
                .filter(s->s.length()==6) // применяем фильтрацию по длине строки
                .forEach(s->System.out.println(s)); // выводим отфильтрованные строки на консоль

        System.out.println();

        ArrayList<String> cities1 = new ArrayList<String>();

        Collections.addAll(cities1, "Париж", "Лондон", "Мадрид");

        Stream<String> citiesStream = cities1.stream(); // получаем поток

        citiesStream = citiesStream.filter(q -> q.length()==6); // применяем фильтрацию по длине строки

        citiesStream.forEach(q->System.out.println(q)); // выводим отфильтрованные строки на консоль

    }

    class ExceptionDemo extends Exception{

        Exception exception = new Exception();
        Exception exception1 = new Exception("Exception");
        Exception exception2 = new Exception("Exception", new Exception());
        Exception exception3 = new Exception(new ExceptionDemo());
     // Exception exception4 = new Exception("Exception", exception, false, true);

    }
}
