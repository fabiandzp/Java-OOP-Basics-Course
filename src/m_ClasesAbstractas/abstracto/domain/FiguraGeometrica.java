package m_ClasesAbstractas.abstracto.domain;

public abstract class FiguraGeometrica {

    protected String tipoFigira;

    protected FiguraGeometrica(String tipoFigira){
        this.tipoFigira = tipoFigira;
    }

    //La clase padre no define comportamiento
    public abstract void dibujar(); // metodo abstracto

    public String getTipoFigira(){
        return tipoFigira;
    }

    public void setTipoFigira(String tipoFigira){
        this.tipoFigira = tipoFigira;
    }

    @Override
    public String toString() {
        return "Tipo de Figura: " + this.tipoFigira;
    }
}
