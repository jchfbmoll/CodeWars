import java.util.ArrayList;

//kata 4kyu The Greatest Warrior https://www.codewars.com/kata/5941c545f5c394fef900000c/java


class Warrior {
    // Your code here!
    private static int level;
    private static int experience;
    private static String rank;
    private static ArrayList<String> achievements;
    private static String[] ranks={"Pushover", "Novice", "Fighter", "Warrior", "Veteran", "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest"};
  
    public Warrior(){
      level = 1;
      experience = 100;
      rank = "Pushover";
      achievements = new ArrayList<String>();
    }
    public static int level() {
      return level;
    }
    public static int experience() {
      return experience;
    }
    public static String rank() {
      return rank;
    }
    public static String training(String achive, int xp, int minLevel){
      if (minLevel > level){
        return "Not strong enough";
      }
      achievements.add(achive);
      addExperience(xp);
      return achive;
    }
    public static ArrayList<String> achievements(){
      return achievements;
    }
    public static String battle(int enemyLevel){
      
      if (enemyLevel < 1 || enemyLevel > 100){ 
        return "Invalid level";
      } else if (enemyLevel == level) {
        addExperience(10);
        return "A good fight";
      } else if (enemyLevel + 1 == level){
        addExperience(5);
        return "A good fight";
      } else if (enemyLevel + 2 <= level){
        return "Easy fight";
      } else if (enemyLevel - 5 >= level && rankDiff(enemyLevel)){
        return "You've been defeated";
      }
      
      addExperience(20 * (enemyLevel - level) * (enemyLevel - level));
      return "An intense fight";

      
      
    }
    private static void addExperience(int xp){
      experience +=xp;
      if (experience>10000){experience = 10000;}
      levelUp();
    }
    private static void levelUp(){
      int prevLevel = level;
      level = (int) (experience/100);
      if (level != prevLevel){
        rankUp();
      }
    }
    private static void rankUp(){
      rank = ranks[level/10] ;
    }
    private static boolean rankDiff(int enemyLevel){
      if (enemyLevel / 10 > level /10) return true;
      return false;
    }
}

        Best Practices0
        Clever0
    0
    Fork
    Compare with your solution
    Link

    © 2024 CodewarsAboutAPIBlogPrivacyTermsCode of ConductContact

