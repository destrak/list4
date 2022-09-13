package preg38;
public class Preg38 {
    public static void main(String[] args) {
        CuatroOperaciones v = new CuatroOperaciones(1, 2);
        v.suma();
        v.resta();
      
        v.multiplica();
        v.divide();
    }
    
}
class   SumaResta{
    protected float uno;
    protected float dos;
    public SumaResta(){
     
    }
    public float suma(){
        return uno+dos;
    }
    public float resta(){
        return uno-dos;
    }
}

class CuatroOperaciones extends SumaResta{
    public CuatroOperaciones(float t, float r){
         uno=t;
        dos=r;
    }
    public float multiplica(){
        return uno*dos;
    }
    public float divide(){
        return uno/dos;
    }
}
