package lesson2;

public class SwitchTest {
    public static void main(String[] args) {
        convertSeason(3);
        convertSeasonSwitchPrint(1);
    }

    public static String convertSeason(int seasonNumber) {
        String season;

        if (seasonNumber == 1) {
            season = "Winter";
        } else if (seasonNumber == 2) {
            season = "Spring";
        } else if (seasonNumber == 3) {
            season = "Summer";
        } else if (seasonNumber == 4) {
            season = "Fall";
        } else {
            season = "Unknown season";
        }

        System.out.println(season);

        return season;
    }

    private static String convertSeasonSwitch(int seasonNumber) {
        String season;

        switch (seasonNumber) {

            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                season = "Unknown season";
        }

        return season;
    }

    private static String convertSeasonSwitchNew(int seasonNumber) {

        return switch (seasonNumber) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Unknown season";
        };
    }

    static void convertSeasonSwitchPrint (int seasonNumber) {

        String season;


        switch (seasonNumber) {
            case 1:
                System.out.println("Winter");
            case 2:
                System.out.println("Spring");
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Fall");
            default:
                System.out.println("Unknown season");
        }

    }

}
