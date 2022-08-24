package programmer.zaman.now.data;

public enum Level {
    // Opsi Enum
    STANDARD("Standard edition"),
    PREMIUM("Premium edition"),
    VIP("VIP edition");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
