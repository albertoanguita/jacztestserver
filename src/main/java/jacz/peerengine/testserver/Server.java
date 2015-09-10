package jacz.peerengine.testserver;

import jacz.peerengineservice.server.PeerServer;
import jacz.peerengineservice.server.PeerServerConfig;

/**
 *
 */
public class Server {

    private PeerServer peerServer;

    public Server(int port) {
        peerServer = new PeerServer(new PeerServerConfig(port, 1000), new PeerServerActionImpl());
    }

    public void startServer() {
        peerServer.startServer();
    }

    public void stopServer() {
        peerServer.stopServer();
    }
}
