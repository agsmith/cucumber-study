package cuketest;


public class Character {
    public String game;
    public String name;
    public Boolean hasMustache;
    public String hatColor;

    public Character(String game, String name) {
        this.game = game;
        this.name = name;
    }

    public void setHatColor(String hatColor) {
        this.hatColor = hatColor;
    }

    public String getHatColor() {
        return this.hatColor;
    }

    public void setHasMustache(Boolean hm) {
        this.hasMustache = hm;
    }

    public Boolean getHasMustache() {
        return hasMustache;
    }
}
