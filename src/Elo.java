import java.util.Scanner;

public class Elo {

    public static void main(String[] args) {

//        System.out.println("Hello World");
//        System.out.println("Maciej Jest kurwa najelpszy");
//
//        int a = 2;
//        int b = 3;
//        int c = a + b;
//        byte liczba = 125;
//        String imie = "Maciej";
//        String nazwisko = "Wójcik";
//        System.out.println(imie + " " + nazwisko);
//        System.out.println(liczba);
//        System.out.println((double) a / b); // double oznacza liczby z przecinkiem
//        System.out.println(a++); // post inkrementacja
//        System.out.println(a);
//        System.out.println(++b); // pre inkrementacja
//        boolean isTrue = 4 == 4;
//        if (a == b || c > b) ;
//        System.out.println();
//        System.out.println("");


//   1          @
//   2         @@@
//   3        @@@@@
//   4       @@@@@@@
//   5      @@@@@@@@@
//   ...30


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imie : ");
        String print = scanner.next();

        System.out.println("Podaj swój wiek : ");
        int liczba = scanner.nextInt();

        System.out.println("Twoje imie to :" + print);
        System.out.println("Twoje wspak to :" + print);
        System.out.println("ZOstało ci do 100 lat:  " + liczba);

        System.out.println("Podaj swoje imie : ");
    }


}

