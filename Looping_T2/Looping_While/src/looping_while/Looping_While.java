package looping_while;

public class Looping_While {

    public static void main(String[] args) {
        int i = 10;
        while(i<=15){
            System.out.println("Percobaan Looping While ke " +i);
            i++;
        }
        System.out.println("============================================================");
        System.out.println("                Looping While 1");
        System.out.println("============================================================");
        
        int x = 5;
        while(x >0){
            System.out.println("Percobaan While berkurang "+x);
            x--;
        }
        System.out.println("============================================================");
        System.out.println("                Looping While 2");
        System.out.println("============================================================");
        
        int n = 0;
        while(n <=5){
            System.out.print(n+".");
            System.out.println("Looping While");
            n++;
        }
        System.out.println("============================================================");
        System.out.println("                Looping While 3");
        System.out.println("============================================================");
    }
    
}
