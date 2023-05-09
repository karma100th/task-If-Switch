public class WorkTimer {
    /*10)Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
     далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна выводиться фраза
     о количестве полных часов, содержащихся в n секундах.
    Пример:
        23466 -> Осталось 6 часов*/
    public static void main(String[] args) {
        int n = (int) (Math.random() * 28801);
        System.out.print(n + " -> ");
        if (n != 0) {
            int hour = n / 3600;

            if (hour == 0) {
                System.out.print("Осталось менее часа");
            } else {
                System.out.print("Остаалось " + hour);

                //выбор слова
                if (hour > 4) {
                    System.out.print(" часов");
                } else if (hour == 1) {
                    System.out.print(" час");
                } else {
                    System.out.print(" часа");
                }
            }
        } else System.out.println("Пора домой");
    }
}

