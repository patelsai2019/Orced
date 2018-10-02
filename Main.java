public class Main {
    public static void main(String[] args){
        int strength = (int) (Math.random() * 20) + 10;
        int max = 40 - strength;
        int range = max - 10;
        int agility = (int) (Math.random() * range) + 10;
        int smart = 50 - strength - agility;
        int damage = 5 * smart;
        int health = 1000;
        double mod;
        for (int i = 0; i <= 10; i++) {
            mod = damage * (Math.random() * (1.5 - .5) + .5);
            health -= mod;
            if (health <= 0){
                System.out.println("Success");
                System.out.println("The intelligence level should be 19 to produce 60-70 % success rate");
                break;
            }
            if (i == 10 && !(health <= 0)){
                System.out.println("Failure");

                System.out.println("The intelligence level should be 19 to produce 60-70 % success rate");
            }
        }
    }
}
