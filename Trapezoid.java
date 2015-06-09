class Trapezoid {
    /*@ specification Trapezoid {
    double a, b, c, h, S, p, alpha, beta, gamma, d, x, y;
    x = b - a - y;
    S = (a + b) / 2 * h;
    p = a + b + c + d;
    c, x -> h {calcHeight};
    d, y -> h {calcHeight};
    a, b, c, d -> h{calcHeightbySides};
    c, h -> x {calcHeight};
    d, h -> y {calcHeight};
    x, h -> c {calcSide};
    y, h -> c {calcSide};
    a, b, h -> S {calcSpace};
    a, b, c -> p {calcP};
    c, h -> alpha{calcAngle};
    c, x -> alpha{calcCosAngle};
    d, h -> beta {calcAngle};
    d, x -> beta{calcCosAngle};
    }@*/

    double calcP(double a, double b, double c){
        return a + b + 2 * c;
    }
    double calcSpace(double a, double b, double h){
        return (a + b) / 2 * h;
    }
    double calcHeight(double c, double b){
        return Math.sqrt(c*c - b*b);
    }

    double calcSide(double a, double b){
        return Math.hypot(a, b);
    }

    double calcHeightbySides(double a, double b, double c, double d){
        double helper = (a - b + c - d) * (a - b - c + d) * (a - b + c + d) * (b - a + c + d);
        helper = Math.sqrt(helper);
        return helper / (2 * (b - a));
    }

    double calcCosAngle(double c, double b){
        return Math.acos(b/c);

    }

    double calcAngle(double c, double a){
        return Math.asin(a/c);
    }
}
