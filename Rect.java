class Rect {
    /*@ specification Rect {
        double a, d, S, p,f;
        S = a ^ 2;
        p = 4 * a;
        d = a * 2 ^(0.5);
        d -> a {sqrt};
    }
	@*/
    double sqrt(double a)
    {
        return Math.sqrt(a);
    }
}



