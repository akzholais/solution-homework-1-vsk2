import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация Flyweight Pattern ===");
        List<Marker> markers = new ArrayList<>();
        String[] icons = {"hospital", "restaurant", "gas_station"};
        String[] colors = {"red", "blue", "green"};
        String[] labelStyles = {"bold", "italic"};

        int numMarkers = 1000;
        Random random = new Random();
        for (int i = 0; i < numMarkers; i++) {
            String icon = icons[random.nextInt(icons.length)];
            String color = colors[random.nextInt(colors.length)];
            String labelStyle = labelStyles[random.nextInt(labelStyles.length)];
            MarkerStyle style = MarkerStyleFactory.getStyle(icon, color, labelStyle);
            double latitude = -90 + 180 * random.nextDouble();
            double longitude = -180 + 360 * random.nextDouble();
            markers.add(new Marker(latitude, longitude, style));
        }

        System.out.println("Создано маркеров: " + markers.size());
        System.out.println("Уникальных стилей маркеров: " + MarkerStyleFactory.getTotalStyles());
    }
}
