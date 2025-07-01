package pt.up.feup.homemaestro.protocols.messages.internalprotocol;

public record InternalProtocolHeader(
        InternalProtocolMessageType type,
        Integer from,
        Integer to,
        String protocol
) {
}
