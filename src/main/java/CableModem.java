public class CableModem extends Modem {
    String method = "cable connection";
    
    public void connect() {
        System.out.println("Connectiong to the Internet ...");
        System.out.println("Using a " + method);
    }
    
    public void disconnect(){
        System.out.println("Disconnecting the Internet...");
        System.out.println("Disconnect successful!");
    }
}

