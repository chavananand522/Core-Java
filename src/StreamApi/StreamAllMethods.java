package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAllMethods {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 90, 30, 40, 50, 60, 70, 10, 15);

		// 1. filter() -> Selects elements that satisfy a condition
		System.out.println("Filter (>=30):");
		numbers.stream()
				.filter(n -> n >= 30)
				.forEach(System.out::println);

		// 2. map() -> Transforms each element into a new value
		System.out.println("\nMap(*2):");
		numbers.stream()
				.map(n -> n * 2)
				.forEach(System.out::println);

		// 3. sorted() -> Sorts the stream in ascending order
		System.out.println("\nSorted:");
		numbers.stream()
				.sorted()
				.forEach(System.out::println);

		// 4. distinct() -> Removes duplicate elements
		System.out.println("\nDistinct:");
		numbers.stream()
				.distinct()
				.forEach(System.out::println);

		// 5. limit() -> Returns only the first N elements
		System.out.println("\nLimit (First 5):");
		numbers.stream()
				.limit(5)
				.forEach(System.out::println);

		// 6. skip() -> Skips the first N elements
		System.out.println("\nSkip (First 2):");
		numbers.stream()
				.skip(2)
				.forEach(System.out::println);

		// 7. count() -> Counts the total number of elements
		long count = numbers.stream().count();
		System.out.println("\nCount = " + count);

		// 8. collect() -> Collects stream elements into a Collection 
		List<Integer> evenList = numbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("\nCollected Even List = " + evenList);

		// 9. reduce() -> Combines all elements into a single result (sum, max, etc.)
		int sum = numbers.stream()
				.reduce(0, Integer::sum);
		System.out.println("\nSum = " + sum);

		// 10. anyMatch() -> Returns true if at least one element matches the condition
		boolean any = numbers.stream()
				.anyMatch(n -> n > 60);
		System.out.println("\nAny Number > 60 = " + any);

		// 11. allMatch() -> Returns true if all elements match the condition
		boolean all = numbers.stream()
				.allMatch(n -> n > 5);
		System.out.println("\nAll Numbers > 5 = " + all);

		// 12. findFirst() -> Returns the first element of the stream
		Optional<Integer> first = numbers.stream().findFirst();
		System.out.println("\nFirst Element = " + first.get());

		// 13. findAny() -> Returns any one element from the stream
		Optional<Integer> anyElement = numbers.stream().findAny();
		System.out.println("\nAny Element = " + anyElement.get());

		// 14. Chaining Multiple Operations
		System.out.println("\nFilter + Distinct + Sorted + Map:");
		numbers.stream()
				.filter(n -> n >= 20)
				.distinct()
				.sorted()
				.map(n -> n * 20)
				.forEach(System.out::println);
	}
}