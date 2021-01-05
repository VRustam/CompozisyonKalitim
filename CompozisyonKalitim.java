public class CompozisyonKalitim {
    public static void main(String[] args) {

        Duzbucaqli d1 = new Duzbucaqli(20,35);
        d1.xususiyyetler();

    }
}

class Geometriksekil{

    private int en;
    private int uzunluq;

    public Geometriksekil(int en, int uzunluq) {
        this.en = en;
        this.uzunluq = uzunluq;
    }

    public Geometriksekil(int en) {
        this.en = en;
    }

    public Geometriksekil(){

    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getUzunluq() {
        return uzunluq;
    }

    public void setUzunluq(int uzunluq) {
        this.uzunluq = uzunluq;
    }

    public void alanHesabla(){
        System.out.println("Alan : " + (getEn() * getUzunluq()));
    }
    public void cevreHesabla(){
        System.out.println("Cevre : " + ((getEn()+getUzunluq()) * 2));
    }
}

class Duzbucaqli extends Geometriksekil{

    public Duzbucaqli(int en, int uzunluq){
    setEn(en);
    setUzunluq(uzunluq);
    }

    public void xususiyyetler(){
        System.out.println("En : " + getEn() + "Uzunluq : " + getUzunluq());
        alanHesabla();
        cevreHesabla();

    }

}
