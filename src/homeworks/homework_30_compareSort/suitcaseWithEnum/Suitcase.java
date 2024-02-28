package homeworks.homework_30_compareSort.suitcaseWithEnum;

public class Suitcase {

    enum Size {M, L, XL}
    enum Material {PLASTIC, FABRIC}

    private Material material;
    private Size size;
    private String color;

    public Suitcase(Material material, Size size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Suitcase{material=" + material + ", size=" + size + ", color='" + color + "'}";
    }

}
