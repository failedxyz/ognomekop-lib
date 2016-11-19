package ognomekop.lib.packets;

public enum Packets {
    // CLIENT

    // SERVER

    ;

    private int id;
    private Class<? extends Packet> _class;

    Packets(int id, Class<? extends Packet> _class) {
        this.id = id;
        this._class = _class;
    }

    public static Class<? extends Packet> getById(int id) {
        for (Packets packet : Packets.values()) {
            if (packet.id == id)
                return packet._class;
        }
        return null;
    }

    public static int getId(Packet _packet) {
        for (Packets packet : Packets.values()) {
            if (packet._class == _packet.getClass())
                return packet.id;
        }
        return -1;
    }
}