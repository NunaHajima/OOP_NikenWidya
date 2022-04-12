package looping_dowhile;

public class Looping_DoWhile {

    public static void main(String[] args) {
        int x = 11;
        do {
          System.out.println("Memesan Bakso "+x +"\n");
          x++;
        }
        while (x <=15);
        System.out.println("============================================================");
        System.out.println("                Looping Do_While 1");
        System.out.println("============================================================");
        
        int i = 10;
        do {
          System.out.println("Hasil perkalian " +i+"*3 = "+i*3+"\n");
          i--;
        }
        while (i >3 );
        System.out.println("============================================================");
        System.out.println("                Looping Do_While 2");
        System.out.println("============================================================");
        
        char n = 'A';
        do{
            System.out.print(n+" ");
            n++;
        }
        while (n <= 'Z' );
        System.out.println("\n");
        System.out.println("============================================================");
        System.out.println("                Looping Do_While 3");
        System.out.println("============================================================");
    }
    
}
