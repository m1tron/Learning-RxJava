
import io.reactivex.rxjava3.core.Observable;

public class Ch3_30 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .toList()
                .subscribe(s -> System.out.println("Received: " + s));
    }
}