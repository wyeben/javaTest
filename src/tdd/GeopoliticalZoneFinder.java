package tdd;

public class GeopoliticalZoneFinder {

    enum GeopoliticalZone {
        NORTH_WEST,
        NORTH_EAST,
        NORTH_CENTRAL,
        SOUTH_WEST,
        SOUTH_SOUTH,
        SOUTH_EAST,
        UNKNOWN
    }

    public static GeopoliticalZone getGeopoliticalZone(String state) {
        String stateFormatted = state.toLowerCase();
        switch (stateFormatted) {
            case "lagos",
                    "ekiti",
                    "osun",
                    "ondo",
                    "oyo",
                    "ogun":
                return GeopoliticalZone.SOUTH_WEST;
            case "kano",
                    "jigawa",
                    "kaduna",
                    "katsina",
                    "kebbi",
                    "sokoto",
                    "zamfara":
                return GeopoliticalZone.NORTH_WEST;
            case "rivers",
                    "akwa ibom",
                    "cross river",
                    "delta",
                    "edo",
                    "bayelsa":
                return GeopoliticalZone.SOUTH_SOUTH;
            case "borno",
                    "adamawa",
                    "bauchi",
                    "taraba",
                    "yobe":
                return GeopoliticalZone.NORTH_EAST;
            case "enugu",
                    "abia",
                    "anambra",
                    "ebonyi",
                    "imo":
                return GeopoliticalZone.SOUTH_EAST;
            case "benue",
                    "kogi",
                    "kwara",
                    "nasarawa",
                    "niger",
                    "plateau",
                    "federal capital territory":
                return GeopoliticalZone.NORTH_CENTRAL;
            default:
                return GeopoliticalZone.UNKNOWN;
        }
    }
}

