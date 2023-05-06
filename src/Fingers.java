import java.util.Scanner;

public class Fingers {
    //8) По порядковому номеру пальца руки необходимо вывести его название на экран.
    public static void main(String[] args) {
        System.out.println("Введите номер пальца");
        Scanner read = new Scanner(System.in);
        int numberFinger = read.nextInt();
        read.close();

        //короче массивом, первое, что в голову пришло
        /*String [] nameFingers = {"большой", "указательны", "средний", "безымянный",
                "мизинец"};
        System.out.println("Выбранный палец: "+ nameFingers[numberFinger-1]);*/

        //по теме switch
        System.out.print("Выбранный палец: ");
        switch (numberFinger){
            case 1 :
                System.out.println("большой");
                break;
            case 2 :
                System.out.println("указательный");
                break;
            case 3 :
                System.out.println("средний");
                break;
            case 4 :
                System.out.println("безымянный");
                break;
            case 5 :
                System.out.println("мизинец");
                break;
        }
    }
}
