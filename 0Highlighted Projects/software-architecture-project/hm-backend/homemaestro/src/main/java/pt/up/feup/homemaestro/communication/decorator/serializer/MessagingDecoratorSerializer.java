package pt.up.feup.homemaestro.communication.decorator.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import pt.up.feup.homemaestro.communication.Notifier;
import pt.up.feup.homemaestro.communication.decorator.DiscordDecorator;
import pt.up.feup.homemaestro.communication.decorator.MessagingDecorator;
import pt.up.feup.homemaestro.communication.decorator.SlackDecorator;

import java.io.IOException;

public class MessagingDecoratorSerializer extends JsonSerializer<MessagingDecorator> {
    @Override
    public void serialize(MessagingDecorator value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        boolean isDiscordDecorator = false;
        boolean isSlackDecorator = false;

        // Traverse the hierarchy of decorators safely
        Notifier current = value;
        while (true) {
            if (current instanceof DiscordDecorator) {
                isDiscordDecorator = true;
            } else if (current instanceof SlackDecorator) {
                isSlackDecorator = true;
            }
            if (current instanceof MessagingDecorator) {
                current = ((MessagingDecorator) current).getWrapped();
            } else {
                break; // Stop at the base notifier
            }
        }

        // Write the simplified JSON
        gen.writeStartObject();
        gen.writeBooleanField("discordNotifier", isDiscordDecorator);
        gen.writeBooleanField("slackNotifier", isSlackDecorator);
        gen.writeEndObject();
    }
}