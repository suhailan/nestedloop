
package nestedloop;

public class nestedloop {
    public static void main(String[] args) {
        //NESTED LOOP IN SOLAT ZOHOR, ASAR DAN ISYAK
        //BY: SUHAILAN SAFEI (3 SEPT 2015)
        System.out.println("Niat");
        System.out.println("TakbiratulIhram");
        for (int rakaat=1; rakaat <=4;rakaat++){
            System.out.println("Berdiri Rakaat "+rakaat);
            System.out.println("Baca al-Fatihah");

            System.out.println("Ruku\'");
            for (int tasbih=1; tasbih <= 3; tasbih++){
                System.out.println("Subhaana rabbiyal azhimi wabihamdih");
            }
            
            System.out.println("I\'tidal");
            for (int sujud=1;sujud <=2; sujud++){   
                System.out.println("Sujud");
                for (int tasbih2=1; tasbih2 <= 3; tasbih2++)
                    System.out.println("Subhaana rabbiyal a'la wabihamdih");                
                if (sujud==1) {
                    System.out.println("DudukAntaraDuaSujud");                
                    System.out.println("robbighfirlii warhamnii wajburnii warfa'nii warzuqnii wahgdinii wa'aafinii wa'fu 'anni");
                }
            }
            if (rakaat==2)
                System.out.println("DudukTahiyatAwal");                
            else if (rakaat==4){
                System.out.println("DudukTahiyatAkhir");
                System.out.println("BacaTahiyatAkhir");
            }
        }
        System.out.println("Salam");
        
        
        
        
    }
}

