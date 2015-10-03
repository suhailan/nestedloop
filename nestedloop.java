


import java.util.logging.Level;
import java.util.logging.Logger;

public class nestedloop {
    public static void main(String[] args) {
        //NESTED LOOP IN SOLAT ZOHOR, ASAR DAN ISYAK
        //BY: SUHAILAN SAFEI (3 SEPT 2015)
        rukun("Berdiri lurus dan menghadap ke arah kiblat", "Fi'li");
        rukun("Niat", "Qalbi");
        rukun("TakbiratulIhram", "Qauli", "Allahu Akbar");
       
        for (int rakaat = 1; rakaat <= 4; rakaat++){

            print("=============================");
            print("Berdiri Rakaat " + rakaat);
            print("=============================");
            
            sleep(500);
            
            if (rakaat == 1) sunat("Doa Iftitah", "Hai'ah", doaIftitah());
            
            rukun("Membaca al-Fatihah", "Qauli", " - Surah al-Fatihah -");

            rukun("Ruku\'", "Fi'li");
            for (int tasbih=1; tasbih <= 3; tasbih++){
                baca("Subhaana rabbiyal azhimi wabihamdih");
            }
            
            rukun("I\'tidal", "Fi'li");
            for (int sujud=1;sujud <=2; sujud++){   
                rukun("Sujud", "Fi'li");
                for (int tasbih2=1; tasbih2 <= 3; tasbih2++)
                    baca("Subhaana rabbiyal a'la wabihamdih");                
                if (sujud==1) rukun("Duduk Antara Dua Sujud", "Fi'li");
            }
            if (rakaat==2)
                sunat("Duduk Tahiyat Awal", "Ab'adh", tahiyat("awal"));
            else if (rakaat==4){
                rukun("Duduk Tahiyat Akhir", "Fi'li");
                rukun("Baca Tahiyat Akhir", "Qauli", tahiyat("akhir"));
            }
        }
        rukun("Salam", "Qauli");
    }
    
    public static String doaIftitah(){
        return "Allahu akbar kabiraw-walhamdu lillahi \n"
                + "\t kathiraw-wasubhanallahi bukrataw-wa-asila.\n"
                + "\t Wajjahtu wajhia lillazi fataras sama-wati \n"
                + "\t wal-ardha hanifam-muslimaw-wama ana minal-musyrikin.\n"
                + "\t Inna salati wanusuki wamahyaya wamamati lillahi rabbil'alamin.\n"
                + "\t La syarikalahu wabiza-lika umirtu wa ana minal muslimin\n";
    }
    
    public static String tahiyat(String jenis) {
        if (jenis.equalsIgnoreCase("awal"))
            return "Attahiyyatul Mubarakaatush sholawaatuth thayyibatu lillaah,\n"
                    + "\t Assalaamu’alaika ayyuhan nabiyyu warahmatullaahi wabarakaatuh,\n"
                    + "\t Assalaamu’alaina wa’alaa ‘ibaadillaahish shoolihiin.\n"
                    + "\t Asyhadu allaa ilaaha illallaah, Waasyhadu anna Muhammadan rasuulullaah.\n"
                    + "\t Allahhumma sholli ‘alaa Saidina Muhammad wa ‘ala aalihi Saidina Muhammad\n";
        
        return "Attahiyyatul Mubarakaatush sholawaatuth thayyibatu lillaah,\n"
                + "\t Assalaamu’alaika ayyuhan nabiyyu warahmatullaahi wabarakaatuh,\n"
                + "\t Assalaamu’alaina wa’alaa ‘ibaadillaahish shoolihiin.\n"
                + "\t Asyhadu allaa ilaaha illallaah, Waasyhadu anna Muhammadan rasuulullaah.\n"
                + "\t Allahhumma sholli ‘alaa Saidina Muhammad wa ‘ala aalihi Saidina Muhammad\n"
                + "\t kamaa sholaita ‘ala saidina Ibrahiim wa ‘ala aalihi saidina Ibrahiim,\n"
                + "\t wa baarik ‘ala saidina Muhammad wa ‘ala aalihi saidina Muhammad,\n"
                + "\t kamaa baarakta ‘ala saidina Ibrahiim wa ‘ala aalihi saidina Ibrahiim,\n"
                + "\t fil alamina innaka hamiidum majiid\n";
    }


    public static void rukun(String rukun, String jenis) {
        System.out.printf("[Rukun %s] - %s%n", jenis, rukun);
        sleep(700);
    }
    
    public static void rukun(String rukun, String jenis, String bacaan) {
         System.out.printf("[Rukun %s] - %s (Lafaz: %s)%n", jenis, rukun, bacaan);
         sleep(700);
    }
    
    public static void sunat(String perbuatan, String jenis, String bacaan){
        System.out.printf("[Sunat %s] - %s (Lafaz - %s)%n", jenis, perbuatan, bacaan);
        sleep(700);
    }
    
    public static void baca(String bacaan) {
        System.out.printf("[Bacaan] - %s%n", bacaan);
        sleep(1200);
    }
    
    public static void print(String str) {
        System.out.println(str);
    }
    
    public static void sleep(int milisec) {
        try {
            Thread.sleep(milisec);
        } catch (InterruptedException ex) {
            Logger.getLogger(nestedloop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

