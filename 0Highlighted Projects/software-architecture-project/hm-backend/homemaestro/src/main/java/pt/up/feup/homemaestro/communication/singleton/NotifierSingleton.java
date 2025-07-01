package pt.up.feup.homemaestro.communication.singleton;

import pt.up.feup.homemaestro.communication.BaseNotifier;
import pt.up.feup.homemaestro.communication.decorator.BaseDecorator;
import pt.up.feup.homemaestro.communication.decorator.MessagingDecorator;

public class NotifierSingleton {
    private static MessagingDecorator instance;

    public static synchronized MessagingDecorator getInstance() {
        if (instance == null) {
            instance = new BaseDecorator(new BaseNotifier());
            instance.connect();
        }
        return instance;
    }

    public static void setInstance(MessagingDecorator customFactory) {
        instance = customFactory;
        instance.connect();
    }

    public static synchronized void shutdown() {
        if (instance != null) {
            instance = null;
        }
    }
}