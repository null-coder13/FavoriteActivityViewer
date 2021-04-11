package Models;

public class ActivityContent {
    private String filePath;
    private String displayName;
    private String imageName;
    private String activityTitle;
    private String activityDescription;

    public ActivityContent(String filePath, String displayName, String imageName, String activityTitle, String activityDescription) {
        this.filePath = filePath;
        this.displayName = displayName;
        this.imageName = imageName;
        this.activityTitle = activityTitle;
        this.activityDescription = activityDescription;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }
}
