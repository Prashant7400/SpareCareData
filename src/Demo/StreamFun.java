package Demo;

import java.util.stream.Stream;

import org.testng.annotations.Test;


public class StreamFun {

	@Test
	public void test1() {

		Stream.of("prashant", "arjun", "omi", "harshal").filter(s -> s.startsWith("a"))
				.forEach(s -> System.out.println(s));

		Long lg = Stream.of("prashant", "arjun", "omi", "harshal").count();
		System.out.println(lg);

		Stream.of("prashant", "hital", "omi", "harshal").limit(2).forEach(s -> System.out.println(s));

	}

}
