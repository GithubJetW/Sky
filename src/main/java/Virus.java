public class Virus {
    static int virusCount = 0;
    private int newSeconds = 99;
    
    public Virus() {
        virusCount++;
    }
    
//  类方法需要在方法前加"static"
//  若方法有返回值，则在方法名前添加返回值类型。若为返回值则在方法名前添加"void"
    static  int getVirusCount() {
        return virusCount;
    }
    
    int getNewSeconds() {
        return newSeconds;
    }
    
    void setNewSeconds(String arg) {
        this.newSeconds = Integer.parseInt(arg);
    }
}
