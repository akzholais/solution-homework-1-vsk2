public class ImageProxy implements Image {
    protected String fileName;
    protected RealImage realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Отображается миниатюра изображения " + fileName);
    }

    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.displayFullImage();
    }

    @Override
    public void uploadImage(String imageData) {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.uploadImage(imageData);
    }
}
