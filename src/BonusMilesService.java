public class BonusMilesService {

    public int calculate(int price) {
        int rub = 200;
        int mil = price / rub;

        return mil;
    }
}
