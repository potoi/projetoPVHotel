/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;
import java.util.ArrayList;
import model.Veiculo;

/**
 *
 * @author Victor
 */
public class VeiculoFichario {
    
    
        public String[] fieldsToString(Veiculo b) {
            String[] a = new String[5];
            a[0]=b.getMarca();
            a[1]=b.getModelo();
            a[2]=b.getCor().toString(); //b.getEnderecoResidencial();
            a[3]=b.getPlaca();
            a[4]=b.getVagaOcupada();
        
        

        return a;
    }
      public String[] getColumnName(){
       String[] a = {"Marca","Modelo","Cor","Placa","Vaga Ocupada"};
       return a;
      }
      public String[][] getDataString(ArrayList<Veiculo> data){
          String[][] stringTotal;
          int quantCampos = 5;
          stringTotal = new String[data.size()][quantCampos];
          int i=0;
          for(Veiculo c:data){
            stringTotal[i][0]= c.getMarca();
            stringTotal[i][1]= c.getModelo();
            stringTotal[i][2]= c.getCor().toString();
            stringTotal[i][3]= c.getPlaca();
            stringTotal[i][4]= c.getVagaOcupada();
            i++;
            
          }
          return stringTotal;
      }
}
