public class Main {
    public static void main(String[]args){
        int[] sales = new int[] {4,2,100,400};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.println(max);

    }
}
