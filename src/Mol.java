import java.util.ArrayList;

public class Mol {
    class StructPart{
        Atom atom;
        double x, y, z;

        ArrayList<StructPart> connected;
    }

    ArrayList<StructPart> atoms;
    public Mol(String SMILES){

    }
}
