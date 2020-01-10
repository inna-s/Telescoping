public class UserBuilder {

        private String name;
        private String lastName;
        private String middleName;
        private String dob;
        private String driverLicence;

        public UserBuilder() {
        }

        public UserBuilder name (String val) {
            name = val;
            return this;
        }

        public UserBuilder lastName(String val) {
            lastName = val;
            return this;
        }

        public UserBuilder middleName(String val) {
           middleName = val;
            return this;
        }

        public UserBuilder dob(String val) {
            dob = val;
            return this;
        }
        public UserBuilder driverLicence (String val) {
            driverLicence = val;
            return this;
        }

        public User build() {
            return new User(name, lastName, middleName, dob, driverLicence);
        }
    }

