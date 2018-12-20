
package nesnelab6;

import java.util.ArrayList;
import java.util.Objects;

public class kume {
    
    public ArrayList<Integer> list = new ArrayList<>();
    
    public kume(){
        
    }
    
    public kume(int[] a){
        int i;
        
        for(i=0;i<a.length;i++){
            
           this.list.add(a[i]);
            
        }
        
        
    }
    
    public kume(kume a){
        
        int i;
        
        for(i=0;i<a.list.size();i++){
            
            this.list.add(a.list.get(i));
            
        }
        
    }
    
    public void ekle(int a){
        
        this.list.add(a);
        
    }
    
    public void yazdir(){
        
        System.out.println(this.list.toString());
        
    }
    
    public boolean esit(kume a){
        boolean i=false;
        int j,k,sayac = 0;
        
        if(this.list.size()==a.list.size())
        {
            for(j=0;j<a.list.size();j++){
                
                for(k=0;k<a.list.size();k++){
                    
                    if(Objects.equals(a.list.get(j), this.list.get(k)))
                        sayac++;
                    
                }
                
                
            }
            
            
        }
        if(sayac==this.list.size())
            i=true;
        
        return i;
    }
    
    public void fark(kume a){
        
        int j,k,sayac = 0;
        ArrayList<Integer> list1 = new ArrayList<>();
        
        
            for(j=0;j<a.list.size();j++){
                
                for(k=0;k<this.list.size();k++){
                    
                    if(Objects.equals(a.list.get(j), this.list.get(k)))
                        sayac++;
                    
                }
                if(sayac==0)
                    list1.add(a.list.get(j));
                
                sayac=0;
                
                
            }
            
            for(j=0;j<this.list.size();j++){
                
                for(k=0;k<a.list.size();k++){
                    
                    if(Objects.equals(this.list.get(j), a.list.get(k)))
                        sayac++;
                    
                }
                if(sayac==0)
                    list1.add(this.list.get(j));
                
                sayac=0;
                
                
            }
            
            System.out.println(list1.toString());
            
        
        
        
    }
            
    
    public void kesisim(kume a){
        
        int j,k,sayac=0;
        ArrayList<Integer> list1 = new ArrayList<>();
        
        for(j=0;j<a.list.size();j++){
                
                for(k=0;k<this.list.size();k++){
                    
                    if(a.list.get(j)==this.list.get(k))
                        sayac++;
                    
                }
                if(sayac!=0)
                    list1.add(a.list.get(j));
                
                sayac=0;
            }
        
        System.out.println(list1);
    }
    
    
}
