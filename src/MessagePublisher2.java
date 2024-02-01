import java.util.ArrayList;
import java.util.List;

public class MessagePublisher2 implements IObservable{
    List<IObserver> observers = new ArrayList<>();

    @Override
    public void ajoute(IObserver o) {
        observers.add(o);

    }
    @Override
    public void supprimer(IObserver o) {
        observers.remove(o);

    }
    @Override
    public void NotifierTout(Message msg1) {
        for (IObserver iob : observers){
            iob.update(msg1);
        }

    }
    @Override
    public int CompterObservers() {

        return observers.size();
    }
}
