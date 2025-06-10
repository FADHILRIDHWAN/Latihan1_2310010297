package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args){
        //membuat objek
        Matematika fadhil = new Matematika(9,7);
        
        System.out.println("Hasil penjumlahan: "+fadhil.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+fadhil.setPengurangan());
        System.out.println("Hasil perkalian: "+fadhil.setPerkalian());
        System.out.println("Hasil pembagian: "+fadhil.setPembagian());
    
    }           
}
