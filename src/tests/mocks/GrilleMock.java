package tests.mocks;

public class GrilleMock {
    public int[] getNombresMisesLengthFive() {
        return new int[] {0, 1, 2, 3, 4};
    }

    public int[] getNombresMisesMultipleOccured() {
        return new int[] {3, 1, 1, 2};
    }

    public int[] getNombresMisesInvalidGridOuterBound() {
        return new int[] {21, 1, 6, 4};
    }
}
