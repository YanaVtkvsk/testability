public class BonusMilesService {

    public int calculate(int price) {
        int rub = 20;
        int mil = price / rub;

        return mil;
    }
}
