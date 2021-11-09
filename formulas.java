public class formulas {
    public double hipotenusa(Double a , Double b ){
        double processo1 = a*a + b*b;
        double c = Math.sqrt(processo1);
        return c;
    }
    public double adjacente(Double b, Double c){
        double processo1 = 0.0;
        if(b>c){
             processo1 = b*b - c*c;
         } else {
            processo1 = c*c - b*b;
        }
        double a = Math.sqrt(processo1);
        return a;


    }
}
