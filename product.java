package Pentagon.java_programing;

class product1 {
    void display() {
        String name = "Name";
        double price = 1.11;
    }
}

    class ele_prod extends product {
        String brand = "qwefgb";
        int warranty = 1234;
        void display() {
            String name = "ele";
            double price = 11.11;
            System.out.println("Name of the company: "+name+" \n"+price+" \n"+brand+" \n"+warranty);
        }
    }

    class clothing extends product {
        String size = "qwefg";
        String material = "qwe";
        void display() {
            String name = "wsdv";
            double price = 22.222;
            System.out.println(name+" \n"+price+" \n"+size+" \n"+material);
        }
    }

    public class product {
        public static void main(String[] args) {
            product p = new product();
            ele_prod e = new ele_prod();
            clothing c = new clothing();
            e.display();
            System.out.println();
            c.display();
        }
    }
