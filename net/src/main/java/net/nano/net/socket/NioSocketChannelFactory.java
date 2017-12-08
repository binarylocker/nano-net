package net.nano.net.socket;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;

public class NioSocketChannelFactory implements SocketChannelFactory {

    private static final SelectorProvider DEFAULT_SELECTOR_PROVIDER = SelectorProvider.provider();

    public SocketChannel createSocketChannel() throws IOException {
        return DEFAULT_SELECTOR_PROVIDER.openSocketChannel();
    }

    public ServerSocketChannel createServerSocketChannel() throws IOException {
        return DEFAULT_SELECTOR_PROVIDER.openServerSocketChannel();
    }

}