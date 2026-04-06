package lab5.advanced;

public class NewIntCalculator extends ACalculator {
    public NewIntCalculator(int val) {
        this.state = val;
    }

    @Override
    protected void init() {
        this.state = 0;
    }
    public NewIntCalculator add(int val) {
        this.state = (Integer) this.state + val;
        return this;
    }
    public NewIntCalculator subtract(int val) {
        this.state = (Integer) this.state - val;
        return this;
    }
    public NewIntCalculator multiply(int val) {
        this.state = (Integer) this.state * val;
        return this;
    }
}