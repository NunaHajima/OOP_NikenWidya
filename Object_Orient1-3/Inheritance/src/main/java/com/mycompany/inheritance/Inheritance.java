package com.mycompany.inheritance;

class KPOPFan {
  protected String barang = ("Harga Album :");        
  public void harga() {                    
    System.out.println("800000");
  }
}

class Merchandise extends KPOPFan {
  private final String JenisMerchandise = ("Merchandise 1(Stiker) : "); 
  public void harga2(){
      System.out.println(100000);
  }
  private final String JenisMerchandise2 = ("Merchandise 2(Baju) : "); 
  public void harga3(){
      System.out.println(1000000);
  }
  private final String JenisMerchandise3 = ("Merchandise 3(Note Book) : "); 
  public void harga4(){
      System.out.println(200000);
  }
  public static void main(String[] args) {
    Merchandise Merc = new Merchandise();
    System.out.println(Merc.barang + " ");
    Merc.harga();
    System.out.println(" ");
    System.out.println(Merc.JenisMerchandise + " ");
    Merc.harga2();
    System.out.println(" ");
    System.out.println(Merc.JenisMerchandise2 + " ");
    Merc.harga3();
    System.out.println(" ");
    System.out.println(Merc.JenisMerchandise3 + " ");
    Merc.harga4();
  }
}