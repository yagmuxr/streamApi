import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            numbers.add(i);
        }

        //2 ile 4'e bölünebilen sayılar:
        List<Integer> filteredList = new ArrayList<>();
        filteredList = numbers.stream()
                .filter(number -> number % 2 == 0 && number % 4 == 0).collect(Collectors.toList());
        System.out.println("2 ile 4'e Bölünebilen sayılar: " + filteredList);
        System.out.println("2 ile 4'e Bölünebilen sayıların sayısı: " + filteredList.size());

        //ççift sayılar
        List<Integer> evenNumbers = new ArrayList<>();
        evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println("Çift sayılar: " + evenNumbers);
        System.out.println("Çift sayıların sayısı: " + evenNumbers.size());

        //tek sayılar
        List<Integer> oddNumbers = new ArrayList<>();
        oddNumbers = numbers.stream().filter(number -> number % 2 == 1).collect(Collectors.toList());
        System.out.println("Tek sayılar: " + oddNumbers);
        System.out.println("tek sayıların sayısı: " + oddNumbers.size());

        //3'e bölünenleri tersten yazdır
        List<Integer> reverseNumbers = numbers.stream()
                .filter(number -> number % 3 == 0)
                .collect(Collectors.toList());
        System.out.println("3'e bölünen sayıların büyükten küçüğe sıralanışı: ");
        for (int i = reverseNumbers.size() - 1; i >= 0; i--) {
            System.out.print(reverseNumbers.get(i) + " ");
        }
        System.out.println();
        System.out.println("3'e bölünen sayıların sayısı: " + reverseNumbers.size());
//        List<Integer> reverseNumbers = numbers.stream()
//                .filter(number -> number % 3 == 0)
//                .sorted((a, b) -> b - a)
//                .collect(Collectors.toList());
//        System.out.println(reverseNumbers);

    }
}
