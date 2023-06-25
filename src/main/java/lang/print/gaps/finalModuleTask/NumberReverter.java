package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int a=number/100;
        int c = number%10;
        int b = (number-a*100)/10;
        System.out.println(a*100+b*10+c);
    }
}
