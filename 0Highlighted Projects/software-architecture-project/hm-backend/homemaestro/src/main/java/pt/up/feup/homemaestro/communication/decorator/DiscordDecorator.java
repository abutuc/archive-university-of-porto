package pt.up.feup.homemaestro.communication.decorator;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import org.apache.logging.log4j.LogManager;
import pt.up.feup.homemaestro.communication.Notifier;

public class DiscordDecorator extends MessagingDecorator {
    private JDA jda;

    public DiscordDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        String channelID = "1317099365537546251";
        TextChannel channel = jda.getTextChannelById(channelID);
        if (channel != null) {
            channel.sendMessage("```ansi\n" + message + "\n```").queue();
        } else {
            LogManager.getLogger(this.getClass().getSimpleName()).error("Channel not found!");
        }
    }

    @Override
    public void connect() {
        super.connect();
        try {
            String credentials = "MTMwMzQxOTM3MzM1NjMxODczMA.G912gE.0bw4i13Q2ovm6qdTooZIDpZaIqvKpq19vjdEdM";
            jda = JDABuilder.createDefault(credentials).build();
            jda.awaitReady();
        } catch (InterruptedException e) {
            LogManager.getLogger(this.getClass().getSimpleName()).error("Failed to connect to Discord: {}", e.getMessage());
        }
    }

}
