public class MultiplyMultiple {
    public int multiplyFour(int one, int two, int three, int four) {
        Multiply multiply = new Multiply();
        return multiply.multiply(multiply.multiply(one, two), multiply.multiply(three, four));
    }

    public int multiplyFour(String one, String two, String three, String four) {
        return multiplyFour(Integer.parseInt(one), Integer.parseInt(two), Integer.parseInt(three), Integer.parseInt(four));
    }
}
