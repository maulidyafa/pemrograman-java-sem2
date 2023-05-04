package pkgPustakaADT;
public class cPenumpang {
    private int nomer, Jum;
    private String asal, tujuan, nama;
    cPenumpang (int no, int ju, String as, String tj, String nm){
        nomer = no; Jum = ju; asal = as; tujuan = tj; nama = nm;
    }
    public void setNO (int n){
        nomer = n;
    }
    public void setJum (int n){
        Jum = n;
    }
    public void setAsal (String n){
        asal = n;
    }
    public void setTujuan (String n){
        tujuan = n;
    }
    public void setNama (String n){
        nama = n;
    }
    public int getNo(){
        return nomer;
    }
    public int getJum(){
        return Jum;
    }
    public String getAsal(){
        return asal;
    }
    public String getTujuan(){
        return tujuan;
    }
    public String getNama(){
        return nama;
    }
    public void cetak(){
        System.out.println(nomer);System.out.println(Jum);System.out.println(asal);System.out.println(tujuan);System.out.println(nama);
    }
    @Override
    public String toString() {
        return "No. Antrian    : "+nomer+"\nNama Pemesan   : "+nama+"\nStasiun asal   : "+asal+"\nStasiun Tujuan : "+tujuan;
    }  
}