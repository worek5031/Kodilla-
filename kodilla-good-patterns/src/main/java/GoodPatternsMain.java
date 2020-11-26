import com.kodilla.good.patterns.MovieStore;

import java.util.stream.Collectors;

public class GoodPatternsMain {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().stream()
                .collect(Collectors.joining("!", "",""));
        System.out.println(result);

          }
}
