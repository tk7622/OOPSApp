
public class OOPSBannerApp {
        public static String[] getOPattern() {
            return new String[] {
                "    ***   ", 
                 " **   ** ", 
                 "**     **", 
                 "**     **", 
                 "**     **", 
                 " **   ** ", 
                 "   ***   "
            };
        }
            public static String[] getOPattern1() {
            return new String[] {
                "   ***   ", 
                 " **   ** ", 
                 "**     **", 
                 "**     **", 
                 "**     **", 
                 " **   ** ", 
                 "   ***   "
            };
        }
            public static String[] getPPattern() {
            return new String[] {
                "*********", 
                "**     **", 
                "**     **", 
                "**     **", 
                "*********", 
                "**       ", 
                "**       ", 
                "**       ", };
        }
        public static String[] getSPattern() {
            return new String[] {
                " ******  ",
                "**    ** ",
                "**       ",
                "  *****  ",
                "      ** ",
                " **   ** ", 
                "  *****  "};
        }
        public static void main(String[] args) {
            String[] oPattern = getOPattern();
            String[] oPattern1 = getOPattern();
            String[] pPattern = getPPattern();
            String[] sPattern = getSPattern();

            for (String line : oPattern) {
                System.out.println(line);
            }
            System.out.println();
            for (String line : oPattern1) {
                System.out.println(line);
            }
            System.out.println();
            for (String line : pPattern) {
                System.out.println(line);
            }
            System.out.println();
            for (String line : sPattern) {
                System.out.println(line);
            }
        }
}


