public class VirusLab {
    public static void main(String[] args) {
        int numViruses = Integer.parseInt(args[0]);
        if (numViruses > 0) {
            Virus[] virii = new Virus[numViruses];
            for (int i = 0; i < numViruses; i++) {
                virii[i] = new Virus();
            }
            System.out.println("There are " + Virus.getVirusCount() + " viruses.");
        }
        
        if (Integer.parseInt(args[1]) != 0) {
            Virus Virus = new Virus();
//            int newSeconds = Integer.parseInt(args[1]);
            System.out.println("There are " + Virus.getNewSeconds());
            Virus.setNewSeconds(args[1]);
            System.out.println("There are " + Virus.getNewSeconds());
        }
        
        
    }
}
