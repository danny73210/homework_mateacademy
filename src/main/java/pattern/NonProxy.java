package pattern;

public class NonProxy implements Proxy {
    @Override
    public void getSite() {
        System.out.println("Reaching the site");
    }
}
