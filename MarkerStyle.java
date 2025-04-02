public class MarkerStyle {
    private String icon;
    private String color;
    private String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    @Override
    public String toString() {
        return "MarkerStyle(icon=" + icon + ", color=" + color + ", labelStyle=" + labelStyle + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MarkerStyle that = (MarkerStyle) obj;
        return icon.equals(that.icon) &&
                color.equals(that.color) &&
                labelStyle.equals(that.labelStyle);
    }

    @Override
    public int hashCode() {
        int result = icon.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + labelStyle.hashCode();
        return result;
    }
}
