public class Marker {
    private double latitude;
    private double longitude;
    private MarkerStyle style;

    public Marker(double latitude, double longitude, MarkerStyle style) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.style = style;
    }

    public void display() {
        System.out.println(String.format("Маркeр на координатах (%.2f, %.2f) со стилем %s", latitude, longitude, style));
    }
}
