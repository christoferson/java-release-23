package demo;

import module java.base;

public class DemoJava23 {

	public static void main(String[] args) {
		// 455: Primitive Types in Patterns, instanceof, and switch (Preview)
		int i = 128;
		System.out.println(i instanceof byte);
		System.out.println(i instanceof int);

		//476: Module Import Declarations (Preview)
		System.out.println(LocalDate.now());
		
		//
		var data = List.of("foo", "bar");
		System.out.println(data.stream().collect(Collectors.joining(" ")));
		
		// 473: Stream Gatherers
		var gathered = IntStream.range(0, 12).boxed()
        .gather(Gatherers.windowFixed(3))
        .toList();
		System.out.println(gathered);
	}

	class Foo {
		Foo(List<?> l1, List<?> l2) {
		}
	}

	class Bar extends Foo {
		Bar() {
			super(List.of("123", "456"), List.of("foo", "bar"));
		}
	}
	
	class Zig extends Foo {
		Zig(String zag) {
			if (null == zag) {
				throw new IllegalArgumentException();
			}
		    var param = List.of(zag);
		    super(param, param);
		  }
	}
	
}
