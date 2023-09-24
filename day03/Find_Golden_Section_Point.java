public class Find_Golden_Section_Point {
    public static void main(String[] args) {
        double Golden_Section_Point = 0.618;
        double nearest_number = 100;
        double nearest_gap = 100;
        int nearest_numerator = 100;
        int nearest_denominator = 100;

        for (int numerator = 1; numerator <= 20; numerator++) {
            for (int denominator = 1; denominator <= 20; denominator++) {
                double fraction = (double) numerator / denominator;
                double gap = (fraction - Golden_Section_Point > 0) ? (fraction - Golden_Section_Point)
                        : (Golden_Section_Point - fraction);
                if (gap < nearest_gap) {
                    nearest_number = fraction;
                    nearest_gap = gap;
                    nearest_numerator = numerator;
                    nearest_denominator = denominator;
                }
            }
        }

        System.out.println("最接近的两个数为" + nearest_numerator + "/" + nearest_denominator + "=" + nearest_number);
    }

}
