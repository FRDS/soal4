
public class Member {
    private String nama;
    private String team;
    private String umur;
    private int tampil;
    private int suara;
    private int att;
    
    public void setNama(String n) {
        nama = n;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setTeam(String t){
        team = t;
    }
    
    public String getTeam(){
        return team;
    }
    
    public void setUmur(String u){
        umur = u;
    }
    
    public String getUmur(){
        return umur;
    }
    
    public void setTampil(int t){
        tampil = t;
    }
    
    public void setSuara(int s){
        suara = s;
    }
    
    public void setAtt(int a){
        att = a;
    }
    
    public double getNilai(){
        return (tampil+suara+att) / 3;
    }
}
