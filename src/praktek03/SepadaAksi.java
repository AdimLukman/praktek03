package praktek03;
public class SepadaAksi {
    public static void main(String[] args) {
        sepeda s = new sepeda();
        s.setMerk("Divine");
        s.setWarna("hitam");
        s.setHarga(10000);
        
        s.cetakInfo();
    
        System.out.println("Merknya \t:");
        System.out.println(s.getMerk());
        System.out.println("Warnanya \t:");
        System.out.println(s.getWarna());
        System.out.println("Harganya \t:");
        System.out.println(s.getHarga());
    }
    
}
