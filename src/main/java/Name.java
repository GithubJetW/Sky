import java.util.*;

class Name {
    public static void main(String[] args) {
        String names[] = {
            "Lauren", "Audrina", "Heidi", "Whitney",
            "Stephanie", "Spencer", "Lisa", "Brody", "Frankie",
            "Holly", "Jordan", "Brian", "Jasono"
        };
        System.out.println("The origin order:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(i + ": " + names[i] + " ");
        }
        System.out.println();
    }
}
