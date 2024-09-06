import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w Menu Zadań!");
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj numer zadania, jakie chcesz zobaczyć [1-8]");

        int numerZadania = klawiatura.nextInt();
        switch(numerZadania){
            case 1:
                System.out.println("ZADANIE 1");
                System.out.println("Treść: Wypisz na ekranie wszystkie liczby dodatnie dwucyfrowe parzyste. Liczby oddziel znakiem spacji.");

                System.out.println("Tego jeszcze niestety nie ma :(");
                // DO ZROBIENIA, POTEM TO ^ USUNĄĆ
                break;

            case 2:
                System.out.println("ZADANIE 2");
                System.out.println("Treść: Wczytaj słowo z klawiatury i sprawdź, czy jest palindromem, czyli czytane od początku do końca i od końca do początku ma takie samo brzmienie.");

                System.out.println("Tego jeszcze niestety nie ma :(");
                // DO ZROBIENIA, POTEM TO ^ USUNĄĆ
                break;

            case 8:
                System.out.println("ZADANIE 8");
                System.out.println("Treść: Wygeneruj hasło losowe. Długość hasła powinna wynosić 20 znaków, a ponadto powinno zawierać liczby, wielkie i małe litery oraz znaki specjalne.");

                String haslo = "";
                String maleLitery = "qwertyuiopasdfghjklzxcvbnm";
                String duzeLitery = "QWERTYUIOPASDFGHJKLZXCVBNM";
                String znakiSpecjalne = "!@#$%^&*()_+-=<>,.?/|";
                String cyfry = "0123456789";
                int losowa;

                for (int i = 0; i < 5; i++) {
                    losowa = (int) (Math.random()*maleLitery.length());
                    haslo = haslo + maleLitery.charAt(losowa);
                    losowa = (int) (Math.random()*duzeLitery.length());
                    haslo = haslo + duzeLitery.charAt(losowa);
                    losowa = (int) (Math.random()*znakiSpecjalne.length());
                    haslo = haslo + znakiSpecjalne.charAt(losowa);
                    losowa = (int) (Math.random()*cyfry.length());
                    haslo = haslo + cyfry.charAt(losowa);
                }
                System.out.println("Wygenerowane hasło: "+haslo);
                break;

            default:
                System.out.println("Nie wpisano (odpowiedniej) cyrfy!");
                break;
        }
    }
}