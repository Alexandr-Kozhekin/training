import java.net.SocketOption;
import java.time.*;

public class Test {
    int test = 1;

    public static void main (String[] args){
         int q = 6;
         int z = q + 6;
        System.out.println(z);
        System.out.println('9' + '9');
        ZonedDateTime time = ZonedDateTime.now();
        LocalDate localDate = time.toLocalDate();
        LocalTime localTime = time.toLocalTime();
        System.out.println(time.getYear());
        System.out.println(time.getDayOfYear());
        System.out.println(time.getDayOfWeek());
        System.out.println(time.getDayOfMonth());
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println("\n");

        Test test = new Test();
        Test.x(test);
        System.out.println(test.test);

        double a = Long.MAX_VALUE;
        long b = Long.MAX_VALUE;
        int c = 1;
        System.out.println(a + b + c);
        System.out.println(c + b + a);

        System.out.println(sum(-1,2,3));
        System.out.println(sum2(-1,2,3));

        for (int i = 1; i <= 10; i++){
            switch (i) {
                case (1):
                    System.out.println("1");
                    break;
                case (2):
                    System.out.println("2");
                    break;
                case (3):
                    System.out.println("3");
                    break;
                case (4):
                    System.out.println("4....");
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        }
    }

    public static void x(Test test){
        test.test++;
    }

    public static int sum (int a, int b, int c){
        int sum = 0;
        return sum = a + b + c;
    }

    public static int sum2 (int a, int b, int c){
        int sum = 0;
        if(a > 0) sum += a;
        if(b > 0) sum += b;
        if(c > 0) sum += c;
        return sum;
    }
}
