import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("***");

        //Task#1
        System.out.println("Какая у вас операционная система? (цифра)");
        System.out.println("0 - IOS, 1 - Android:");
        byte os = new Scanner(System.in).nextByte();
        if (os==0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (os==1){
                System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println("***");

        //Task#2
        System.out.println("Введите год выпуска вашего телефона:");
        int clientDeviceYear = new Scanner(System.in).nextInt();
        if (clientDeviceYear<2015){
            switch (os){
                case 0:
                    System.out.println("Установите облегченную версию "
                            +"приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию "
                            +"приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Операционная система не определена.");
            }
        }else{
            switch (os){
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке.");
                    break;
                default:
                    System.out.println("Операционная система не определена.");
            }
        }
        System.out.println("***");

        //Task#3
        System.out.println("Введите год числом (после 1584):");
        int year = new Scanner(System.in).nextInt();
        var result = "";
        if (year>1584 && year%4==0 && (year%100!=0 || year%400==0)){
            result = " год является високосным.";
        } else {
            result = " год не является високосным.";
        }
        System.out.println(year +result);
        System.out.println("***");

        //Task#4
        System.out.println("Введите расстояние до офиса (в километрах):");
        byte deliveryDistance = new Scanner(System.in).nextByte();
        if (deliveryDistance < 20) {
            result = "1";
        } else if (deliveryDistance < 60){
            result = "2";
        } else if (deliveryDistance <= 100){
            result = "3";
        }else{
            result = "Доставка не осуществляется.";
        }
        System.out.println("Потребуется дней: " +result);
        System.out.println("***");

        //Task#5
        System.out.println("Введите число месяца в году:");
        byte monthNumber = new Scanner(System.in).nextByte();
        result = switch (monthNumber) {
            case 1, 2, 3 -> "Зима";
            case 4, 5, 6 -> "Весна";
            case 7, 8, 9 -> "Лето";
            case 10, 11, 12 -> "Осень";
            default -> "Такого времени года не существует";
        };
        System.out.println(monthNumber +"-й месяц принадлежит к сезону "
                +result);
        System.out.println("***");
    }
}