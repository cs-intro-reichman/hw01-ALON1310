public class LinearEq {
    public static void main(String[] args) {
    double a = Integer.parseDouble(args[0]) ;
    double b = Integer.parseDouble(args[1]) ;
    double c = Integer.parseDouble(args[2]) ;
    double x = ((c-b)/a); 

  System.out.println(a + "* x " + "+ " + b + " = " + c );


    System.out.println("x = " + x) ;

    }
}

