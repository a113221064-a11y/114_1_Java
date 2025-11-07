public class RPG {
    public static void main(String[]args) {
        SwordsMan swordsMan_white = new SwordsMan("白衣剑士", 100, 15);
        SwordsMan swordsMan_black = new SwordsMan("黑衣剑士", 100, 15);

        Magician magician_white = new Magician("白衣法师", 80, 20);
        Magician magician_black = new Magician("黑衣法师", 80, 20);

        System.out.println("FIGHT!");
        swordsMan_white.attack(swordsMan_black);
        magician_black.attack(magician_white);
        magician_white.healpower(swordsMan_white);

    }
}
