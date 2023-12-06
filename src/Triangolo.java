public class Triangolo implements Forma{

    private String nomeFigura;
    private int base;
    private int altezza;

    public Triangolo(String nomeFigura, int base, int altezza){
        this.nomeFigura = nomeFigura;
        this.base = base;
        this.altezza = altezza;
    }

    public String getNomeFigura(){
        return this.nomeFigura;
    }
    public int getBase(){
        return this.base;
    }

    public int getAltezza(){
        return this.altezza;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public void stampaArea() {
        int area = (this.base * this.altezza) / 2;
        System.out.println("L'area del " + this.nomeFigura.toLowerCase() + " è: (" + this.base + " x " + this.altezza +
                ") / 2 = " + area);
    }
}
