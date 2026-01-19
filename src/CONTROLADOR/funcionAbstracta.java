package CONTROLADOR;

import MODELO.personas;
import java.util.ArrayList;

public abstract class funcionAbstracta {
    
    protected ArrayList<personas> registros = new ArrayList<>();
    
    public abstract void registrar();
    
    public abstract void verPersonas();
}
