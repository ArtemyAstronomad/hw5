public class HW4 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        int clientOS = 0; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }
    }
    private static void task2(){
        int clientOS = 1; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }
    }
    private static void task3(){
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year >= 1584){
            System.out.println("Этот год является високосным");
        } else {
            System.out.println("Это не високосный год");
            }

        }
    private static void task4(){
        int deliveryDistance = 95;
        int delTime = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + delTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + (delTime+1));
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + (delTime+2));
        } else {
            System.out.println("Доставка свыше 100 км не производится");
        }
    }
    private static void task5(){
int month = 2;
switch (month){
    case 12:
    case 1:
    case 2:
        System.out.println("Это зимний месяц");
        break;
    case 3:
    case 4:
    case 5:
        System.out.println("Это весенний месяц");
        break;
    case 6:
    case 7:
    case 8:
        System.out.println("Это летний месяц");
    case 9:
    case 10:
    case 11:
        System.out.println("Это осенний месяц");
    default:
        System.out.println("Неверно введен месяц");
}

    }
}
