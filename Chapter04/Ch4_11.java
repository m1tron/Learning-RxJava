
import io.reactivex.rxjava3.core.Observable;

public class Ch4_11 {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        source.concatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(System.out::println);
    }
}