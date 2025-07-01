package pt.up.feup.homemaestro.protocols.messages.zigbeeprotocol;

public record ZigBeeProtocolMessage(
        Integer from,
        Integer target,
        String content
) {
}
