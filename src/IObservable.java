
public interface IObservable {
    void ajoute(IObserver o);
    void supprimer(IObserver o);
    void NotifierTout(Message msg1);
    int CompterObservers();


}
