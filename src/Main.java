public class Main {
    public static void main(String[] args) {
        //Задача 1
        // 1. Создаем входной массив с выплатами (5 элементов)
        int[] inputArray1 = {12000, 8500, 25000, 10000, 15000};

        // 2. Готовим переменные для расчетов
        int sum = 0;
        int max = inputArray1[0]; // Начинаем сравнение с первого элемента
        int min = inputArray1[0];

        // 3. Считаем сумму, макс и мин в одном цикле
        for (int payment : inputArray1) {
            sum += payment;
            if (payment > max) {
                max = payment;
            }
            if (payment < min) {
                min = payment;
            }
        }

        // 4. Считаем среднее (используем double для точности)
        double average = (double) sum / inputArray1.length;

        // 5. Формируем outputArray1 [сумма, макс, мин, среднее]
        // Так как среднее — дробное, весь массив должен быть double
        double[] outputArray1 = { (double) sum, (double) max, (double) min, average };

        // 6. Вывод результатов
        System.out.print("Input: ");
        for (int i = 0; i < inputArray1.length; i++) {
            System.out.print(inputArray1[i] + (i < inputArray1.length - 1 ? ", " : ""));
        }

        System.out.println();

        System.out.print("Output [сумма, максимум, минимум, среднее]: ");
        for (int i = 0; i < outputArray1.length; i++) {
            System.out.print(outputArray1[i] + (i < outputArray1.length - 1 ? " | " : ""));
        }

        // Задача 2
        int[] inputArray2 = {50000, 75000, 110000, 45000, 92000};
        double[] outputArray2 = new double[inputArray2.length];
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * 0.13;
        }

        System.out.println();

        System.out.print("InputArray2: ");
        for (int i = 0; i < inputArray2.length; i++) {
            System.out.print(inputArray2[i] + (i < inputArray2.length - 1 ? ", " : ""));
        }

        System.out.println();

        System.out.print("OutputArray2 (Налог 13%): ");
        for (int i = 0; i < outputArray2.length; i++) {
            System.out.print(outputArray2[i] + (i < outputArray2.length - 1 ? ", " : ""));
        }
    }
}