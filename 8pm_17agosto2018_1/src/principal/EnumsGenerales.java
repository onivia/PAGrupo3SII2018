package principal;

public class EnumsGenerales {
    public enum DiasSemana {
        LUNES(1),
        MARTES(2),
        VIERNES(5);
        
        private int valordia;
        
        DiasSemana(int idia) {
           this.valordia = idia;            
        }
        
        public int getValorDia() {
            return this.valordia;
        }
        
        public static DiasSemana fromInt(int idia) {
            switch (idia) {
                case 1:
                    return DiasSemana.LUNES;
                case 2:
                    return DiasSemana.MARTES;
                case 5:
                    return DiasSemana.VIERNES;
                default:
                    return null;
            }
        }
    }    
}
