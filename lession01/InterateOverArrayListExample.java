package lession1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class InterateOverArrayListExample {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");

        System.out.println("=== Iterate using Java 8 for Each and lambda ===");
        tvShows.forEach(tvShow -> {
            System.out.println(tvShow);
        });

        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()){
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow ->{
            System.out.println(tvShow);
        });

        System.out.println("\n===Iterate using a listInterator() to traverse in both directions ===");
        ListIterator<String> tvShowListInterator = tvShows.listIterator(tvShows.size());
        while (tvShowListInterator.hasPrevious()){
            String tvShow = tvShowListInterator.previous();
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using simple for-each loop ===");
        for (String tvShow: tvShows){
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using simple for loop index ===");
        for (int i = 0 ; i < tvShows.size(); i++){
            System.out.println(tvShows.get(i));
        }

    }
}