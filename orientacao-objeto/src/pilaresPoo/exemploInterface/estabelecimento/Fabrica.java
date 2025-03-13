package pilaresPoo.exemploInterface.estabelecimento;

import pilaresPoo.exemploInterface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        em.copiar();
        em.digitalizar();
        em.imprimir();
    }
}
