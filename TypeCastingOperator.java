public class TypeCastingOperator {
    public static void main(String[] args) {
        //implicit type conversion
        int d=10;
        float num=d;
        System.out.println("Double value before conversion: "+d);
        System.out.println("After explicit type conversion: "+num);
        
        //explicit
        double a=9.78;
        int n=(int)a;
        System.out.println("Double value before conversion: "+a);
        System.out.println("After explicit type conversion: "+n);
    }
}
