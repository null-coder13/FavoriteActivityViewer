package GUI;

import GUIControls.Window;
import GUIControls.ImageDisplay;
import Listeners.NameSelectorListener;
import Models.ActivityContent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FavoriteActivityViewer extends JPanel implements NameSelectorListener {
    private ContentDisplayer contentDisplayer;

    public FavoriteActivityViewer() {
        this.setLayout(new BorderLayout(0, 5));
        this.setBorder(new EmptyBorder(5, 3, 5, 3));
        Window.setTitle("Favorite Activity Viewer");
        Window.setSize(1000, 800);
        JLabel instructionsLabel = new JLabel("Please select a name to learn about their favorite activity.");
        this.add(instructionsLabel, BorderLayout.NORTH);

        contentDisplayer = new ContentDisplayer();
        this.add(contentDisplayer, BorderLayout.CENTER);

        NameSelector nameSelector = new NameSelector(this);
        this.add(nameSelector, BorderLayout.WEST);
    }

    @Override
    public void onNameSelected(ActivityContent activityContent) {
        contentDisplayer.setContent(activityContent);
    }
}
