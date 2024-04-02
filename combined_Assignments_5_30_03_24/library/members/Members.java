package library.members;

public class Members {
    private int userId;
    private int libraryId;
    private String name;
    private int userType;
    private String userAddress;
    private String email;
    private String mobile;
    private int userActiveStatus;

    public Members(int userId, int libraryId, String name, int userType, String userAddress, String email,
            String mobile,
            int userActiveStatus) {
        this.userId = userId;
        this.libraryId = libraryId;
        this.name = name;
        this.userType = userType;
        this.userAddress = userAddress;
        this.email = email;
        this.mobile = mobile;
        this.userActiveStatus = userActiveStatus;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getUserActiveStatus() {
        return userActiveStatus;
    }

    public void setUserActiveStatus(int userActiveStatus) {
        this.userActiveStatus = userActiveStatus;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }
}
