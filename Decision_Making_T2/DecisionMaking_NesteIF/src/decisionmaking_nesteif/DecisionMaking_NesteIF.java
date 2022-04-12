package decisionmaking_nesteif;

public class DecisionMaking_NesteIF {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        
        if (x == 10){
            if(y==20){
                System.out.println("X = 10 dan Y=20");
            }
        }
        System.out.println("============================================================");
        System.out.println("                Decision Making Neste If 1");
        System.out.println("============================================================");
        
        int m = 60;
        int n = 99;
        
        if (m >= 50){
            if (n <= 100){
                System.out.println("nilai m dan n diantara 50 - 100");
            }
        }
        System.out.println("============================================================");
        System.out.println("                Decision Making Neste If 2");
        System.out.println("============================================================");
        
        int umur = 20;
        int beratbadan = 70;
        
        if (umur >= 18){
            if (beratbadan >=50){
                System.out.println("Anda bisa mendonorkan darah");
            }
        }
        System.out.println("============================================================");
        System.out.println("                Decision Making Neste If 3");
        System.out.println("============================================================");
        
    }
}
