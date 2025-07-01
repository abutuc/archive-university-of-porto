package pt.up.feup.homemaestro.controllers;

import org.springframework.web.bind.annotation.*;
import pt.up.feup.homemaestro.communication.decorator.DiscordDecorator;
import pt.up.feup.homemaestro.communication.decorator.MessagingDecorator;
import pt.up.feup.homemaestro.communication.decorator.SlackDecorator;
import pt.up.feup.homemaestro.communication.singleton.NotifierSingleton;

@RestController
@RequestMapping("/api/notifiers")
public class NotifyController {

    @GetMapping
    public MessagingDecorator getNotifiers() {
        return NotifierSingleton.getInstance();
    }

    @PostMapping
    public void updateNotifierSingleton(@RequestParam Boolean discordNotifier, @RequestParam Boolean slackNotifier) {
        NotifierSingleton.shutdown();
        if (discordNotifier) {
            NotifierSingleton.setInstance(new DiscordDecorator(NotifierSingleton.getInstance()));
        }
        if (slackNotifier) {
            NotifierSingleton.setInstance(new SlackDecorator(NotifierSingleton.getInstance()));
        }
    }
}
