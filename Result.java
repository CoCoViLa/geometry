class Result {
    /*@ specification Result {
            double result, input1, input2;
            char operation;
            input1, input2, operation -> result {calcRes};
    }
	@*/
    double calcRes(double input1, double input2, char operation){
        switch (operation){
            case '+':
                return input1 + input2;
            case '-':
                return input1 - input2;
            case '*':
                return input1 * input2;
            case '/':
                return input1 + input2;
            /*case "^":
                return Math.Pow(input1, input2);*/
        }
        return 0;
    }
}
