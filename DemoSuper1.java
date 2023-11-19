
class Kotak {
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    // Default constructor
    Kotak() {
        panjang = lebar = tinggi = 0;
    }

    Kotak(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public double hitungVolume() {
        return (panjang * lebar * tinggi);
    }
}

class KotakPejal extends Kotak {
    private double berat;

    KotakPejal(double p, double l, double t, double b) {
        super(p, l, t); // Memanggil constructor kelas Kotak
        berat = b;
    }

    public double getBerat() {
        return berat;
    }
}

class DemoSuper1 {
    public static void main(String[] args) {
        // Melakukan instansiasi terhadap kelas turunan
        KotakPejal k = new KotakPejal(6, 5, 4, 2);
        System.out.println("Volume k: " + k.hitungVolume());
        System.out.println("Berat k: " + k.getBerat());
    }
}
