
import io.reactivex.rxjava3.core.Observable;

public class Ch3_15 {
    public static void main(String[] args) {
        Observable<String> items =
                Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        items.filter(s -> s.startsWith("Z"))
                .defaultIfEmpty("None")
                .subscribe(System.out::println);
    }
}