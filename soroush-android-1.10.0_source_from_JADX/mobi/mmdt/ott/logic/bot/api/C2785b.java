package mobi.mmdt.ott.logic.bot.api;

import java.io.IOException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.msgpack.core.MessageBufferPacker;

public final class C2785b {
    private static void m7098a(MessageBufferPacker messageBufferPacker, Object obj) {
        if (obj instanceof String) {
            messageBufferPacker.packString((String) obj);
        } else if (obj instanceof Integer) {
            messageBufferPacker.packInt(((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            messageBufferPacker.packBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            messageBufferPacker.packDouble(((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            messageBufferPacker.packLong(((Long) obj).longValue());
        } else {
            StringBuilder stringBuilder = new StringBuilder("Invalid packing value of type ");
            stringBuilder.append(obj.getClass().getName());
            throw new IOException(stringBuilder.toString());
        }
    }

    private static void m7099a(MessageBufferPacker messageBufferPacker, JSONArray jSONArray) {
        messageBufferPacker.packArrayHeader(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                C2785b.m7100a(messageBufferPacker, (JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                C2785b.m7099a(messageBufferPacker, (JSONArray) obj);
            } else {
                C2785b.m7098a(messageBufferPacker, obj);
            }
        }
    }

    public static void m7100a(MessageBufferPacker messageBufferPacker, JSONObject jSONObject) {
        messageBufferPacker.packMapHeader(jSONObject.length());
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            messageBufferPacker.packString(str);
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                C2785b.m7099a(messageBufferPacker, (JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                C2785b.m7100a(messageBufferPacker, (JSONObject) obj);
            } else {
                C2785b.m7098a(messageBufferPacker, obj);
            }
        }
    }
}
