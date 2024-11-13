
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

import java.util.concurrent.ThreadLocalRandom;

public class Ch5_10 {
    public static void main(String[] args) {

        ConnectableObservable<Integer> threeInts =
                Observable.range(1, 3).publish();

        Observable<Integer> threeRandoms = threeInts.map(i ->
                randomInt());

        threeRandoms.subscribe(i -> System.out.println("Observer 1: " + i));
        threeRandoms.subscribe(i -> System.out.println("Observer 2: " + i));

        threeInts.connect();
    }

    public static int randomInt() {
        return ThreadLocalRandom.current().nextInt(100000);
    }
}