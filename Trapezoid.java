class Trapezoid {
    /*@ specification Trapezoid {
    double a, b, c, h, S, p, alpha, beta, gamma, d, x;
    a = b - 2 * x;
    b = a + 2 * x;
    x = (b - a) /2;
    S = (a + b) / 2 * h;
    p = a + b + 2 * c;
    c, x -> h {calcHeight};
    x, h -> c {calcSide};
    a, b, h -> S {calcSpace};
    a, b, c -> p {calcP};
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
}
