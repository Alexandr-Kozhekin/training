public class BinarySearchMaxNum {
    public static void main(String[] args) {

        int[] num = new int[]{5, 3, 4, 1, 2,
                10, 9, 8, 7, 6};

        for (int i = 0; i < num.length; i++){

            System.out.print(num [i] + " ");

        }

        quickSort(num, num[1],num.length-1);

        System.out.println();

        for (int i = 0; i < num.length; i++){

            System.out.print(num [i] + " ");

        }

    }

    public static void quickSort(int[] source, int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];

        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {

                    int tmp = source[leftMarker];

                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;

                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {

            quickSort(source, leftMarker, rightBorder);

        }

        if (leftBorder < rightMarker) {

            quickSort(source, leftBorder, rightMarker);

        }
    }
}