package general;

public class EnumExample {
    public static void main(String[] args) {
        System.out.println(UserStatus.ACTIVE);
    }
}

enum UserStatus {
    PENDING,
    ACTIVE,
    INACTIVE,
    DELETED;
}
