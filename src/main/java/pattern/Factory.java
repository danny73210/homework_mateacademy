package pattern;

public class Factory {
    public AudiFactory audiFactory(String type) {
        switch (type) {
            case "Cope":
                return new Cope();
            case "Suv":
                return new Suv();

                default : return null;
        }
    }
}
