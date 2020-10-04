public class LeapYear {
        private static boolean Leap (int year)
        {
            return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        }
        public static void main(String[] args) {
            int year = 2020;

            System.out.println(year);
            if (Leap(year)) {
                System.out.println("Rok jest przestępny");
            } else {
                System.out.println("Rok nie jest przestępny");
            }
        }

}
