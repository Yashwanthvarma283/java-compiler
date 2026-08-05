class Solution {
    public double myPow(double x, int n) {
        return Math.round(myPowHelper(x, n) * 1e5) / 1e5;
    }

    private double myPowHelper(double x, int n) {
        if(n == 0) return 1;
        if(n < 0) return 1 / myPowHelper(x, -n);
        if((n & 1) == 0) return myPowHelper(x * x, n / 2);
        return x * myPowHelper(x, n - 1);
    }
}