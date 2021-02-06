import java.util.Comparator;
import java.util.stream.Stream;

public class PhoneDemo {

    private String name;
    private String company;
    private int price;

    public PhoneDemo(String name, String comp, int price) {
        this.name = name;
        this.company = comp;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
//реализованный компаратро
    static class PhoneComparator implements Comparator<PhoneDemo> {

        public int compare(PhoneDemo a, PhoneDemo b) {

            return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
        }
    }

    public static void main(String[] args) {

        Stream<PhoneDemo> phoneStream = Stream.of(new PhoneDemo("iPhone X", "Apple", 600),
                new PhoneDemo("Pixel 2", "Google", 500),
                new PhoneDemo("iPhone 8", "Apple", 450),
                new PhoneDemo("Nokia 9", "HMD Global", 150),
                new PhoneDemo("Galaxy S9", "Samsung", 300));

        //Фильтрация и перебор
//        phoneStream.
//                filter(p -> p.getPrice()<50000).
//                forEach(p -> System.out.println(p.getName() + " - " + p.getPrice()));

        //Отображение

//        phoneStream.
//                filter(p -> p.getPrice() < 50000).
//                //Для преобразования объектов в типы Integer, Long, Double
//                //определены специальные методы mapToInt(), mapToLong() и mapToDouble() соответственно.
//                map(p -> "название: " + p.getName() + " цена: " + p.getPrice()).
//                forEach(System.out::println);

        //Плоское отображение
//        phoneStream
//                .flatMap(p->Stream.of(
//                        String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
//                        String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int)(p.getPrice()*0.1))))
//                .forEach(s -> System.out.println(s));

        //сортировка с использованием реализованного компаратора
        phoneStream.sorted(new PhoneComparator())
                .forEach(p -> System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getCompany(), p.getPrice()));

    }
}