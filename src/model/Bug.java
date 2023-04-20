package model;

public class Bug {

    private String bugDescription;
    private String email;
    private int bugPriority;
    private boolean bugStatus;

    public Bug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setGmail(String email) {

        if (!email.contains("@") || email.length() < 4) {
            System.out.println("incorrect format mail");
        } else {
            this.email = email;
        }

        if (!email.contains("KK")) {
            System.out.println("Brakuje litery 'KK' ");
        } else {
            this.email = email;
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

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        this.bugStatus = bugStatus;
    }

    public void showAllBugInfo() {
        System.out.println("model.Bug description: " + bugDescription + " email: " + email + " bug priority " + bugPriority
                + " bug status: " + bugStatus);
    }

    public void showEmail() {
        System.out.println("Email: " + email);
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
}
