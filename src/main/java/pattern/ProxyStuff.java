package pattern;

public class ProxyStuff implements Proxy {
    Proxy proxy = new NonProxy();

    @Override
    public void getSite() {
        System.out.println("Proxy is ON \n Reaching the site");
    }
}
