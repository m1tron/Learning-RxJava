
import io.reactivex.rxjava3.core.Observable;

public class Ch3_7 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .map(String::length)
                .distinct()
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}