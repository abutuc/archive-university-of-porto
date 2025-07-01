package pt.up.feup.homemaestro.protocols.messages.internalprotocol;

import java.util.Map;

public record InternalProtocolMessage(
        InternalProtocolHeader header,
        Map<String, String> body
) {
}
