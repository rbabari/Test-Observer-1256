public class MessageSubscriber1 implements IObserver{
    @Override
    public void update(Message msg) {
        System.out.println("message : " + msg.getMessageContent());

    }
}
