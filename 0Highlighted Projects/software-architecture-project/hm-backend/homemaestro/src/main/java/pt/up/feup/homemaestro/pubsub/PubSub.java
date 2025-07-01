package pt.up.feup.homemaestro.pubsub;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class PubSub {
    private static volatile PubSub instance;

    private final Logger logger;

    private final Map<String, Set<Subscriber>> subscribers;

    private PubSub() {
        this.logger = LogManager.getLogger(PubSub.class.getSimpleName());
        this.subscribers = new HashMap<>();
    }

    public static PubSub getInstance() {
        PubSub result = instance;
        if (result != null) {
            return result;
        }
        synchronized (PubSub.class) {
            if (instance == null) {
                instance = new PubSub();
            }
            return instance;
        }
    }

    public void subscribe(String event, Subscriber subscriber) {
        subscribers.computeIfAbsent(event, k -> new HashSet<>()).add(subscriber);
    }

    public void unsubscribe(String event, Subscriber subscriber) {
        Set<Subscriber> subs = subscribers.get(event);
        if (subs != null) {
            subs.remove(subscriber);
        }
    }

    public void publish(String event, Object data) {
        if (event == null) return;
        Set<Subscriber> subs = subscribers.get(event);
        if (subs != null) {
            for (Subscriber subscriber : subs) {
                subscriber.update(event, data);
                logger.debug("Event {} published with data: {}", event, data);
            }
        }
    }

}
