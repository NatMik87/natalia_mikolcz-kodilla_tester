import java.util.Arrays;

public class User {
    String name;
    int age;
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static double getAvarageAge(User[] users) {
        double ageSum = 0;
        for (int i = 0; i<=users.length -1; i++){
            System.out.println(i);
            ageSum += users[i].age;
        }
        return ageSum / users.length;

    }

    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        Double avarageAge = User.getAvarageAge(users);

        for (int i = 0; i<=users.length -1; i++){
            if (
                    users[i].age < avarageAge
            ){
                System.out.println(users[i].name);
            }
        }
        System.out.println(Arrays.toString(users));
    }
    }

