interface hands{
    String getCatagory();
    String getManufaturer();
    int sales();
}
class hardware implements hands{
    private String c , m ;
    private int s;
    public hardware(String catagory , String manu , int sale){
        c = catagory;
        m = manu;
        s = sale;
    }
    public String getCatagory(){
        return c;
    }
    public String getManufaturer(){
        return m;
    }
    public int sales(){
        return s;
    }
}
class software implements hands{
    private String c , os;
    private int s;
    public software(String catagory , String oprsys , int sale){
        c = catagory;
        os = oprsys;
        s = sale;
    }
    public String getCatagory(){
        return c;
    }
    public String getManufaturer(){
        return "";
    }
    public int sales(){
        return s;
    }
}
class q1{
    public static void main(String args[]){
        hardware h1 = new hardware("Laptop" , "Dell" , 230000);
        hardware h2 = new hardware("Printer" , "HP" , 230000);
        software s1 = new software("Game" , "Windows 11" , 345678);
        software s2 = new software("Browser" , "Ubuntu" , 345678);
        int TotalHardwareSales = h1.sales() + h2.sales();
        int TotalSoftwareSales = s1.sales() + s2.sales();
        System.out.println("Total hardware sales: $" + TotalHardwareSales);
        System.out.println("Total software sales: $" + TotalSoftwareSales);
    }
}
