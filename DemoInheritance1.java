class A {
    private int a;

    public void setA(int nilai) {
        a = nilai;
    }

    public int getA() {
        return a;
    }
}

// membuat kelas turunan (subclass) dari kelas A
class B extends A {
    private int b;

    public void setB(int nilai) {
        b = nilai;
    }

    public int getB() {
        return b;
    }
}

class DemoInheritance1 {
    public static void main(String[] args) {
        // melakukan instansiasi terhadap kelas B
        B obj = new B();
        // mengeset nilai objek dari kelas B
        obj.setA(100);
        obj.setB(200);

        // mendapatkan nilai yang terdapat dalam objek dari kelas B
        System.out.println("Nilai a: " + obj.getA());
        System.out.println("Nilai b: " + obj.getB());
    }
}
    