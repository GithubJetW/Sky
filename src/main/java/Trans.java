public class Trans {
    public static void main(String[] args) {
        fl(args[0]);
    }
    
    static void fl(String arg) {
//        double a = (double) arg;
//        float a = Float.parseFloat(arg);
//        int b = Integer.parseInt(arg);
//        Float c = arg;
        Float c = new Float(arg);
//        System.out.println(a);
//        System.out.println(b);
        
        System.out.println(c);
        System.out.println(c.byteValue());
//        c.floatValue() = Float.parseFloat(arg);
    }
}
