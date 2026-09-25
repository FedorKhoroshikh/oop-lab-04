package lab4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/** Demonstration: runs every method of {@link StreamTasks} on sample data. */
public final class Main {

    public static void main(String[] args) {
        System.out.println("=== Lab 4: six tasks with the Stream API ===");

        List<Integer> numbers = List.of(4, 8, 15, 16, 23, 42);
        System.out.println("average(" + numbers + ") = " + StreamTasks.average(numbers));

        List<String> words = List.of("stream", "api", "java");
        System.out.println("upperCasedWithPrefix(" + words + ") = "
                + StreamTasks.upperCasedWithPrefix(words));

        List<Integer> withDuplicates = List.of(1, 2, 2, 3, 3, 3, 4);
        System.out.println("squaresOfUnique(" + withDuplicates + ") = "
                + StreamTasks.squaresOfUnique(withDuplicates));

        System.out.println("lastElement([10, 20, 30]) = "
                + StreamTasks.lastElement(List.of(10, 20, 30)));
        try {
            StreamTasks.lastElement(new LinkedHashSet<Integer>());
        } catch (NoSuchElementException e) {
            System.out.println("lastElement([]) threw: " + e.getMessage());
        }

        int[] mixed = {1, 2, 3, 4, 5, 6};
        System.out.println("sumOfEven(" + Arrays.toString(mixed) + ") = "
                + StreamTasks.sumOfEven(mixed));
        int[] allOdd = {1, 3, 5};
        System.out.println("sumOfEven(" + Arrays.toString(allOdd) + ") = "
                + StreamTasks.sumOfEven(allOdd));

        List<String> toIndex = List.of("cat", "dog", "elephant");
        System.out.println("byFirstCharacter(" + toIndex + ") = "
                + StreamTasks.byFirstCharacter(toIndex));

        try {
            StreamTasks.byFirstCharacter(List.of("cat", "car"));
        } catch (IllegalStateException e) {
            System.out.println("byFirstCharacter([cat, car]) threw: " + e.getMessage());
        }
    }
}
