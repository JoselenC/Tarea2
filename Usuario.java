
public class Usuario {

     private String nombre;
     private int cedula;
     private int contrase�a;
     private int edad;
     private int cantHijos;
     private int saldo=0;

   
    
    //Constructor
    public Usuario (){
        nombre = "";
        cedula=0;
        contrase�a=0;
        edad = 0;
        cantHijos=0;
        saldo=0;
    }//Cierre del constructor
    
    public void setNombre(String nom){
        nombre=nom;
    }
    
    public void setCedula(int ced){
        cedula=ced;
    }
    
     public void setContrase�a(int con){
        contrase�a=con;
    }
     
      public void setEdad(int ed){
        edad=ed;
    }
      
       public void setCantHijo(int cantH){
        cantHijos=cantH;
    }
       
        public void setSaldo(int sal){
        saldo=sal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public int getContrase�a() {
        return contrase�a;
    }

    public int getEdad() {
        return edad;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public int getSaldo() {
        return saldo;
    }

 @Override
    public boolean equals(Object obj) {
        
        final Usuario other = (Usuario) obj;
        if (this.cedula != other.cedula) {
            return false;
        }
        return true;
    }
    
    
    
}
