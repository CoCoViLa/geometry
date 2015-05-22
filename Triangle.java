class Triangle {
    /*@ specification Triangle {
    double a, b, c, h, S, p, alpha, beta, gamma, delta;
    double icr, ocr;
    p = a + b + c;
    a, b, gamma -> S {calcAreaSin};
    b, c, alpha -> S {calcAreaSin};
    a, c, beta -> S {calcAreaSin};
    a, b, c -> S {heron};
    a, b, gamma -> c {calcSide};
    a, c, beta -> b {calcSide};
    b, c, alpha -> a {calcSide};
    S, a -> h {calcHeightS};
    b, gamma -> h {calcHeight};
    c, beta -> h {calcHeight};
    b, h -> gamma {calcAngle};
    c, h -> beta {calcAngle};
    a, b, alpha -> beta {calcAngleSin};
    a, c, alpha -> gamma {calcAngleSin};
    b, c, beta -> gamma {calcAngleSin};
    b, a, beta -> alpha {calcAngleSin};
    c, a, gamma -> alpha{calcAngleSin};
    c, b, gamma -> beta {calcAngleSin};
    a, alpha, beta -> b{sinCalcSide};
    a, alpha, gamma -> c{sinCalcSide};
    b, beta, gamma -> c{sinCalcSide};
    b, beta, alpha -> a{sinCalcSide};
    c, gamma, alpha -> a{sinCalcSide};
    c, gamma, beta -> b{sinCalcSide};
    S, a, b, c -> ocr {calcOcr};
    icr = S / (p / 2);
    }@*/
    double calcHeightS(double S, double a){
        return 2*S/a;
    }

    double calcHeight(double b, double gamma){
        return b*Math.cos(gamma);
    }

    double calcAngle(double a, double h){
        return Math.asin(h / b);
    }
    double calcAngleSin(double a, double b, double alpha){
        return Math.asin(Math.sin(alpha) * b/ a);
    }

    double calcAreaSin(double a, double b, double gamma){
    return a * b * Math.sin(gamma) / 2;
    }

    double heron(double a, double b, double c){
    double p = (a + b + c)/2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    double calcOcr(double S, double a, double b, double c){
          return a * b * c / (4 * S);
    }

    double calcSide(double a, double b, double gamma){
        return Math.sqrt(a*a + b*b - 2*a*b*Math.cos(gamma));
    }

    double sinCalcSide(double a, double alpha, double beta){
        return a/Math.sin(alpha)*Math.sin(beta);
    }
}
