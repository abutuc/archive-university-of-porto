package pt.up.feup.homemaestro.communication.decorator;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import pt.up.feup.homemaestro.communication.Notifier;
import pt.up.feup.homemaestro.communication.decorator.serializer.MessagingDecoratorSerializer;

@JsonSerialize(using = MessagingDecoratorSerializer.class)
public abstract class MessagingDecorator implements Notifier {
    private final Notifier wrapped;

    public MessagingDecorator(Notifier notifier) {
        this.wrapped = notifier;
    }

    @Override
    public void notify(String message) {
        wrapped.notify(message);
    }

    @Override
    public void connect() {
        wrapped.connect();
    }

    public Notifier getWrapped() {
        return wrapped;
    }
}
