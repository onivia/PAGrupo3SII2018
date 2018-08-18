package principal;

public class Programa {

    public static void main(String[] args) {
        EnumsGenerales.DiasSemana dia1 = EnumsGenerales.DiasSemana.MARTES;
        
        int i = 1;
        EnumsGenerales.DiasSemana dia2 = EnumsGenerales.DiasSemana.fromInt(i);
        
        System.out.println(dia2);
        
        //System.out.println(dia1);
        
//        if(dia1 == EnumsGenerales.DiasSemana.MARTES)
//            System.out.println("ES MARTES");
//if(dia1 == 2) //martes
    }
}
