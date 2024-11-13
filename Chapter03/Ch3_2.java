
import io.reactivex.rxjava3.core.Observable;

public class Ch3_2 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .take(3)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}