public class Main {
    public static void main(String[] args) {
        UserBuilder builder = new UserBuilder();
        User John = builder.name("John")
                .lastName("Lurren")
                .middleName("David")
                .dob("06/04/1990")
                .driverLicence("B")
                .build();
        UserBuilder User = new UserBuilder();
    }
}
