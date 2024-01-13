import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
                cake brownieCake = new cake();
                brownieCake.setName("Chocolate Brownie");
                brownieCake.setPrice(250);
                cake mapleCake = new cake();
                mapleCake.setName("Chocolate Maple");
                mapleCake.setPrice(300);
                List<cake> cakeList = new ArrayList<>();
                cakeList.add(brownieCake);
                cakeList.add(mapleCake);
                pastry blackForestPastry = new pastry();
                blackForestPastry.setName("Black Forest");
                blackForestPastry.setPrice(35);
                pastry chocoTrufflePastry = new pastry();
                chocoTrufflePastry.setName("Choco Truffle");
                chocoTrufflePastry.setPrice(40);
                List<pastry> pastryList = new ArrayList<>();
                pastryList.add(blackForestPastry);
                pastryList.add(chocoTrufflePastry);
                System.out.println("         Today's Special Menu");
                System.out.println("-----------------------------------------");
                System.out.println();
                System.out.println("  Special Cakes");
                System.out.println("  -------------------------------");
                for (cake cake: cakeList) {
                    cake.display();
                }
                System.out.println();
                System.out.println("  Special Pastries");
                System.out.println("  -------------------------------");
                for (pastry pastry: pastryList) {
                    pastry.display();
                }
            }
        }

