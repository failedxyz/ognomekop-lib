package ognomekop.lib.packets;

import java.io.IOException;

/**
 * A generic packet library that provides two functions, read and write.
 */
public abstract class Packet {
    /**
     * To be implemented on a packet-by-packet basis.
     *
     * @param stream The input stream to read from.
     * @param length The length of the packet.
     * @throws IOException
     */
    public abstract void read(ByteDataInputStream stream, int length) throws IOException;

    /**
     * To be implemented on a packet-by-packet basis.
     *
     * @param stream The output stream to write to.
     * @param length The length of the packet.
     * @throws IOException
     */
    public abstract void write(ByteDataOutputStream stream, int length) throws IOException;
}
