package Lesson21Enum;


public enum Regions {
    BATKEN("Туштукто жайгашкан", 45.6),
    OSH("Туштукто жайгашкан", 51.4),
    JALAL_ABAD("Туштук батышта жайгашкан", 55.6),
    NARYN("Чыгыш болукто жайгашкан", 67.8),
    YSYK_KOL("Тундук чыгышта жайгашкан", 60.3),
    CHUY("Тундук болугун ээлеген", 57.8),
    TALAS("Тундук батышта жайгашкан", 67.5);

    private String characterization;
    private double area;

    Regions(String characterization, double area) {
        this.characterization = characterization;
        this.area = area;
    }

    public String getCharacterization() {
        return characterization;
    }

    public void setCharacterization(String characterization) {
        this.characterization = characterization;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Region: " + this.name()+
                "characterization - " + characterization +
                ", area - " + area;
    }
}
