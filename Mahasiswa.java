package oop.abstraction;


public abstract class Mahasiswa { // ini deklarasi kelas abstrak
    protected String nama;
    protected String nim;
    protected double ipk;
    
    protected void tidakLulus() { // ini deklarasi method konkret
        System.out.println("Saya tidak mau tidak lulus ");
       
    }       
     // ini deklarasi method atau method abstrak     
    protected abstract void lulus();
    
    protected abstract void kuliah();
}
