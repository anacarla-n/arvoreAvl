package ArvoreAVL;


/**
 *
 * @author 20151lbsi120040
 */
public class No<T> {
    
    No<T> esq;
    No<T> dir;
    int altura;
    private int obj;

     public No(int obj) {
         this(null, null, obj);
    }

    public No(No<T> esq, No<T> dir, int obj) {
        this.esq = esq;
        this.dir = dir;
        this.altura = 0;
        this.obj = obj;
    }
    

    public int getObj() {
        return obj;
    }

    public void setObj(int obj) {
        this.obj = obj;
    }
    
       
    public No<T> getEsq() {
        return esq;
    }

    public void setEsq(No<T> esq) {
        this.esq = esq;
    }

    public No<T> getDir() {
        return dir;
    }

    public void setDir(No<T> dir) {
        this.dir = dir;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

   
    
    
    
}
