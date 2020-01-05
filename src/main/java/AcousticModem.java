public class AcousticModem extends Modem {
    String method = "Acoustic";
    public void connect() {
        System.out.println("Connecting the Internet...");
        System.out.println("Using " + method);
    }
    
    public void disconnect(){
        System.out.println("Disconnecting the Internet...");
        System.out.println("Disconnect successful!");
    }
}
