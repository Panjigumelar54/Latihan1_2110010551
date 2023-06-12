package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika panji = new Matematika(5,1);
        
        System.out.println("Hasil penjumlahan: "+panji.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+panji.setPengurangan());
        System.out.println("Hasil perkalian: "+panji.setPerkalian());
        System.out.println("Hasil pembagian: "+panji.setPembagian());
    }
}
