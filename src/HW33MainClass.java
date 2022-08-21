import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;

public class HW33MainClass {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Task 2
        TV tv1 = new TV("Samsung", "SM-1", 2021, 899.99, 40.2);
        TV tv2 = new TV("LG", "LG-2", 2020, 599.99, 38);
        TV tv3 = new TV("Xiaomi", "XI-3", 2022, 499.99, 40.2);
        TV tv4 = new TV("Xiaomi", "XI-1", 2016, 199.99, 32);
        ArrayList<TV> tvArrayList = new ArrayList<>();
        tvArrayList.add(tv1);
        tvArrayList.add(tv2);
        tvArrayList.add(tv3);
        tvArrayList.add(tv4);

        // 2.1
        System.out.println("#1");
        tvArrayList.stream().forEach(x -> System.out.println(x.toString()));
        System.out.println();

        // 2.2
        System.out.println("#2");
        System.out.println("Provide diagonal size");
        double userDiagonal = Double.parseDouble(reader.readLine());
        tvArrayList.stream().filter(x -> x.getDiagonal() == userDiagonal).forEach(x -> System.out.println(x.toString()));
        System.out.println();

        // 2.3
        System.out.println("#3");
        System.out.println("Provide brand name:");
        String userBrand = reader.readLine();
        tvArrayList.stream().filter(x -> x.getBrand().equalsIgnoreCase(userBrand)).forEach(x -> System.out.println(x.toString()));
        System.out.println();

        // 2.4
        System.out.println("#4");
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(currentYear);
        tvArrayList.stream().filter(x -> x.getYearOfProduction() == currentYear).forEach(x -> System.out.println(x.toString()));
        System.out.println();

        // 2.5
        System.out.println("#5");
        System.out.println("Provide min price:");
        double userPrice = Double.parseDouble(reader.readLine());
        tvArrayList.stream().filter(x -> x.getPrice() >= userPrice).forEach(x -> System.out.println(x.toString()));
        System.out.println();

        // 2.6
        System.out.println("#6");
        System.out.println("Ascending:");
        Comparator<TV> tvPriceComparator = new Comparator<TV>() {
            @Override
            public int compare(TV o1, TV o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                }
                return -1;
            }
        };
        tvArrayList.stream().sorted(tvPriceComparator).forEach(x -> System.out.println(x.toString()));
        System.out.println("Descending:");
        tvArrayList.stream().sorted(tvPriceComparator.reversed()).forEach(x -> System.out.println(x.toString()));
        System.out.println();

        // 2.7
        System.out.println("#7");
        Comparator<TV> tvDiagonalComparator = new Comparator<TV>() {
            @Override
            public int compare(TV o1, TV o2) {
                if (o1.getDiagonal() > o2.getDiagonal()) {
                    return 1;
                } else if (o1.getDiagonal() < o2.getDiagonal()) {
                    return -1;
                }
                return -1;
            }
        };
        System.out.println("Ascending:");
        tvArrayList.stream().sorted(tvDiagonalComparator).forEach(x -> System.out.println(x.toString()));
        System.out.println("Descending:");
        tvArrayList.stream().sorted(tvDiagonalComparator.reversed()).forEach(x -> System.out.println(x.toString()));
    }
}
