package pt.up.feup.homemaestro.protocols;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class ProtocolSerializer extends StdSerializer<Protocol<?>> {

    public ProtocolSerializer() {
        this(null);
    }

    public ProtocolSerializer(Class<Protocol<?>> t) {
        super(t);
    }

    @Override
    public void serialize(Protocol<?> value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        // Add fields to serialize here
        switch (value.getClass().getSimpleName()) {
            case "ZigBeeProtocol":
                gen.writeStringField("type", "ZigBeeProtocol");
                break;
            case "InternalProtocol":
                gen.writeStringField("type", "InternalProtocol");
                break;
            default:
                gen.writeStringField("type", "InvalidProtocol");
                break;
        }
        gen.writeEndObject();
    }
}
