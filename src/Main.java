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

        // Задача 3
        int[] inputArray3 = {3000, 5500, 10000, 2000, 5001};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        for (int i = 0; i < inputArray3.length; i++) {
            if (inputArray3[i] > 5000) {
                outputArray3[i] = true;
            } else {
                outputArray3[i] = false;
            }
        }

        System.out.print("InputArray3 (Бонусы): ");
        for (int i = 0; i < inputArray3.length; i++) {
            System.out.print(inputArray3[i] + (i < inputArray3.length - 1 ? ", " : ""));
        }

        System.out.println();

        System.out.print("OutputArray3 (Выше 5000?): ");
        for (int i = 0; i < outputArray3.length; i++) {
            System.out.print(outputArray3[i] + (i < outputArray3.length - 1 ? ", " : ""));
        }

        // Задача 4

        int[] inputArray4 = {1500, 200, -50, 3000, 100};
        boolean[] outputArray4 = new boolean[1];
        outputArray4[0] = true;

        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4[0] = false;
                break;
            }
        }

        System.out.print("InputArray4 (Остатки на счете): ");
        for (int i = 0; i < inputArray4.length; i++) {
            System.out.print(inputArray4[i] + (i < inputArray4.length - 1 ? ", " : ""));
        }

        System.out.println();

        System.out.print("OutputArray4 (Всегда положительный?): ");
        System.out.println(outputArray4[0]);

        // Задача 5

        int[] inputArray5 = {150000, -20000, 45000, 0, 120000};
        int[] outputArray5 = new int[1];
        int count = 0;

        for (int profit : inputArray5) {
            if (profit > 0) {
                count++;
            }
        }
        outputArray5[0] = count;

        System.out.print("InputArray5 (Прибыль по месяцам): ");
        for (int i = 0; i < inputArray5.length; i++) {
            System.out.print(inputArray5[i] + (i < inputArray5.length - 1 ? ", " : ""));
        }

        System.out.println();

        System.out.print("OutputArray5 (Количество рентабельных месяцев): ");
        System.out.println(outputArray5[0]);
    }
}