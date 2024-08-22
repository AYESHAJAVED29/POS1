
package Entities;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Store {
    private static ArrayList<Product>products;
    
    static{
        products= new ArrayList();
    }
    
    public static void dummyvalues(){
        products.add(new Product(1,"Lays","snack",150,70,150));
        products.add(new Product(2,"kitkat","snack",100,200,500));
        products.add(new Product(3,"pepsi","snack",170,160,250));
        products.add(new Product(4,"nimko","snack",120,50,70));
        products.add(new Product(5,"cupcake","snack",90,45,60));
        products.add(new Product(6,"apple","fruit",80,150,200));
        products.add(new Product(7,"grapes","fruit",8,180,350));
        products.add(new Product(8,"banana","fruit",20,110,200));
        products.add(new Product(9,"kurkurey","snack",180,120,170));
        products.add(new Product(10,"coca cola","snack",118,170,260));
        products.add(new Product(11,"bunty","snack",50,80,130));
    
    }
    //add Product
    public static void addProduct(Product obj){
        if(obj!=null){
        products.add(obj);
       // JOptionPane.showMessageDialog(null,"Product add successfully");
        }
        else{
            JOptionPane.showMessageDialog(null,"Product is not added "); 
        }
        
    }

//get product on table
    public static ArrayList<Product>getProduct(){
        return products;
    }
//search product
   public static Product searchByName(String name ){
       for(int i=0;i<products.size();i++){
           if (products.get(i).getName().equalsIgnoreCase(name)){
               return products.get(i);
           }
       }
    JOptionPane.showMessageDialog(null,"product not found");
    return null;
}

   //delete product
   public static boolean deleteProduct(Product p) {
        for (Product product : products) {
            if (product.getProductId() == p.getProductId()) {
                products.remove(product);
                return true;
            }
        }
        return false; 
    }
   
   //update product
   public static void updateProduct(int id,Product obj){
     for(int i=0;i<products.size();i++){
         if(products.get(i).getProductId()==id){
             products.get(i).setName(obj.getName());
             products.get(i).setCategory(obj.getCategory());
             products.get(i).setStock(obj.getStock());
             products.get(i).setWhole_sale_P(obj.getWhole_sale_P());
             products.get(i).setRetail_P(obj.getRetail_P());
            JOptionPane.showMessageDialog(null,"update successfully");  
         }
     }  
   }
   }
