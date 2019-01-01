package pattern;

public class Main {
    public static void main(String[] args) {
        AudiProducer copeProducer = new CopeProducer();
        AudiProducer suvProducer = new SuvProducer();

        System.out.println(copeProducer.makeAudiModel().getAudiModel());
        System.out.println(suvProducer.makeAudiModel().getAudiModel());

        LoggerSinglton.getLoggerSinglton().addLogInfo("Singleton pattern was added");
        SportCarBuilder sportCarBuilder = new SportCarBuilder.Builder("Audi").build();
        System.out.println(sportCarBuilder.toString());
        SportCarBuilder sportCarBuilder1 = new SportCarBuilder
                .Builder("Pagani")
                .setColor("White")
                .setMaxSpeed(400)
                .build();
        System.out.println(sportCarBuilder1.toString());
        LoggerSinglton.getLoggerSinglton().addLogInfo("Builder pattern was added");
        LoggerSinglton.getLoggerSinglton().showLogFile();

        Proxy proxy = new ProxyStuff();
        proxy.getSite();


    }
}
