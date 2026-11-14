class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int refuels = Math.min(additionalTank, (mainTank - 1) / 4);
        return (mainTank + refuels) * 10;
    }
}