package PkgGUIKasir;
public class cBarang {
    public String kode,nama;
    public int harga, stock;
    
    cBarang(){
        nama=""; harga=0; kode="";stock=0;
    }
    cBarang (String kd, String nm, int h, int s){
        nama=nm; harga=h;kode=kd; stock=s;
        System.out.println("object cBarang dibuat");
    }
    public void setNama(String nm){
        nama=nm;
    }
    public void setKode (String kd){
        kode=kd;
    }
    public void setHarga (int h){
        harga=h;
    }
    public void setStock(int s){
        stock=s;
    }
    public String getNama (){
        return nama;
    }
    public String getKode(){
        return kode;
    }
    public int getHarga(){
        return harga;
    }
    public int getStock(){
        return stock;
    }
}
