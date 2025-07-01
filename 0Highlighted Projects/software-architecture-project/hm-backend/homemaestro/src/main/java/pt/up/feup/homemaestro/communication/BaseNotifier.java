package pt.up.feup.homemaestro.communication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseNotifier implements Notifier {
    private static final Logger logger = LogManager.getLogger(BaseNotifier.class.getSimpleName());

    @Override
    public void notify(String message) {
        logger.info("{}", message);
    }

    @Override
    public void connect() {
        logger.trace("BaseNotifier connected.");
    }
}