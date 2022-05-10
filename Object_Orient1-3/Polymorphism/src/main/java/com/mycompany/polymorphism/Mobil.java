package com.mycompany.polymorphism;

class Mobil {
  public void JenisMobil() {
    System.out.println("Jenis Mobil Yang Ada di Indonesia :");
  }
}

class Jenis1 extends Mobil {
  public void JenisMobil() {
    System.out.println("1.Off-Road");
  }
}

class Jenis2 extends Mobil {
  public void JenisMobil() {
    System.out.println("2.Sedan");
    }
}
class Jenis3 extends Mobil {
  public void JenisMobil() {
    System.out.println("3.MPV");
    }
}
class Jenis4 extends Mobil {
  public void JenisMobil() {
    System.out.println("4.DLL");
    }
}

class Main {
  public static void main(String[] args) {
    Mobil myMobil = new Mobil();
    Mobil mobil1 = new Jenis1();
    Mobil mobil2 = new Jenis2();
    Mobil mobil3 = new Jenis3();
    Mobil mobil4 = new Jenis4();
        
    myMobil.JenisMobil();
    mobil1.JenisMobil();
    mobil2.JenisMobil();
    mobil3.JenisMobil();
    mobil4.JenisMobil();
  }
}

