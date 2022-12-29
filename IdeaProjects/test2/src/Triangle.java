public class Triangle {
    int a;
    int b;
    int c;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isTriangle(int a, int b, int c) {


            int ab = a + b;
            int bc = b + c;
            int ca = a + c;

            if ((ab) > c) {
                return true;
            }
            if ((bc) > a) {
                return true;
            }

            if ((ca) > b) {
                return true;
            }
            return false;
        }



    }

