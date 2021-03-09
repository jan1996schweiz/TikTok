package T;

public class Ta {

    public int[] a;

    Ta() {
        a = new int[3];
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void bField() {
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

    }

    public void pField() {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
