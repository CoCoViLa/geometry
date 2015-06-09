class RTriangle {
    /*@ specification RTriangle {
    double a, b, c, h, S, p, alpha, beta, gamma;
    const double gamma = Math.PI/2;
    a, b -> c {calcC};
    a, alpha, gamma -> c {sinCalcSide};
    a, beta -> c {cosCalcHyp};
    b, alpha -> c {cosCalcHyp};
    c, alpha -> a {cosCalcSide};
    c, beta -> b {cosCalcSide};
    b, beta, gamma -> c{sinCalcSide};
    c, gamma, alpha -> a{sinCalcSide};
    c, gamma, beta -> b{sinCalcSide};
    a, c -> alpha {calcAngle};
    b, c -> alpha {calcaCos};
    a, c -> beta {calcaCos};
    b, c -> beta {calcAngle};
    c, b -> a {calcSide};
    c, a -> b {calcSide};
    S = a*b/2;
    p = a + b + c;
  
    }@*/
    double calcAngle(double a, double c){
        return Math.asin(a/c);
    }

    double calcC(double a, double b){
        return Math.hypot(a, b);
    }
    double calcSide(double a, double b){
        return Math.sqrt(a*a - b*b);
    }

    double sinCalcSide(double a, double alpha, double beta)
    {
        return a/Math.sin(alpha)*Math.sin(beta);

    }

    double cosCalcHyp(double a, double alpha)
    {
        return a/Math.cos(alpha);

    }

    double cosCalcSide(double a, double alpha)
    {
        return a * Math.cos(alpha);
    }
}
