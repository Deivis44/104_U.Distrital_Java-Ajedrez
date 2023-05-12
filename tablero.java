package cristianap;

import javax.lang.model.util.ElementScanner14;

import Juego.ficha;

public class tablero {
        static ficha tableroJuego[][] = new ficha [8][8];


public static void crearTablero(){


 tableroJuego[0][0].setTipoFicha("Torre");
 tableroJuego[0][0].setPosX(450);
 tableroJuego[0][0].setPosY(200);
 tableroJuego[0][0].setNombreImagen("Torre.png");

 tableroJuego[0][1].setTipoFicha("Caballo");
 tableroJuego[0][1].setPosX(450);
 tableroJuego[0][1].setPosY(200);
 tableroJuego[0][1].setNombreImagen("Caballo.png");



 if (Turno==1){
    if (tableroJuego[0][0].getTipoFicha() == "Torre" )  {
        
        // ACÁ SE LE DAN LAS OPCIONES AL USUARIO

        switch (NUMBOTON) {
            case 1 : //DEPENDIENDO DE LA COORDENADA X y Y SE MUEVE Y SE ANALIZA SI SE PUEDE RELAIZAR EL MOVIMIENTO,
                       //SI EL MOVIMIENTO ES LICITO, SI SE ENCUENTRA UNA FICHA, SI SE PUEDE COMER, ETC

                       if (tableroJuego[POSCIION DE BOTON][POSICION DE BOTON].getTipoFicha() == "null")
                       {
                        //ACA SE INSERTA LA FUNCION PARA MOVER LA FICHA A UNA POSICION X y UNA POSICION Y
                        tableroJuego[3][3].setTipoFicha(tableroJuego[0][0].getTipoFicha());
                        tableroJuego[0][0].setTipoFicha("Null")
                       }
                       else {
                        //ACA SE INSERTA LA FUNCION PARA COMER UNA FICHA Y ELIMINARLA ( PARA ELIMINARLA SIMPLEMENTE SE MODIFICA
                        // EL TIPO DE FICHA POR EL VALOR "NULL" PARA HACER QUE "NO EXISTA")
                       }
                
                break;
        
            default:
                break;
        }

        
    }

 }




}


}

