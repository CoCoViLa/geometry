class Circle {
    /*@ specification Circle {
    double r, d, S, p;
    const double pi = Math.PI;
    r = d / 2;
    S -> r {rFromArea};
    p -> r {rFromPerimeter};
    r -> p {pFromr};
    r -> S {SFromr};
    }
    @*/
    double rFromArea(double area){
        double out =  Math.sqrt(area/Math.PI);
        return Math.round(out*100) / (double)100;
    }

    double rFromPerimeter(double p){
        double out = p / 2 / Math.PI;
        return Math.round(out*100) / (double)100;
    }

    double pFromr(double r){
        double out = Math.PI * 2 * r;
        return Math.round(out*100) / (double)100;
    }

    double SFromr(double r){
        double out = Math.PI * r * r;
        return Math.round(out*100) / (double)100;
    }
}
