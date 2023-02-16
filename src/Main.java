public class Main {
    public static void main(String[]args){
        long[] sales = new long[] {4,2,100,400};
        SalesManager salesManager = new SalesManager(sales);
        long max = salesManager.max();
        System.out.println(max);

    }
}
