package basics;

import java.awt.Canvas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		Object obj1 = new int[2];
		int x = 5;
		Object obj2 = 5;
		Object obj3 = (int)x;
		
		//how to make array of some different generics type:
		
		 List<String> list = Arrays.asList(new String[] {"One", "Two", "Three"});
		 System.out.println(Arrays.asList(new int[] {1,2,3}));
		 Integer [] is = new Integer[] {1,2,3};
		 List<Integer> list2 = Arrays.asList(is);
//		 https://docs.oracle.com/javase/tutorial/extra/generics/wildcards.html
		 List<List<?>> listArr = new ArrayList<>();
		 listArr.add(list);
		 listArr.add(list2);
//		 listArr.add(new Object());//Compile time, you must insert List
		 
		 listArr.stream().forEachOrdered(i->System.out.println(i));
		 System.out.println(listArr.get(1).get(1));
		 
		 List<List<? extends Shape>> shapesLists = new ArrayList<List<? extends Shape>>();
		 
		 List<Circle> listCircle = null; // = Arrays.asList(null);
		 List<Rectangle> rectangles ;
		 
		 shapesLists.add(listCircle);
		 
		 Rectangle r = new Rectangle();
		 
		 List<? extends Shape> shapes2 = new ArrayList();
//		 shapes2.add(r);
		 List<?> shapes3 = new ArrayList();
//		 shapes3.add(r);//compile error

		 

	}
}

 abstract class Shape {
    public abstract void draw(Canvas c);
}

 class Circle extends Shape {
    private int x, y, radius;
    public void draw(Canvas c) {
//        ...
    }
}

 class Rectangle extends Shape {
    private int x, y, width, height;
    public void draw(Canvas c) {
//        ...
    }
}
/*
About generics an subtyping

https://docs.oracle.com/javase/tutorial/extra/generics/subtype.html

In general, if Foo is a subtype (subclass or subinterface) of Bar,
 and G is some generic type declaration, it is not the case that G<Foo> is a subtype of G<Bar>. 
 This is probably the hardest thing you need to learn about generics, because it goes against our deeply held intuitions.


*/