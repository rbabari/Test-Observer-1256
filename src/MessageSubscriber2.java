public class MessageSubscriber2 implements IObserver{
    @Override
    public void update(Message msg) {
        System.out.println("subscriber2 : " + msg.getMessageContent());
    }
}
