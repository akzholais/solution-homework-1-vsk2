public class RealImage implements Image {
    private String fileName;
    private boolean highResImageLoaded;
    private String imageData;

    public RealImage(String fileName) {
        this.fileName = fileName;
        this.highResImageLoaded = false;
    }

    private void loadHighRes() {
        if (!highResImageLoaded) {
            System.out.println("Загрузка изображения высокого разрешения из " + fileName + "...");
            imageData = "HighResData(" + fileName + ")";
            highResImageLoaded = true;
        }
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Отображается миниатюра изображения " + fileName);
    }

    @Override
    public void displayFullImage() {
        loadHighRes();
        System.out.println("Отображается изображение высокого разрешения: " + imageData);
    }

    @Override
    public void uploadImage(String imageData) {
        System.out.println("Загрузка нового изображения...");
        this.imageData = imageData;
        highResImageLoaded = true;
    }
}
