public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(500);
        boss.setBossDamage(80);
        boss.setBossDefenceType("Magical ");



        System.out.println(boss.getBossHealth() + " " + boss.getBossDamage() + " " + boss.getBossDefenceType());
    }
}

