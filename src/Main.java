// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Observable ::: message publisher x 2
        IObservable p1 = new MessagePublisher1();
        // Observer :: subscrubers(abonnée) x 5
        IObserver s1 = new MessageSubscriber1();
        IObserver s2 = new MessageSubscriber2();
        // Subscriber s'abonner au publisher
         p1.ajoute(s1);
         p1.ajoute(s2);
        System.out.println("nombre de soubscribers : " + p1.CompterObservers()); // m'attendre 2
        p1.NotifierTout(new Message("premier message"));
        p1.NotifierTout(new Message("deuxieme message"));

        p1.supprimer(s1);
        System.out.println("nombre de soubscribers : " + p1.CompterObservers()); // m'attendre 1
        p1.NotifierTout(new Message("troisieme messsage"));

        // Notifier les subscribers

    }

}