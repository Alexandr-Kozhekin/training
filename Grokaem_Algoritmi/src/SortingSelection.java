public class SortingSelection {
    //реализация сортировки выбором
    public static void main (String[] args) {
        int[] arr = new int[]{4, 2, 34, 4, 5, 6, 6, 23, 12, 32, 5, 9, 1};

        SortingSelection(arr);

        System.out.println(arr[12]);

    }
    //метод сортировки выбором
    public static void SortingSelection ( int[] q){
        for (int i = 0; i < q.length; i++) {

            int smallestIndex = i; //индекс элемента
            int smallestValue = q[i]; //сам элемент

            for (int j = i + 1; j < q.length; j++) { //цикл выбора наименьшего элемента

                if (q[j] < smallestValue) { // если второй элемент меньше первого

                    smallestIndex = j; // индексы меняются местами
                    smallestValue = q[j]; // элементы тоже

                }
            }
            // меняем местами наименьший с array[i]
            q[smallestIndex] = q[i];
            q[i] = smallestValue;
        }
    }
}
