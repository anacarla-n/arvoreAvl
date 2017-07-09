package ArvoreAVL;

/**
 *
 * @author 20151lbsi120040
 */
public class ArvoreAVL<T> {

    No<T> raiz;

    public No<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }

    public void clear() {
        setRaiz(null);
    }

    public boolean vazia() {
        if (getRaiz() == null) {
            return true;
        }
        return false;
    }

    private static int altura(No t) {
        if (t == null) {
            return -1;
        } else {
            return t.getAltura();
        }
    }
    
    private int getFatorBalancear(No n){
        return altura(n.getEsq()) - altura(n.getDir());
    }

//    private boolean insert(int n) {
//        raiz = insert(n, raiz);
//        return true;
//    }

    public void insert(int valor) {
        No no = new No(valor);
        if (vazia()) {
           
            raiz = insertLocal(valor, raiz);
        } else {
            insertLocal(valor, raiz);
            
        }
        // balancear(raiz);
    }
    public No insertLocal(int inserir, No objComparar) {
        if(objComparar == null){
            objComparar = new No(inserir);
            //return objComparar;
        }else if (inserir > objComparar.getObj()) {
            No nn = insertLocal(inserir, objComparar.getDir());
            objComparar.setDir(nn);
            calcularFator(nn);
            true;
        } else  {
            No nn = insertLocal(inserir, objComparar.getEsq());
            objComparar.setEsq(nn);
            calcularFator(nn);
            true;
        }
        
        return objComparar;
    }

    public void balancear(No n) {

    }

    public void rotacaoEsq() {

    }

    public void rotacaoDir() {

    }

    public No<T> buscar() {
        return null;
    }

    public void verificarArvore() {

    }
}
