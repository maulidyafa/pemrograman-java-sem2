package pkgQueue;
public class cObject {
    private String NPM;
    private String NoAntri;
    cObject next, prev;
    cObject(String np, String na){
        NPM = np;
        NoAntri = na;     
    }
    public String getNPM(){
        return NPM;
    }
    public String getNoAntri(){
        return NoAntri;
    }
}
