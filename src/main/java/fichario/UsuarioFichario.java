/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;
import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author Victor
 */
public class UsuarioFichario  {
    
    
        public String[] fieldsToString(Usuario b) {
            String[] a = new String[5];
            a[0]=b.getLogin();
            a[1]=b.getSenha();
            
             return a;
    }
      public String[] getColumnName(){
       String[] a = {"Login","Senha"};
       return a;
      }

      public String[][] getDataString(ArrayList<Usuario> data){
          String[][] stringTotal;
          int quantCampos = 5;
          stringTotal = new String[data.size()][quantCampos];
          int i=0;
          for(Usuario c:data){
            stringTotal[i][0]= c.getLogin();
            stringTotal[i][1]= c.getSenha();
          
            i++;
            
          }
          return stringTotal;
      }
          public Usuario getEnde(int i, ArrayList<Usuario> array) {
        return array.get(i);
    }

    public ArrayList getArray(ArrayList array) {
        return array;
    }

    public void remove(int i, ArrayList array) {
        array.remove(i);
    }

    public void add(Usuario e, ArrayList array) {
        array.add(e);
    }

    public void add(ArrayList<Usuario> arrayUsuario, Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
