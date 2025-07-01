package pt.up.feup.homemaestro.communication.decorator;

import com.slack.api.Slack;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;
import org.apache.logging.log4j.LogManager;
import pt.up.feup.homemaestro.communication.Notifier;

import java.io.IOException;

public class SlackDecorator extends MessagingDecorator {
    private final Slack slack;

    public SlackDecorator(Notifier notifier) {
        super(notifier);
        this.slack = Slack.getInstance();
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        try {
            String channelID = "C07UT07CQ78";
            ChatPostMessageRequest request = ChatPostMessageRequest.builder()
                    .channel(channelID)
                    .text("```" + message.replaceAll("\\[\\d+m", "") + "```")
                    .build();

            String credentials = "xoxb-7971078876375-7985703985778-4UdBzPAI9k6x3izSDYvXmt3t";
            ChatPostMessageResponse response = slack.methods(credentials).chatPostMessage(request);

            if (!response.isOk()) {
                LogManager.getLogger(this.getClass().getSimpleName()).error("Failed to send message to Slack: {}", response.getError());
            }
        } catch (IOException | SlackApiException e) {
            LogManager.getLogger(this.getClass().getSimpleName()).error("Error while sending message to Slack: {}", e.getMessage());
        }
    }

    @Override
    public void connect() {
        super.connect();
        // No explicit connect needed for Slack API with OAuth token
        LogManager.getLogger(this.getClass().getSimpleName()).info("Ready to send messages on Slack.");
    }

}
