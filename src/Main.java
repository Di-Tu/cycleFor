//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println();

//        Task №1
        System.out.println();
        System.out.println("          Задача №1");
        for (byte i = 1; i < 11; i++) {
            System.out.println(i);
        }

//        Task №2
        System.out.println();
        System.out.println("          Задача №2");
        for (byte i = 10; i > 0; i--) {
            System.out.println(i);
        }

//        Task №3
        System.out.println();
        System.out.println("          Задача №3");
        for (byte i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

//        Task №4
        System.out.println();
        System.out.println("          Задача №4");
        for (byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }

//        Task №5
        System.out.println();
        System.out.println("          Задача №5");
        for (short i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }

//        Task №6
        System.out.println();
        System.out.println("          Задача №6");
        for (short i = 7; i < 100; i += 7) {
            System.out.println(i);
        }

//        Task №7
        System.out.println();
        System.out.println("          Задача №7");
        for (short i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

//        Task №8
        System.out.println();
        System.out.println("          Задача №8");
        int bankDeposit = 29000;
        int totalDeposit = 0;
        for (short i = 0; i < 12; i++) {
            totalDeposit = totalDeposit + bankDeposit;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + totalDeposit + " рублей");
        }

//        Task №9
        System.out.println();
        System.out.println("          Задача №9");
        totalDeposit = 0;
        for (short i = 0; i < 12; i++) {
            totalDeposit = totalDeposit + totalDeposit / 100 + bankDeposit;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + totalDeposit + " рублей");
        }

//        Task №10
        System.out.println();
        System.out.println("          Задача №10");
        for (short i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}