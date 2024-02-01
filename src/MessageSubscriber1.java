public class MessageSubscriber1 implements IObserver{
    @Override
    public void update(Message msg) {
        System.out.println("subscriber1 : " + msg.getMessageContent());

    }
}
