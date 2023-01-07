import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atom {

    static Pattern atomPattern = Pattern.compile("(\\d*)([A-Z][a-z]*)(\\-*\\+*\\-*)");

    int Z;
    int A;
    private int C;
    double X;

    private int[] layers;

    public Atom(String atom){
        Matcher m = atomPattern.matcher(atom);
        m.find();
        //m.group();

        String symbol = m.group(2);
        for(Z = 1; Z<AtomicData.SYMBOLS.length+1 && !AtomicData.SYMBOLS[Z-1].equals(symbol); Z++);

        String isotope = m.group(1);
        if(isotope != null){
            A = Integer.parseInt(isotope);
        }else{
            A = Z*2;
        }

        String charge = m.group(3);
        if(charge != null){
            int c = 0;
            for(char sign : charge.toCharArray()){
                if(sign == '+'){
                    c++;
                }else if(sign == '-'){
                    c--;
                }
            }
            setCharge(c);
        }else{
            setCharge(0);
        }

        System.out.println(AtomicData.NAMES[Z-1] + A + " charge : " + getCharge());
    }

    public Atom(int Z){
        this.Z = Z;
        this.A = Z*2;
        setCharge(0);
        this.X = AtomicData.ELECTRONEGATIVITY[Z-1];
    }

    public Atom(int A, int Z){
        this.Z = Z;
        this.A = A;
        setCharge(0);
        this.X = AtomicData.ELECTRONEGATIVITY[Z-1];
    }

    public Atom(int A, int Z, int charge){
        this.Z = Z;
        this.A = A;
        setCharge(charge);
        this.X = AtomicData.ELECTRONEGATIVITY[Z-1];
    }

    public void setCharge(int charge){ // relative to Z (positive or negative for ionisation)
        C = Z+charge;
        layers = new int[AtomicData.layerSizes.length];
        int c = C;
        for(int i = 0; i<layers.length && c > 0; i++){
            int cc = c > AtomicData.layerSizes[i] ? AtomicData.layerSizes[i] : AtomicData.layerSizes[i]-c;
            layers[i] = cc;
            c -= cc;
        }
    }

    public int getCharge(){
        return C-Z;
    }

    public int[] getLayers(){
        return layers;
    }
}
