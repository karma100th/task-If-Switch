import java.util.Scanner;

public class Main {
    //7) Определить принадлежность точки кругу
    public static void main(String[] args) {
        //ввод всех необходимых данных
        System.out.println("Введите координаты Х и У соответсвенно для точки");
        Scanner read = new Scanner(System.in);
        int pointX = read.nextInt();
        int pointY = read.nextInt();
        System.out.println("Введите координаты Х и У соответсвенно центра круга");
        int circlePointX = read.nextInt();
        int circlePointY = read.nextInt();
        System.out.println("Введите радиус круга");
        int circleRadius = read.nextInt();
        read.close();
        //через теорему пифагора или формулу окружности получаем сравнение ((Xc-Xp)^2+(Yc-Yp)^2)?R^2
        if ((Math.pow((pointX-circlePointX),2)+(Math.pow((pointY-circlePointY),2)))<=
                (Math.pow(circleRadius,2))){
            System.out.println("Точка принадлежит кругу");
        } else {
            System.out.println("Точка лежит вне круга");
        }

    }
}