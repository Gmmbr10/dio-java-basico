package pilaresPoo.exemploInterface.equipamentos.multifuncional;

import pilaresPoo.exemploInterface.equipamentos.copiadora.Copiadora;
import pilaresPoo.exemploInterface.equipamentos.digitalizadora.Digitalizadora;
import pilaresPoo.exemploInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {
        System.out.println("EquipamentoMultifuncional copiando");
    }

    public void digitalizar() {
        System.out.println("EquipamentoMultifuncional digitalizando");
    }

    public void imprimir() {
        System.out.println("EquipamentoMultifuncional imprimindo");
    }
}
