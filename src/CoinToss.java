import java.util.Random;
class CoinToss {
    public String chanceFunc() {
        Random r = new Random();
        int chance = r.nextInt(2);
        if (chance == 1) {
            return"tails";
        } else {
            return"heads";
        }
    }
}
class Demo {
    public static void main(String[] args) {
        CoinToss t = new CoinToss();
        int heads = 0;
        int tails = 0;
        int chances = 10;
        for (int i = 1; i<= chances; i++) {
            if (t.chanceFunc().equals("tails")) {
                tails++;
            } else {
                heads++;
            }
        }
        System.out.println("Chances = " + chances);
        System.out.println("Heads: " + heads*10 +"%");
        System.out.println("Tails: " + tails*10 + "%");
    }
}