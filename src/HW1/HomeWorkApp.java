package HW1;

public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign(-1,1);
        printColor(100);
        compareNumbers(10,1);
    }
    public static void printThreeWords() {
        System.out.println("Задание 2:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(int a, int b){
        System.out.println();
        System.out.println("Задание 3:");
        if (a+b>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor(int a){
        System.out.println();
        System.out.println("Задание 4:");
        if (a<=0) {
            System.out.println("Красный");
        } else if (a<=100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int a, int b){
        System.out.println();
        System.out.println("Задание 5:");
        if (a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

}