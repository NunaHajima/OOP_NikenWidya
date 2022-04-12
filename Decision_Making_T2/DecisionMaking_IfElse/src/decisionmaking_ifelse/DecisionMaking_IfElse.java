package decisionmaking_ifelse;

public class DecisionMaking_IfElse {

    public static void main(String[] args) {
        int x=8;
        if(x > 9){
            System.out.print("Angka ini lebih besar dari 9"+"\n");
        }else{
            System.out.print("Angka ini lebih kecil dari 9"+"\n");
        }
        System.out.println("============================================================");
        System.out.println("                Decision Making If Else 1");
        System.out.println("============================================================");
        
        int nilai;
        nilai = 60;
        if (nilai >= 90){
            System.out.println("A");
        }
        else if (nilai >=80 && nilai <90){
            System.out.println("B");
        }
        else if(nilai >=70 && nilai <80){
            System.out.println("C");
        }
        else if (nilai >=60 && nilai <70){
            System.out.println("D");
        }
        else if (nilai>=50 && nilai <60){
            System.out.println("E");
        }
        else
            System.out.println("Mengulang Kembali");
        System.out.println("============================================================");
        System.out.println("                Decision Making If Else 2");
        System.out.println("============================================================");
    }
}
