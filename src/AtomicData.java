public class AtomicData {
    //* Clasic constants
    static double ELECTRON_MASS = 9.1093837e-31;
    static double NEUTRON_MASS = 1.67493e-27;
    static double PROTON_MASS = 1.67262192e-27;

    static double AVOGADRO_NUMBER = 6.02214076e23;
    static double U = 1.660538921e-27;//1/(AVOGADRO_NUMBER*1e3);
    static double MeV_Kg = 1.78266269594644e-30;
    static double MeV_Joule = 1.602176634e-13; // 1MeV = xJ
    static double Joule_Kg = 1.112650056e-17;
    static double Joule_Wh = 0.0002777777777778;
    static double c = 299792458;

    //* Bethe-Weizsäcker constants (Kg)

    static double av = 2.773823154893e-29; //15,56 MeV
    static double as = 3.071527825116e-29;//17,23 MeV
    static double ac = 1.247863887163e-30;//0,7 MeV
    static double aa = 4.207083962434e-29;//23,6 MeV
    static double ap = 1.99658221946e-29;//11,2 MeV

    //* Max electrons by layer
    static int layerK = 2;
    static int layerL = 8;
    static int layerN = 18;
    static int layerM = 32;
    static int layerO = 50;
    static int layerP = 72;
    static int[] layerSizes = {layerK, layerL, layerN, layerM, layerO, layerP};

        static String[] SYMBOLS = {
            "H",
            "He",
            "Li",
            "Be",
            "B",
            "C",
            "N",
            "O",
            "F",
            "Ne",
            "Na",
            "Mg",
            "Al",
            "Si",
            "P",
            "S",
            "Cl",
            "Ar",
            "K",
            "Ca",
            "Sc",
            "Ti",
            "V",
            "Cr",
            "Mn",
            "Fe",
            "Co",
            "Ni",
            "Cu",
            "Zn",
            "Ga",
            "Ge",
            "As",
            "Se",
            "Br",
            "Kr"
        };

        static String[] NAMES = {
            "Hydrogen",
            "Helium",
            "Lihium",
            "Béryllium",
            "Boron",
            "Carbon",
            "Nitrogen",
            "Oxygen",
            "Fluorine",
            "Neon",
            "Sodium",
            "Mgnesium",
            "Aluminium",
            "Silicon",
            "Phosphorus",
            "Sulfur",
            "Chlorine",
            "Argon",
            "Potassium",
            "Calcium",
            "Scandium",
            "Titanium",
            "Vanadium",
            "Chromium",
            "Manganese",
            "Iron",
            "Cobalt",
            "Nickel",
            "Copper",
            "Zinc",
            "Gallium",
            "Germanium",
            "Arsenic",
            "Selenium",
            "Bromine",
            "Krypton"
        };

        static double[] ELECTRONEGATIVITY = { //-1 mean unknow, start by 1 obv
            2.2,
            -1,
            0.98,
            1.57,
            2.04,
            2.55,
            3.04,
            3.44,
            3.98,
            -1,
            0.98,
            1.31,
            1.61,
            1.90,
            2.19,
            2.58,
            3.16,
            0.82,
            1.,
            1.36,
            1.54,
            1.63,
            1.66,
            1.55,
            1.83,
            1.88,
            1.91,
            1.90,
            1.65,
            1.81,
            2.01,
            2.18,
            2.55,
            2.96,
            3.00
        };
}
