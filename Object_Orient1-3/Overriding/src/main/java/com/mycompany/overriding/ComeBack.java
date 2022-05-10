package com.mycompany.overriding;

class ComeBack{
    public void grup (){
        System.out.println("BTS akan comeback pada Juni 2022");
    }
}
class JudulLagu extends ComeBack{
    @Override
    public void grup(){
        System.out.println("Salah satu lagu yang ditunggu yaitu Born Singer");
    }
}
class Album extends ComeBack {
    @Override
    public void grup (){
        System.out.println("Harga termahal +- Rp 825.000 dengan rincian set + compact ");
    }
}
class daftarlagu extends ComeBack{
    @Override
    public void grup(){
       System.out.println("");
       System.out.println("Beberaapa judul lagu dalam tracklist");
        System.out.println("Jamais Vu");
        System.out.println("Singularity");
        System.out.println("Euphoria");
        System.out.println("Born Singer");
        System.out.println("DLL");
    }
}