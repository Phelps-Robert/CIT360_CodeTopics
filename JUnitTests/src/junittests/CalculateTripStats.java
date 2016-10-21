
package junittests;

public class CalculateTripStats {

    public static int mpg(int milesDriven, int gallonsUsed) {
        if (gallonsUsed == 0) {
            return 0;
        }
        return milesDriven / gallonsUsed;
    }

    public static int mph(int milesDriven, int hoursDriven) {
        return milesDriven / hoursDriven;
    }
}
