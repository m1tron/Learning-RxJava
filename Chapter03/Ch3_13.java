
import io.reactivex.rxjava3.core.Observable;

public class Ch3_13 {
    public static void main(String[] args) {
        Observable<String> menu =
                Observable.just("Coffee", "Tea", "Espresso", "Latte");
//print menu
        menu.startWith("COFFEE SHOP MENU")
                .subscribe(System.out::println);
    }
}