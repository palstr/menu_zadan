import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w Menu Zadań!");
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj numer zadania, jakie chcesz zobaczyć [1-8]");

        int numerZadania = klawiatura.nextInt();
        switch (numerZadania) {
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

            case 3:
                System.out.println("ZADANIE 3");
                System.out.println("Treść: Znajdź dla danej liczby najbliższą jej liczbę palindromiczną (czytana od początku jest taka sama jak czytana od końca). Dla liczby 1015 najbliższą liczbą palindromiczną jest liczba 1001.");

                System.out.println("Tego jeszcze niestety nie ma :(");
                //DO ZROBIENIA, POTEM TO ^ USUNĄĆ
                break;

            case 4:
                System.out.println("ZADANIE 4");
                System.out.println("Treść: Wczytaj słowo z klawiatury i zaszyfruj je szyfrem Cezara z kluczem 3. Szyfr Cezara polega na przesunięciu każdej litery alfabetu w prawo o klucz.");

                System.out.println("Tego jeszcze niestety nie ma :(");
                //DO ZROBIENIA, POTEM TO ^ USUNĄĆ
                break;

            case 5:
                System.out.println("ZADANIE 5");
                System.out.println("Treść: Wczytaj dwa słowa i sprawdź, czy są one dla siebie anagramami, czyli składają się z tych samych liter w takiej samej liczbie.");

                System.out.println("Tego jeszcze niestety nie ma :(");
                //DO ZROBIENIA, POTEM TO ^ USUNĄĆ
                break;

            case 6:
                System.out.println("ZADANIE 6");
                System.out.println("Treść: Napisz program obliczający sumę silni cyfr z liczby.");

                System.out.println("---");
                System.out.println("Wprowadź liczbę!");

                int liczbaSilnia = klawiatura.nextInt();
                int wynikSilnia = 1;

                for(int i = 1; i<=liczbaSilnia; i++){
                    wynikSilnia = wynikSilnia * i;
                }

                System.out.println("Silnią liczby " + liczbaSilnia + " jest " + wynikSilnia);

                break;

            case 7:
                System.out.println("ZADANIE 7");
                System.out.println("Treść: Sprawdź, czy liczba jest liczbą pierwszą, czyli ma dokładnie dwa dzielniki: 1 i samą siebie.");


                System.out.println("---");
                System.out.println("Wprowadź liczbę!");

                int wpisanaLiczba = klawiatura.nextInt();
                boolean wynik = true;

                if(wpisanaLiczba<2){
                    wynik = false;
                }
                for(int j = 2; j<=wpisanaLiczba/2; j++){
                    if(wpisanaLiczba%j==0){
                        wynik = false;
                        break;
                    }
                }
                System.out.println("Liczba " + wpisanaLiczba + (wynik == true ? "jest " : "nie jest ") + "liczbą pierwszą.");

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
                    losowa = (int) (Math.random() * maleLitery.length());
                    haslo = haslo + maleLitery.charAt(losowa);
                    losowa = (int) (Math.random() * duzeLitery.length());
                    haslo = haslo + duzeLitery.charAt(losowa);
                    losowa = (int) (Math.random() * znakiSpecjalne.length());
                    haslo = haslo + znakiSpecjalne.charAt(losowa);
                    losowa = (int) (Math.random() * cyfry.length());
                    haslo = haslo + cyfry.charAt(losowa);
                }
                System.out.println("Wygenerowane hasło: " + haslo);
                break;

            default:
                System.out.println("Nie wpisano (odpowiedniej) cyrfy!");
                break;
        }
    }
}
