package snack
static int car = 5;

public static void main (String [] args) {
        int count = 0;
        {
        int coffee = 5;
        int car = 15;
        System.out.println(car);
        System.out.println(count++);
        }
        System.out.println(count);
        {
        int coffee = 10;
        }
        System.out.println(car);
        }