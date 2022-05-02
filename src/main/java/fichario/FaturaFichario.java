/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;

import java.util.ArrayList;
import model.Fatura;
import model.Parcela;

/**
 *
 * @author Victor
 */
public class FaturaFichario {

    private int nextSafeId = 1;
    public ArrayList<Fatura> arrayFatu;

    public FaturaFichario() {
        this.arrayFatu = new ArrayList<>();

    }

    public String[] getColumnName() {
        String[] a = {"Id", "Nome do Cliente", "Data Liquidação",
            "Quantidade de Parcelas", "Tipo de Pagamento", "Valor da Conta", "Valor das Parcelas"};
        return a;
    }

    public String[][] getDataString(ArrayList<Fatura> data) {
        String[][] stringTotal;
        int quantCampos = 7;
        int i = 0;
        double total=0;
        stringTotal = new String[data.size()][quantCampos];
        for (Fatura c : data) {
            stringTotal[i][0] = Integer.toString(c.getConta().getId());
            stringTotal[i][1] = c.getConta().getCliente().getNome();

            if (c.getDataLiquidacao() != null) {

                stringTotal[i][2] = Integer.toString(c.getDataLiquidacao().
                        getDayOfMonth()) + "." + Integer.toString(c.getDataLiquidacao().
                                getMonthValue()) + "." + Integer.toString(c.getDataLiquidacao().getYear());
            } else {
                stringTotal[i][2] = "";

            }

            stringTotal[i][3] = Integer.toString(c.getQtdParcelas());
            stringTotal[i][4] = Integer.toString(c.getTipopagamento());
            stringTotal[i][5] = Double.toString(c.getConta().getTotal());
            for(Parcela parcela:c.getParcelas()){
                total+=parcela.getValor();
            }
            stringTotal[i][6] = Double.toString(total);

        }
        return stringTotal;
    }

    public void add(Fatura e) {
        arrayFatu.add(e);
        nextSafeId++;

    }

    public int findIndex(int id) {
        int i = 0;
        for (Fatura fatura : arrayFatu) {
           
            if (fatura.getConta().getId() == id) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void remove(int index) {

        arrayFatu.remove(index);

    }

}
