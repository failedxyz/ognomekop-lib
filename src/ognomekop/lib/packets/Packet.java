package ognomekop.lib.packets;

import java.io.IOException;

public abstract class Packet {
    public void read(ByteDataInputStream stream, int length) throws IOException {
        throw new UnsupportedOperationException(this.getClass().toString() + ".read has not been implemented yet.");
    }

    public void write(ByteDataOutputStream stream, int length) throws IOException {
        throw new UnsupportedOperationException(this.getClass().toString() + ".write has not been implemented yet.");
    }
}
