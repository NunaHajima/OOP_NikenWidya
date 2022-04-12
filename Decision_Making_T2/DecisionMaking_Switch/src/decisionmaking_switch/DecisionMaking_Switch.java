package decisionmaking_switch;

public class DecisionMaking_Switch {

    public static void main(String[] args) {
       char nilai = 'C';
       
       switch (nilai){
           case 'A' :
                   System.out.println("Amat Baik");
                   break;
           case 'B' :
                   System.out.println("Baik");
                   break;
            case 'C' :
                   System.out.println("Cukup Baik");
                   break;
            case 'D' :
                   System.out.println("Buruk");
                   break;
            case 'E' :
                   System.out.println("Sangat Buruk");
                   break;
            default :
                    System.out.println("Tidak Diketahui");
       }
       System.out.println("Penilaian "+nilai);
       System.out.println("============================================================");
       System.out.println("                Decision Making Switch 1");
       System.out.println("============================================================");
       
       int skor = 70;
       
       switch(skor){
            case 100 :
                System.out.println("Nilai Anda Sangat Bagus");
                break;
            case 90 :
                System.out.println("Nilai Anda Bagus");
                break;
            case 80 :
                System.out.println("Nilai Anda Cukup Bagus");
                break;
            case 70 :
            case 60 :
                System.out.println("Anda harus mengulang");
                break;
            default :
                System.out.println("Nilai Anda tidak ada diantara 70 - 90");
       }System.out.println("Nilai adalah " +skor);
       System.out.println("============================================================");
       System.out.println("                Decision Making Switch 2");
       System.out.println("============================================================");
       
       String Matakuliah = "Senin";
       
       switch (Matakuliah){
            case "Senin" :
               System.out.println("Sharia Commerce Concept");
               break;
            case "Selasa" :
               System.out.println("Sharia Compliace Accounting");
               break;
            case "Rabu" :
               System.out.println("Data Analytic Introduction and Decision Support System ");
               break;
            case "Kamis" :
               System.out.println("Introduction to Machine Learning");
               break;
            case "Jumat" :
               System.out.println("Object Oriented Programing and System Analysis and Design");
               break;
            default :
               System.out.println("Libur");
       }System.out.println("Hari ini adalah hari "+Matakuliah);
       System.out.println("============================================================");
       System.out.println("                Decision Making Switch 3");
       System.out.println("============================================================");

    }
    
}
