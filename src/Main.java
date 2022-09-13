public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
        task9();
        System.out.println();
        task10();
        System.out.println();
        task11();


    }

    private static void task11() {
        int c=0;
        int d=1;
        for (int s = 0; s <= 34; s=c+d) {
            c = d;
            d = s;
            System.out.print(s + " ");
        }
    }

    private static void task10() {
        for (int b = 1; b <= 30; b++) {
            if (b % 3 == 0 && b % 5 == 0) {
                System.out.println(b + " : ping pong");
            } else if (b % 5 == 0 && b % 3 != 0) {
                System.out.println(b + " : pong");
            } else if (b % 5 != 0 && b % 3 == 0) {
                System.out.println(b + " : ping ");
            }
        }
    }

    private static void task9() {
        int summ = 29000;
        int cash=0;
        for (int u = 1; u<=12; u++) {
            cash=cash+cash/100;
            cash=cash+summ;
            System.out.println("Месяц " + u +" сумма накоплений равна "+ cash +" рублей");
        }
    }

    private static void task8() {
        int salary = 29000;
        int total=0;
        for (int y = 1; y<=12; y++) {
            total=total+salary;
            System.out.println("Месяц " + y+" сумма накоплений равна "+total +" рублей");
        }
    }

    private static void task7() {
        for (int t = 1; t<=512; t =t*2) {
            System.out.print(t+" ");
        }
    }

    private static void task6() {
        for (int r = 7; r<=98; r =r+7) {
            System.out.print(r+" ");
        }
    }

    private static void task5() {
        for (int e = 1904; e<=2096; e=e+4) {
            System.out.println( e + " год является високосным");
        }
    }

    private static void task4() {
        for (int d = 10; d>=-10; d--) {
            System.out.println(d);
        }
    }

    private static void task3() {
        int c;
        for (int b = 0; b<=17; b++) {
            c = b % 2;
            if (c == 0) {
                System.out.println(b);
            }
        }

    }

    private static void task2() {
        for (int a = 10; a>=1; a--) {
            System.out.println(a);
        }
    }

    private static void task1() {
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }

    }
}