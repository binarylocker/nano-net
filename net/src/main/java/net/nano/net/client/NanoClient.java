package net.nano.net.client;

public interface NanoClient {

    void connect();

    void disconnect();

    static NanoClientBuilder builder() {
        return new NanoClientBuilder();
    }
}
