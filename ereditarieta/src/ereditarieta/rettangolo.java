
package ereditarieta;


public class rettangolo extends quadrato {
    double lar;

    public rettangolo() {
    }

    public rettangolo(double base) {
        super(base);
    }
    public double getLar() {
        return lar;
    }

    public void setLar(double lar) {
        this.lar = lar;
    }
    
    public void perimetro(double base, double lar){
        
        System.out.println("perimetro rettangolo: "+(base+lar)*2);
    }
    
    @Override
    public void area(double base){
        
    }
}
