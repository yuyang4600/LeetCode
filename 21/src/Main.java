public class Main {
    public static void main(String[] args) {
        People pp = new People();
        People ppp = pp;

        ppp.setName("cxiang");

        System.out.println(pp.getName());
    }
}
