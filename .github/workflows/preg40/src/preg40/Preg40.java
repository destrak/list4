package preg40;
public class Preg40 {
public static void main(String[] args) {
    }
    
}

class CreaYPruebaBebida {
      public static void pruebaVeSerieBebe(int que, int serie){
          Bebida b=null;
          switch (que){
              case 1:  b = new Sprite(serie); break;
              case 2:  b = new Fanta(serie); break;
              case 3:  b = new Kem(serie); break;
              case 4:  b = new CocaCola(serie); break;
              default: return;
          }
          System.out.println(b.getSerie()+": "+b.beber());  
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
