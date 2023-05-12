package Juego;

public class ficha
{
    public String getTipoFicha;
    private String tipoFicha;
    private int x;
    private int y;
    private String nombreImagen;

    public ficha() {

    }

    public String getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(String newTipoFicha){
    this.tipoFicha = newTipoFicha;
    }

    // GETTER Y SETTER POS X
    public int  getPosX() {
        return x;
    }
    public void setPosX(int newPosX){
    this.x = newPosX;
    }

    // GETTER Y SETTER POS Y
    public int  getPosY() {
        return y;
    }
    public void setPosY(int newPosY){
    this.y = newPosY;
    }
    // GETTER Y SETTER NOMBRE IMAGEN
    public String  getNombreImagen() {
        return nombreImagen;
    }
    public void setNombreImagen(String newNombreImagen){
    this.nombreImagen = newNombreImagen;
    }

}