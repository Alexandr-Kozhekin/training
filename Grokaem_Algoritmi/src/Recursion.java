public class Recursion {
    public static void main(String[] args) {
        rec(3);
        System.out.print(fact(4) + " ");

        int[] nums = new int[]{1, 2, 3, 4, 5, 6,
                7, 8, 9, 10, 11, 12};
        System.out.println(sum(nums) + " ");
        System.out.println(sumNum(nums));
    }

    public static void rec(int i) {
        System.out.print(i + " "); // в каждой рекурсивной функции должно быть два случая:
        if (i <= 1) {  // базовый случай
            return;
        } else {
            rec(i - 1); // рекурсивный случай
        }
    }

    public static int fact(int x) {
        if (x == 1) { // базовый случай
            return 1;
        } else {                          // рекурсия
            return x * fact(x - 1); // когда метод(функция) вызывает саму себя это есть рекурсия
        }
    }

    public static int sumNum(int[] num) {
        int sum = 0;
        if (num[0] == 0 || num.length == 1){
            return num[0];
        } else {
            sum += sumNum(num);
        }
        return sum;
    }

    public static int sum(int[] q){
        int sum = 0;
        for(int i = 0; i < q.length; i++){
            if(q.length == 1){
                return q[0];
            }
            else {
                sum += q[i];
            }
        }
        return sum;
    }
}