public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern; 

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
                "    ***   ", 
                 " **   ** ", 
                 "**     **", 
                 "**     **", 
                 "**     **", 
                 " **   ** ", 
                 "   ***   "
        });
        maps[1] = new CharacterPatternMap('O', new String[]{
                "    ***   ", 
                 " **   ** ", 
                 "**     **", 
                 "**     **", 
                 "**     **", 
                 " **   ** ", 
                 "   ***   "
        });
        maps[2] = new CharacterPatternMap('P', new String[]{
                "********", 
                "**     **", 
                "**     **", 
                "**     **", 
                "*********", 
                "**       ", 
                "**       ", 
                "**       ", 
        });
         maps[3] = new CharacterPatternMap('S', new String[]{
                "  ****** ", 
                " **       ", 
                "**        ", 
                "  *****   ", 
                "       ** ", 
                " **    ** ", 
                "  ******* "
        });

        return maps;
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        ch = Character.toUpperCase(ch); 
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }
        return null;
    }

    // Print message as banner
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int line = 0; line < 7; line++) {

            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                System.out.print(pattern[line] + "  "); // space between letters
            }

            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";
        printMessage(message, charMaps);
    }
}

