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
  public static void main(String[] args) {
    Merchandise Merc = new Merchandise();
    System.out.println(Merc.barang + " ");
    Merc.harga();
    System.out.println(" ");
    System.out.println(Merc.JenisMerchandise + " ");
    Merc.harga2();
  }
}