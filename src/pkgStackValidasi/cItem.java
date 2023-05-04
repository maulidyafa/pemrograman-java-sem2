package pkgStackValidasi;
public class cItem {
    private char tanda;
    cItem next, prev;
    cItem(char t){
        tanda = t;
    }
    public char getTanda(){
        return tanda;
    }
}
