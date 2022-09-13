package preg39;
public class Preg39 {
    public static void main(String[] args) {
 SumaResta v = new SumaResta(1, 2);
        v.suma();
        v.resta();
        CuatroOperaciones n = new CuatroOperaciones(1,2);
        n.multiplica();
        n.divide();
     
    }
    
}
class   SumaResta{
    private float uno;
    private float dos;
    public SumaResta(float t, float a){
     uno=t;
     dos=a;
     
    }
    public float suma(){
        return uno+dos;
    }
    public float resta(){
        return uno-dos;
    }
    public float getUno(){
        return uno;
    }
    public float getDos(){
        return dos;
    }
}
 class CuatroOperaciones extends SumaResta{

    public  CuatroOperaciones(float t , float a){
       super(t,a);
    }
    public float multiplica(){
        return getUno() * getDos();
    }
    public float divide(){
        return getUno()/getDos();
    }
}