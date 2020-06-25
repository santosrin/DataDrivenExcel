package Java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> tvSeries = new ArrayList<String>();
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("Fringe");
        tvSeries.add("Prison Break");


        //1. using java 8 with for each loop and lambda expression
        System.out.println("----Java 8 Lambda----");
        tvSeries.forEach(shows -> {
            System.out.println(shows);
        });

        //2. using iterator
        System.out.println("----Interator----");
        Iterator<String> it = tvSeries.iterator();
        while (it.hasNext()) {
            String shows = it.next();
            System.out.println(shows);
        }

        //3. using iterator and java 8 forEachRemaining() method
        System.out.println("----using iterator and java 8 forEachRemaining() method----");
        it = tvSeries.iterator();
        it.forEachRemaining(show -> {
            System.out.println(show);
        });

        //4. using for each loop
        System.out.println("----for each loop----");
        for(String show:tvSeries) {
            System.out.println(show);
        }

        //5. using for loop with index
        System.out.println("----using for loop with index----");
        for(int i = 0 ;i <tvSeries.size();i++) {
            System.out.println(tvSeries.get(i));
        }

        //6. using a listIterator() to traverse
        System.out.println("----using a listIterator() to traverse----");
        ListIterator<String> tvSeriesList = tvSeries.listIterator(tvSeries.size());
        while (tvSeriesList.hasPrevious()) {
            String show = tvSeriesList.previous();
            System.out.println(show);
        }

        //7 using Sout
        System.out.println("----using Sout----");
        tvSeries.forEach(System.out::println);
    }
}
