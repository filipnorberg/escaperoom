public class Level1 {

    public static void main(String[] args) {
        int a=0,b=1,c,d=0,i,count=32;

        for(i=2;i<count;++i) {
            c=a+b;
            a=b;
            b=c;
            if (c % 2 == 0) {
              d += c;
        }}
        System.out.println("All the numbers together equal " + d);
    }
}
