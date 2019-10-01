
package Store_app;

public class Service {
    int morochas = 200;
    int casino = 250;
    int oreo = 200;
    int ritz = 150;
    int tentacion = 200;
    int clubsocial = 250;
    
    private int tipo, cant;
    double impComp, impDesc, impPag;

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

   
    
   public void calcularImporte(){
       switch(tipo){
           case 0:
               impComp=1*cant;
               break;
           case 1:
               impComp=1.20*cant;
               break;
           case 2:
               impComp=1*cant;;
               break;
           case 3:
               impComp=1*cant;
               break;
           case 4:
               impComp=1*cant;
               break;
           case 5:
               impComp=1*cant;
               break;
           case 6:
               impComp=1.20*cant;
               break;
           default:
               break;   
       }
   }
   
   public void importeDescuento(){
       if(cant>5){
           impDesc = cant*0.20;
       }
       else{
           impDesc = 0.0; 
       }  
   }
   
   public void importePagar(){
       impPag = impComp - impDesc;
   }
    
   
}
