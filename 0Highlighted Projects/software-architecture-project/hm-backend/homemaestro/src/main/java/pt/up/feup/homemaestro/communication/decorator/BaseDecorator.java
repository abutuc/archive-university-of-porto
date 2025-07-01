package pt.up.feup.homemaestro.communication.decorator;

import pt.up.feup.homemaestro.communication.Notifier;

public class BaseDecorator extends MessagingDecorator {
    public BaseDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
    }

    @Override
    public void connect() {
        super.connect();
    }
}
