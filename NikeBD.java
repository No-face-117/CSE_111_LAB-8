// CSE-111 LAB - 8 TASK - 2     []
// T-2 NikeBD class

public class NikeBD{
    public String location;
    public static int branches_opened = 0;

    public static String [] products_nk_bd = {"Jordan", "Cortez", "Kobe"};
    
    public static int [] product_stock_global = new int[3];
    public static int [] product_sold_global = new int[3];

    public int [] product_stock_local = new int[3];
    public int [] product_sold_local = new int[3];

    public NikeBD(String lk_0){
        location = lk_0;
        branches_opened ++;
    }

    public void restockProducts(String pk_0, int aum_0){
        for (int i = 0; i < products_nk_bd.length; i++) {
            if (products_nk_bd[i].equals(pk_0)) {
                product_stock_global[i] += aum_0;
                product_stock_local[i] += aum_0;

                break;
            }
        }
    }

    public void restockProducts(String [] pk_01, int[] aum_01){
        for (int j = 0; j < pk_01.length; j++) {
            this.restockProducts(pk_01[j], aum_01[j]);
        }
    }

    public void productSold(String pk_02, int aum_02){
        for (int k = 0; k < products_nk_bd.length; k++) {
            if (products_nk_bd[k].equals(pk_02)) {
                product_sold_global[k] += aum_02;
                product_sold_local[k] += aum_02;

                product_stock_global[k] -= aum_02;
                product_stock_local[k] -= aum_02;

                break;
            }
        }
    }

    public void productSold(String pk_03, int aum_03, String pk_04, int aum_04){
        this.productSold(pk_03, aum_03);
        this.productSold(pk_04, aum_04);
    }

    public static void status(){
        System.out.println("Nike Bangladesh Status : ");
        System.out.println("Branches Opened: " + branches_opened);
        System.out.println("Currently Stocked: Jordan: " + product_stock_global[0] + ", Cortez: " + product_stock_global[1] + ", Kobe: " + product_stock_global[2]);

    }

    public void details(){
        System.out.println("Nike " + location + " outlet: ");
        System.out.println("Products Currently Stocked: Jordan: " + product_stock_local[0] + ", Cortez: " + product_stock_local[1] + ", Kobe: " + product_stock_local[2]);
        System.out.println("Sold: Jordan: " + product_sold_local[0] + ", Cortez: " + product_sold_local[1] + ", Kobe: " + product_sold_local[2]);
    }


}