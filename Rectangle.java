class Rectangle {
    /*@ specification Rectangle {
    double a, b, d, S, p;
    S = a * b;
    p = 2 * a + 2 * b;
    a, b -> d {calcDiag};
    b = S / a;
    a = S / b;
    a = p / 2 - b;
    b = p / 2 - a;
    d, b -> a {calcSide};
    d, a -> b {calcSide};
    }@*/
    
    double calcDiag(double a, double b){
        return Math.hypot(a, b);
    }

    double calcSide(double d, double a){
        return Math.sqrt(d * d - a * a);
}
 
}
