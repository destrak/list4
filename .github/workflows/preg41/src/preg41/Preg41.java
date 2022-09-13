package preg41;
import java.util.ArrayList;
public class Preg41 {
    public static void main(String[] args) {
        Deposito d1=new Deposito( );
Deposito d2=new Deposito( );
Deposito d3=new Deposito( );
Deposito d4=new Deposito( );
d1.addBebida(new CocaCola(14));
d1.addBebida(new CocaCola(15));
d2.addBebida(new Kem(28));
d2.addBebida(new Kem(29));
d2.addBebida(new Kem(30));
d3.addBebida(new Fanta(42));
d3.addBebida(new Fanta(43));
d4.addBebida(new Sprite(56));
d4.addBebida(new Sprite(57));
d4.addBebida(new Sprite(58));
  
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
    public abstract String beber();
        
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
        return n.remove(0);
    }
}
class Sprite extends Bebida{
public Sprite(int a){
super(a);
}
public String beber(){
    
return "sprite";
}
}
class Fanta extends Bebida{
public Fanta(int b){
super(b);
}
public String beber(){
    
return "fanta";
}
}
class Kem extends Bebida{
public Kem(int a){
super(a);
}
public String beber(){
    
return "kem";
}
}
class CocaCola extends Bebida{
public CocaCola(int a){
super(a);
}
public String beber(){
    
return "cocacola";
}
}
