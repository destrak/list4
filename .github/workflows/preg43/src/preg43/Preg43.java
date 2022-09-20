package preg43;
import java.util.ArrayList;
public class Preg43 {
    public static void main(String[] args) {
    
    Expendedor exp = new Expendedor(6);
    Moneda m;
    Bebida b=null;
    Deposito d1=new Deposito( );
Deposito d2=new Deposito( );
 
 m =new Moneda();
 b =exp.comprarBebida(m,1);
 if(b !=null){
 System.out.println(b.getSerie()+", "+b.beber());
}
 else if(b==null){ 
 System.out.println(b);
   

}
    }
}
  class Expendedor{
      private Deposito coca;
      private Deposito sprite;
      public Expendedor(int n){
          
          coca= new Deposito();
          sprite = new Deposito();
          for(int i=0; i<n; i++){
              coca.addBebida(new CocaCola(i+100));
              sprite.addBebida(new Sprite(i+200));
      }
      }
      
      public Bebida comprarBebida(Moneda m, int n){
          if(n==1){
          return coca.getBebida();
      }
      if(n==2){
      return sprite.getBebida();
  }
      return null;
  }
  }
 abstract class Bebida{
    private int xd;
    public Bebida(int a){
        xd=a;
        
    }
    public int getSerie(){
        return xd;
    }
    public String beber(){
        return "sabor: ";
    }
}
class Deposito{
    private ArrayList <Bebida> n;
    public Deposito(){
      n = new ArrayList <Bebida>();
    }
    public void addBebida(Bebida b){
        n.add(b);
    }
    public Bebida getBebida(){
        if(n.size() ==0){
            return null;
        }
        else{
        return n.remove(0);
    }
    }
}
class Sprite extends Bebida{
public Sprite(int a){
super(a);
}
public String beber(){
    
return super.beber()+"sprite";
}
}
class CocaCola extends Bebida{
public CocaCola(int a){
super(a);
}
public String beber(){
    
return super.beber()+"cocacola";
}
}
class Moneda{
    public Moneda(){
        
    }
}
  