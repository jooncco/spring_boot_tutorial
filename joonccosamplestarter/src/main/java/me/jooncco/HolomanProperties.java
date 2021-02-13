package me.jooncco;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("holoman")     // holoman이라는 prefix를 사용.
public class HolomanProperties {

    private String name;
    private int howLong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }

    @Override
    public String toString() {
        return "HolomanProperties{" +
                "name='" + name + '\'' +
                ", howLong=" + howLong +
                '}';
    }
}
