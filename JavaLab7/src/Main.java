import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println(calculateAverage(Arrays.asList(2,4,5,10)));
        System.out.println(calculateAverageStreams(Arrays.asList(2,4,5,10)));

        String[] strings = new String[]{"car","job","animal"};
        System.out.println(upperCase(Arrays.asList(strings)));

        System.out.println(sumOddAndEven(Arrays.asList(1,2,3,4)));
        System.out.println(sumOddAndEvenStream(Arrays.asList(1,2,3,4)));
        System.out.println(deleteDuplicate(Arrays.asList(1,2,3,4,3,1,2,4)));
    }

    private static double calculateAverage(List<Integer> marks) {
        Integer sum = 0;
        if(!marks.isEmpty()) {
            for (Integer mark : marks) {
                sum += mark;
            }
            return sum.doubleValue() / marks.size();
        }
        return sum;
    }

    private static double calculateAverageStreams(List <Integer> marks) {
        return marks.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    private static List <String> upperCase(List <String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    private static List<Integer> sumOddAndEven(List <Integer> numbers) {
        int odd = 0, even = 0;
        List <Integer> oddAndEven = new ArrayList<Integer>();

        for (Integer num : numbers ) {
            if(num % 2 == 0) even += num;
            else odd += num;
        }

        oddAndEven.add(odd);
        oddAndEven.add(even);

        return oddAndEven;
    }

    private static List<Integer> sumOddAndEvenStream(List <Integer> numbers) {
        List <Integer> oddAndEven = new ArrayList<Integer>();
        oddAndEven.add(
                numbers.stream()
                .filter(n -> n % 2 == 1)
                .reduce(0, Integer::sum)
                );
        oddAndEven.add(
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .reduce(0, Integer::sum)
        );

        return oddAndEven;
    }

    private static List <Integer> deleteDuplicate (List <Integer> numbers) {
        List <Integer> unique = new ArrayList<>();
        unique.forEach(e -> {
            if(!unique.contains(e)) unique.add(e);
        });
        return unique;
    }
}