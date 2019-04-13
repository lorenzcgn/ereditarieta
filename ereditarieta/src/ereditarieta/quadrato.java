
package ereditarieta;


public class quadrato {
    double base;

    public quadrato(){}
    
    public quadrato(double base) {
        this.base = base;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public void area(double base){
        System.out.println("area quadrato: "+base*base);
    }
    
}
