public class MessagePublisher2 implements IObservable{
  
    List<IObserver> observersList = new ArrayList<>();
    @Override
    public void ajoute(IObserver o) {
        observersList.add(o);
    }

    @Override
    public void supprimer(IObserver o) {
        observersList.remove(o);
    }

    @Override
    public void NotifierTout(Message msg) {
        for(IObserver o : observersList)
        {
            o.update(msg);
        }
    }

    @Override
    public int CompterObservers() {
        return observersList.size();
    }
}
