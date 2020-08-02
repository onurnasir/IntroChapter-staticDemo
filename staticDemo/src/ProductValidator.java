//Kullanım amacı bir ürünü kaydederken, güncellerken, ürünlerin kurallara uyup uymadını bulmak için kullanırız.
public class ProductValidator {

    static {
        System.out.println("Static Yapıcı blok çalıştı");
    }
    public  ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }
    public boolean isValid(Product product){
        if(product.price>0 &&! product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public void bisey(){

    }

    public static class BaskaBirClass{
        public static void Sil(){

        }
    }
}
// inner class demek başka bir class'ın içinde tekrar bir class oluşturma işlemidir.