
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


// membuat kelas turunan (subclass) dari kelas B
class C extends B {
    private int c;

    public void setC(int nilai) {
        c = nilai;
    }

    public int getC() {
        return c;
    }
}

class DemoInheritance2 {
    public static void main(String[] args) {
        // melakukan instansiasi terhadap kelas C
        C obj = new C();

        // mengeset nilai dari kelas C
        obj.setA(100);
        obj.setB(200);
        obj.setC(300);

        // mendapatkan nilai yang terdapat dalam kelas C
        System.out.println("Nilai a : " + obj.getA());
        System.out.println("Nilai b : " + obj.getB());
        System.out.println("Nilai c : " + obj.getC());
    }
}

