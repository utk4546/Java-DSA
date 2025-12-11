public class Lyrics extends Thread {

    public void run() {
        String str = "Dooron Dooron Main Vekhan Tenu Soniyo\n" +
            "Kahaan Tu Kahaan Main\n" +
            "\n" +
            "Ki Main Kara Ke Main Aawan Nazar Tenu\n" +
            "Laayak Tere Kivein Hovaan Tu Dass Mainu\n" +
            "\n" +
            "Kol Tere Mainu Aan De Soniyo\n" +
            "Karaan Main Kitne Jatan Oh Soniyo\n" +
            "\n" +
            "Dooron Dooron Main Vekhan Tenu Soniyo\n" +
            "Kahaan Tu Kahaan Main\n" +
            "\n" ;

        try {
            for (char ch : str.toCharArray()) {
                System.out.print(ch);
                Thread.sleep(150);  // optional delay
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Lyrics t1 = new Lyrics();  
        t1.start();
    }
}
