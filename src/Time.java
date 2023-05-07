import java.util.Scanner;

public class Time {
    /*9) Напишите программу, которая будет переводить секунды в форматированный вид - часы минуты
        секунды учитывая окончания слов.
        Пример:
            1249 -> 20 минут 49 секунд
            648958 -> 180 часов 15 минут 58 секунд
        Добавьте 3 строчку, которая будет выводить недели, сутки, часы минуты и секунды*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество секунд для преобразования");
        int secondsIn = sc.nextInt();
        sc.close();

        //разделение часов, минут и секунд
        int day;
        int hour;
        int minute;
        int seconds;
        int week = secondsIn / (3600 * 24 * 7);
        if (week == 0) {
            day = secondsIn / (3600 * 24);
        } else {
            day = (secondsIn - week * 7 * 24 * 3600) / (3600 * 24);
        }
        if (week == 0 && day == 0) {
            hour = secondsIn / 3600;
        } else {
            hour = (secondsIn - week * 7 * 24 * 3600 - day * 24 * 3600) / 3600;
        }
        if (week == 0 && day == 0 && hour == 0) {
            minute = secondsIn / 60;
        } else {
            minute = (secondsIn - week * 7 * 24 * 3600 - day * 24 * 3600
                    - hour * 3600) / 60;
        }
        if (week == 0 && day == 0 && hour == 0 && minute == 0) {
            seconds = secondsIn;
        } else {
            seconds = secondsIn - week * 7 * 24 * 3600 - day * 24 * 3600
                    - hour * 3600 - minute * 60;
        }

        //выбор нужных слов используя метод wordChoice, ниже
        String secondsWord = null;
        String minuteWord = null;
        String hourWord = null;
        String dayWord = null;
        String weekWord = null;

        if (wordChoice(seconds) > 2) {
            secondsWord = "секунд";
        } else if (wordChoice(seconds) < 2) {
            secondsWord = "секунда";
        } else secondsWord = "секунды";

        if (minute != 0) {
            if (wordChoice(minute) > 2) {
                minuteWord = "минут";
            } else if (wordChoice(minute) < 2) {
                minuteWord = "минута";
            } else minuteWord = "минуты";
        }

        if (hour != 0) {
            if (wordChoice(hour) > 2) {
                hourWord = "часов";
            } else if (wordChoice(hour) < 2) {
                hourWord = "час";
            } else hourWord = "часа";
        }

        if (day != 0) {
            if (wordChoice(day) > 2) {
                dayWord = "дней";
            } else if (wordChoice(day) < 2) {
                dayWord = "день";
            } else dayWord = "дня";
        }

        if (week != 0) {
            if (wordChoice(week) > 2) {
                weekWord = "недель";
            } else if (wordChoice(week) < 2) {
                weekWord = "недели";
            } else weekWord = "недели";
        }

        //вывод результата
        System.out.print(secondsIn + " -> ");
        if (hour != 0) {
            System.out.print(hour + " " + hourWord + " ");
        }
        if (minute != 0) {
            System.out.print(minute + " " + minuteWord + " ");
        }
        System.out.print(seconds + " " + secondsWord);
    }

    //выбор окончаний слов, у всех 3 варинта
    public static int wordChoice(int timeNumber) {
        if (timeNumber > 10 && timeNumber < 20) {
            return 3;
        } else {
            if (timeNumber % 10 == 1) {
                return 1;
            } else if (timeNumber % 10 < 5) {
                return 2;
            } else return 3;
        }

    }
}
