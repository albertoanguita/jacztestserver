package jacz.peerengine.testserver;

/**
 *
 */
public class TestServer {

    public static void main(String args[]) throws Exception {
        if (args.length == 1) {
            try {
                int port = Integer.parseInt(args[0]);
                if (port < 0 || port > 65535) {
                    throw new NumberFormatException();
                }
                Server server = new Server(port);
                System.out.println("Starting jacuzzi test server at port " + port + "...");
                server.startServer();

//                Thread.sleep(6000);
//
//                server.stopServer();
//
//                Thread.sleep(20000);
            } catch (NumberFormatException e) {
                System.err.println("argument must be a number between 0 and 65535!");
            }
        } else {
            System.err.println("Wrong arguments!");
        }
    }
}
