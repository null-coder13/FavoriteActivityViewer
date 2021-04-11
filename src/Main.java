import GUI.FavoriteActivityViewer;
import GUIControls.Window;

public class Main {
    public static void main(String[] args) {
        new Window();
        Window.setContentPane(new FavoriteActivityViewer());
    }
}
