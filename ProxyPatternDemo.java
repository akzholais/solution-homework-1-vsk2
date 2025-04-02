public class ProxyPatternDemo {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация Proxy Pattern ===");
        Image imageProxy = new ImageProxy("property1.jpg");
        imageProxy.displayThumbnail();
        imageProxy.displayFullImage();
        System.out.println("\n=== Демонстрация Protected Proxy ===");
        Image unauthorizedProxy = new ProtectedImageProxy("property2.jpg", false);
        unauthorizedProxy.uploadImage("NewImageData");

        Image authorizedProxy = new ProtectedImageProxy("property2.jpg", true);
        authorizedProxy.uploadImage("NewImageData");
    }
}
