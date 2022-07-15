package home_work_1;

public class math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-31.3d));  // 31.3 - модуль числа

        System.out.println(Math.cos(Math.toRadians(0))); // 1 - значение тригонометрических функций
        System.out.println(Math.sin(Math.toRadians(0))); // 0

        System.out.println(Math.pow(4, 3)); // 64.0 - возведение в степень

        System.out.println(Math.sqrt(81));  // 9.0 - извлечение квадратного корня
        System.out.println(Math.cbrt(8));   // 2.0 - извлечение кубического корня

        System.out.println(Math.max(12, 22)); // 22 - возвращает наибольшее значение
        System.out.println(Math.min(12, 22)); // 12 - возвращает минимальное значение

        System.out.println(Math.signum(-5)); // возвращает -1.0 если число отрицательное, 1.0 - положительное

        System.out.println(Math.floor(1.4)); // 1.0 - округление (ceil-в большую сторону, floor-в меньшую сторону,
                                             // round-привычное нам округление)

        for (int i = 0; i < 2; i++) {
            System.out.println(Math.random()); //генерация рандомных чисел
        }

    }

}