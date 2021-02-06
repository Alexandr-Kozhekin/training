import java.util.Scanner;
//реализация Бинарного поиска

 public class BinarySearch {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         int number = scanner.nextInt();
         int [] num = new int[256];

         for(int i = 0; i < num.length; i++){

             num[i] = i + 1;

         }

         System.out.print(BinaryNumSearch(num, number));

     }

     public static int BinaryNumSearch (int [] ints, int number){
         //в переменных хронятся границы поиска той части списка в которых будет проводится поиск
         int low = 0;
         int high = ints.length-1;

         while (low <= high){ // пока эта часть не сократится до одгого элемента
             int mid = (low + high)/2; // проверяем средний элемент
             int guess = ints[mid]; //угадываем нужгый элемент

             if (guess == number) { // значение найдено
                 return mid;
             }
             if (guess > number){ //много
                 high = mid - 1;
             }
             else { // мало
                 low = mid + 1;
             }
         }
         return 0; // значения не существует
     }
 }
