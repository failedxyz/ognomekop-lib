package ognomekop.lib.packets;

/**
 * A listing of all packets that can be passed between the client and the server. These packets can be found in their
 * respective packages under .client and .server, and this enum also includes functions to get a packet's type from its
 * ID as well as its ID from its type, which is useful for serializing/deserializing data to be sent/received.
 */
public enum Packets {
    // CLIENT

    // SERVER

    ;

    private int id;
    private Class<? extends Packet> _class;

    /**
     * @param id     The id of the packet.
     * @param _class A class object representing the class of the packet.
     */
    Packets(int id, Class<? extends Packet> _class) {
        this.id = id;
        this._class = _class;
    }

    /**
     * Returns a class object representing the class of the packet based on its ID from the listing.
     *
     * @param id The ID that is being looked up.
     * @return The class of the packet, if it's found, otherwise null.
     */
    public static Class<? extends Packet> getById(int id) {
        for (Packets packet : Packets.values()) {
            if (packet.id == id)
                return packet._class;
        }
        return null;
    }

    /**
     * Returns the integer ID of the packet given.
     *
     * @param _packet The packet whose ID is being looked up.
     * @return The integer ID of the packet, if it's found, otherwise -1.
     */
    public static int getId(Packet _packet) {
        for (Packets packet : Packets.values()) {
            if (packet._class == _packet.getClass())
                return packet.id;
        }
        return -1;
    }
}