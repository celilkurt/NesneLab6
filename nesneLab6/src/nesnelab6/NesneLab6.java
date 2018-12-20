


package nesnelab6;



public class NesneLab6 {

   
    
    public static void main(String[] args) {
       
     int[] dizi = {2,5,6,7,8,1};
     
     kume kume1 = new kume(dizi);
     kume1.ekle(67);
     kume kume2 = new kume (kume1);
     kume2.ekle(345);
     kume1.ekle(34);
     kume2.ekle(34);
     
     kume1.yazdir();
     kume2.yazdir();
     
     if(kume1.esit(kume2))
        System.out.println("Kumeler esit.");
        
     kume1.fark(kume2);
     
     kume1.kesisim(kume2);
     
    }
    
}
