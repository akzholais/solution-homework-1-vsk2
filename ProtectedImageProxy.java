public class ProtectedImageProxy extends ImageProxy {
    private boolean isLoggedIn;

    public ProtectedImageProxy(String fileName, boolean isLoggedIn) {
        super(fileName);
        this.isLoggedIn = isLoggedIn;
    }

    @Override
    public void uploadImage(String imageData) {
        if (!isLoggedIn) {
            System.out.println("Доступ запрещен: Пользователь не авторизован для загрузки изображений.");
        } else {
            System.out.println("Пользователь авторизован. Производится загрузка изображения.");
            super.uploadImage(imageData);
        }
    }
}
