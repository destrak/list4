package preg42;

import java.util.ArrayList;

public class Preg42 {
        public static void main(String[] args) {
Deposito d1=new Deposito( );
Deposito d2=new Deposito( );
Deposito d3=new Deposito( );
Deposito d4=new Deposito( );
d1.addBebida(new CocaCola(12));
d1.addBebida(new CocaCola(13));
d1.addBebida(new CocaCola(14));
d2.addBebida(new Kem(24));
d2.addBebida(new Kem(25));
d3.addBebida(new Fanta(36));
d3.addBebida(new Fanta(37));
d3.addBebida(new Fanta(38));
d4.addBebida(new Sprite(48));
d4.addBebida(new Sprite(49));
d4.addBebida(new Sprite(50));
  Bebida b=null;
b=d1.getBebida();
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
        return n.remove(0);
    }
}
class Sprite extends Bebida{
public Sprite(int a){
super(a);
}
public String beber(){
    
return beber()+"sprite";
}
}
class Fanta extends Bebida{
public Fanta(int b){
super(b);
}
public String beber(){
    
return beber()+"fanta";
}
}
class Kem extends Bebida{
public Kem(int a){
super(a);
}
public String beber(){
    
return beber()+"kem";
}
}
class CocaCola extends Bebida{
public CocaCola(int a){
super(a);
}
public String beber(){
    
return beber()+"cocacola";
}
}
