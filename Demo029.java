public class demo029 {
    public class FriendsArray {
        public static void main(String[] args) {
            String[][] friends = {
                {"vivek", "123 Main St, Springfield, USA"},
                {"sampath", "456 Elm St, Metropolis, USA"},
                {"shiva", "789 Oak St, Gotham, USA"},
                {"sri sai", "101 Pine St, Smallville, USA"}
            };
    
            for (String[] friend : friends) {
                System.out.println("Name: " + friend[0] + ", Address: " + friend[1]);
            }
        }
    }
}
