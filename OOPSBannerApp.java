// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package OOPSApp;

public class OOPSBannerApp {
        public static void main(String[] args)
    {
        String[] lines = {
                (String.join(" ", "   ***   ", "   ***   ", "******   ", "   ***** ")),
                (String.join(" ", " **   ** ", " **   ** ", "**    ** ", " **      ")),
                (String.join(" ", "**     **", "**     **", "**     **", "**       ")),
                (String.join(" ", "**     **", "**     **", "**    ** ", "  *****  ")),
                (String.join(" ", "**     **", "**     **", "******   ", "      ** ")),
                (String.join(" ", " **   ** ", " **   ** ", "**       ", " **   ** ")),
                (String.join(" ", "   ***   ", "   ***   ", "**       ", "  *****  "))};
                for(String line: lines){
                    System.out.println(line);
                }

    }

}


