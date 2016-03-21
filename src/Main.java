
import java.util.ArrayList;

public class Main {

    static ArrayList<Member> listMember = new ArrayList();

    public static void main(String[] args) {
        inputMember("Miki Hoshii", "A", "17",90,80,95);
        inputMember("Yazawa Nico", "A", "15",87,90,93);
        inputMember("Nishikino Maki", "B", "17",85,90,80);
        inputMember("Ranko", "B", "18",80,83,90);
        System.out.println("Data Member :");
        System.out.println("-----------------------------");
        for (Member mbr : getAll()) {
            System.out.println("Nama: " + mbr.getNama());
            System.out.println("Team: " + mbr.getTeam());
            System.out.println("Umur: " + mbr.getUmur());
            System.out.println("Rata-rata nilai: " + mbr.getNilai());
            System.out.println("-----------------------------");
        }
    }
    
    public static void inputMember(String n, String t, String u, int a, int b, int c) {
        Member mbr = new Member();
        mbr.setNama(n);
        mbr.setTeam(t);
        mbr.setUmur(u);
        mbr.setTampil(a);
        mbr.setSuara(b);
        mbr.setAtt(c);
        listMember.add(mbr);
    }

    public static ArrayList<Member> getAll() {
        return listMember;
    }
}
