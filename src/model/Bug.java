package model;

public class Bug implements ConsoleNotification {

    private String bugDescription;
    private int bugPriority;
    private boolean bugStatus;
    private BugReporter bugReporter;

    public Bug(String bugDescription, BugReporter bugReporter, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Description is to short.");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public void setGmail(String email) {

        if (!email.contains("@") || email.length() < 4) {
            System.out.println("incorrect format mail");
        } else {
            this.bugReporter = bugReporter;
        }

        if (!email.contains("KK")) {
            System.out.println("Brakuje litery 'KK' ");
        } else {
            this.bugReporter = bugReporter;
        }
    }

    public void setBugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default: {
                System.out.println("Inccorect bug priority range");
            }
        }
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        this.bugStatus = bugStatus;
        notifyStatusChange();
    }

    public void showAllBugInfo() {
        System.out.println("model.Bug description: " + bugDescription + " email: " + bugReporter.getEmail() + " bug priority " + bugPriority
                + " bug status: " + bugStatus);
    }

    public void showEmail() {
        System.out.println("Email: " + bugReporter.getEmail());
    }

    public void showBusStatus() {
        System.out.println("model.Bug status: " + bugStatus);
    }

    public void showBugDescription() {
        System.out.println("model.Bug description: " + bugDescription);
    }

    public int getBugPriority() {
        return bugPriority;
    }


    @Override
    public void notifyStatusChange() {
        System.out.println("!!! Bug status has changed !!!");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugPriority=" + bugPriority +
                ", bugStatus=" + bugStatus +
                ", bugReporter=" + bugReporter +
                '}';
    }
}
