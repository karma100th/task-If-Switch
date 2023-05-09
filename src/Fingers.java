import java.util.Scanner;

public class Fingers {
    //8) По порядковому номеру пальца руки необходимо вывести его название на экран.
    public static void main(String[] args) {


        //короче массивом, первое, что в голову пришло
        /*String [] nameFingers = {"большой", "указательны", "средний", "безымянный",
                "мизинец"};
        System.out.println("Выбранный палец: "+ nameFingers[numberFinger-1]);*/

        //по теме switch
        int numberFinger = 0;
        do {
            System.out.println("Введите номер пальца");
            Scanner read = new Scanner(System.in);
            numberFinger = read.nextInt();
            if (numberFinger > 0 && numberFinger < 6) {
                read.close();
            }
            System.out.print("Выбранный палец: ");
            switch (numberFinger) {
                case 1:
                    System.out.println("большой");
                    break;
                case 2:
                    System.out.println("указательный");
                    break;
                case 3:
                    System.out.println("средний");
                    break;
                case 4:
                    System.out.println("безымянный");
                    break;
                case 5:
                    System.out.println("мизинец");
                    break;
                default:
                    System.out.println(" пальца с таким номером нет. Попробуйте снова.");
            }
        } while (numberFinger < 1 || numberFinger > 5);
    }
}
