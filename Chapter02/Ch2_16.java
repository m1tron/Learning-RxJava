
import io.reactivex.rxjava3.core.Observable;

public class Ch2_16 {
    public static void main(String[] args) {
        Observable.range(5, 10)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}