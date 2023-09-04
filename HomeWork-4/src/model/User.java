package model;

import java.time.LocalDate;
    public class User {
        private String username;
        private String password;
        private LocalDate birthDate;

        public User(String username, String password, LocalDate birthDate) {
            this.username = username;
            this.password = password;
            this.birthDate = birthDate;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", birthDate=" + birthDate +
                    '}';
        }

}
