package Start;

 class Test1 {
    enum FreshSize{SMALL,MEDIUM,LARGE}
    FreshSize  size;



    public class FreshJuiceTest {
        public static void main(String[] args) {
            Test1 juice = new Test1();
            juice.size = FreshSize.MEDIUM;
        }
    }
}
