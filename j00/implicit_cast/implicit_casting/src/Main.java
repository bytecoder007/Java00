//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Implicit Casting(Otomatik Tür Dönüşümü)
//        int num = 10;
//        long a = num;
        //Explicit Casting(Açık Tür Dönüşümü
        double num = 10.5;
        int inNum = (int) num;
        //BOXING Temel veri tipinin bir nesneye dönüştürülmesi.
        int num6 = 6;
        Integer boxednum4 = Integer.valueOf(num6);

        //UNBOXING NEsnenin temel veri tipine dönüştürülmesi.
        Integer boxedNum = 10;
        int num5 = boxedNum.intValue();
        }
    }
