public class Titik {
    private int x,y;

    public Titik(){
        x = 0;
        y = 0;
    }

    public void inisialisasiTitik(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void tampilTitik(){
        System.out.println(" " + x + " " + y);
    }

    public void perkalianSkalar(int skalar){
        x *= skalar;
        y *= skalar;
    }

    public void pencerminanSumbuX(){
        y = -y;
    }

    public void pencerminanSumbuY(){
        x = -x;
    }

    public int jarak(Titik t2){
        int dx = x - t2.x;
        int dy = y - t2.y;
        return (int) Math.sqrt(dx*dx+dy*dy);
    }
}
