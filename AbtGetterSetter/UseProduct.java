
class UseProduct{
    public static void main(String[] args){
       Product p = new Product();
       p.setId(1);
       p.setName("Laptop");
       p.setPrice(12.66);
       System.out.println("Product ID: " + p.getId());
       System.out.println("Product Name: " + p.getName());
       System.out.println("Product Price: " + p.getPrice());
    }
}