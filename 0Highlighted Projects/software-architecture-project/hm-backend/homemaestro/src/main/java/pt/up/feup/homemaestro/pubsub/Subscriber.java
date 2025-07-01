package pt.up.feup.homemaestro.pubsub;

public interface Subscriber {
    void update(String eventQueue, Object message);

}
