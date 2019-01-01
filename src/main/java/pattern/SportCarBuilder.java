package pattern;

public class SportCarBuilder {
    private String name;
    private String color;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private SportCarBuilder(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCarBuilder{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    static class Builder{
        private String name;
        private String color = "Black";
        private int maxSpeed = 200;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCarBuilder build() {
            return new SportCarBuilder(this);
        }
    }
}
