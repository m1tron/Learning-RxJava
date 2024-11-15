
import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.CopyOnWriteArrayList;

public class Ch3_32 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .toList(CopyOnWriteArrayList::new)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}