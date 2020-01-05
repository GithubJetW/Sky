public class DslModem extends Modem {
    String method = "DSL phone connection";
    
    public void connect() {
        System.out.println("Connectiong to the Internet ...");
        System.out.println("Using a " + method);
    }
    
    public void disconnect(){
        System.out.println("Disconnecting the Internet...");
        System.out.println("Disconnect successful!");
    }
}
