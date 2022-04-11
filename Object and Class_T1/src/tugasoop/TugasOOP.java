package tugasoop;

// Membuat Class
class Makanan {
    String nama;
    int harga;
    String toping;
    String deskripsi;
            
}

// membuat object
public class TugasOOP {

    public static void main(String[] args) {
       Makanan Makanan1 = new Makanan();
       Makanan1.nama = "Bakso";
       Makanan1.harga = 12000;
       Makanan1.toping = "Mie Bihun, Mie Kuning, Sayuran, dll";
       Makanan1.deskripsi = "Bakso pada umumnya adalah makanan dari olahan daging sapi";
                      
       System.out.println("Nama = "+Makanan1.nama);
       System.out.println("Harga = Rp"+Makanan1.harga);
       System.out.println("Aneka Toping = "+Makanan1.toping);
       System.out.println("Deskripsi = "+Makanan1.deskripsi);
       
        System.out.println(" ");
       
       Makanan Makanan2 = new Makanan();
       Makanan2.nama = "Nasi Uduk";
       Makanan2.harga = 10000;
       Makanan2.toping = "Kerupuk, Telur Balado, Gorengan, dll";
       Makanan2.deskripsi = "Nasi uduk adalah makanan yang dibuat dengan santan";
                      
       System.out.println("Nama = "+Makanan2.nama);
       System.out.println("Harga = Rp"+Makanan2.harga);
       System.out.println("Aneka Toping = "+Makanan2.toping);
       System.out.println("Deskripsi = "+Makanan2.deskripsi);
        System.out.println(" ");
       
        System.out.println("==========================================================");
        String Namasiswa = "Niken Widya Astuti";
        String kelas = "2ITe1";
        int NIM = 2113020165;
        
        System.out.println("Nama = "+Namasiswa);
        System.out.println("Kelas = "+kelas);
        System.out.println("NIM = "+NIM);
        System.out.println("==========================================================");
    }
    
}