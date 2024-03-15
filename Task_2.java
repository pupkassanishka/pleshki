public class Task_2 {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e", "f", "g"};

        // Использование do...while
        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length);

        // Использование while
        i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }

        // Использование for
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Использование foreach
        for (String element : array) {
            System.out.println(element);
        }

        // Вывести каждый второй элемент массива
        for (i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }

        // Вывести каждый второй элемент массива и прекратить перебор, если элемент == null
        for (i = 0; i < array.length; i += 2) {
            if (array[i] == "e") {
                break;
            }
            System.out.println(array[i]);
        }
    }
}