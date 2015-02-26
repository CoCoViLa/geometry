class RTriangle {
    /*@ specification RTriangle {
    double a, b, c, h, S, p, alpha, beta, gamma;
    a, b -> c {calcC};
    a, alpha, gamma -> c {sinCalcSide};
    b, beta, gamma -> c{sinCalcSide};
    c, gamma, alpha -> a{sinCalcSide};
    c, gamma, beta -> b{sinCalcSide};
    c, b -> a {calcSide};
    c, a -> b {calcSide};
  
    }@*/
    double calcC(double a, double b){
        return Math.hypot(a, b);
    }
    double calcSide(double a, double b){
        return a*a - b*b;
    }
    double sinCalcSide(double a, double alpha, double beta)
    {
        return a/Math.sin(alpha)*Math.sin(beta);
    }
}
