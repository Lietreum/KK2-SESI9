    class Penyanyi {
    public void bernyanyi() {
        System.out.println("Karakteristik nadanya belum didefinisikan");
    }

    // Mendefinisikan kelas-kelas turunan dari kelas Penyanyi
    static class PenyanyiJazz extends Penyanyi {
        // melakukan override terhadap method bernyanyi ()
        public void bernyanyi() {
            System.out.println("Bernyanyi dengan irama Jazz");
        }
    }

    static class PenyanyiPop extends Penyanyi {
        // melakukan override terhadap method bernyanyi ()
        public void bernyanyi() {
            System.out.println("Bernyanyi dengan irama Pop");
        }
    }

    static class PenyanyiDangdut extends Penyanyi {
        // melakukan override terhadap method bernyanyi ()
        public void bernyanyi() {
            System.out.println("Bernyanyi dengan irama Dangdut");
        }
    }
}

class DemoPolimorfisme1 {
    public static void main(String[] args) {
        Penyanyi p;
        Penyanyi.PenyanyiJazz musmujiono = new Penyanyi.PenyanyiJazz();
        Penyanyi.PenyanyiPop audi = new Penyanyi.PenyanyiPop();
        Penyanyi.PenyanyiDangdut inul = new Penyanyi.PenyanyiDangdut();

        p = musmujiono; // p refers to PenyanyiJazz object
        // will call the method in PenyanyiJazz class
        p.bernyanyi();

        p = audi; // p refers to PenyanyiPop object
        // will call the method in PenyanyiPop class
        p.bernyanyi();

        p = inul; // p refers to PenyanyiDangdut object
        // will call the method in PenyanyiDangdut class
        p.bernyanyi();

    }
}

