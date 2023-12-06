public class Rettangolo implements Forma{

    private String nomeFigura;
    private int base;
    private int altezza;

    public Rettangolo(String nomeFigura, int base, int altezza){
        this.nomeFigura = nomeFigura;
        this.base = base;
        this.altezza = altezza;
    }

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public void stampaArea() {
        int area = this.base * this.altezza;
        System.out.println("L'area del " + this.nomeFigura.toLowerCase() + " è: " + this.base + " x " + this.altezza +
                " = " + area);
    }
}
