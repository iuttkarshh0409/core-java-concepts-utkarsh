

class Box {
    private double width;
    private double height;
    private double depth;

    // Copy Constructor
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth; // Fixed: Previously it was ob.width, which was incorrect.
    }

    // Parameterized Constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Default Constructor
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Cube Constructor
    Box(double len) {
        width = height = depth = len;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

// BoxWeight class inheriting Box
class BoxWeight extends Box {
    double weight;

    // Copy Constructor
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    // Parameterized Constructor
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // Fixed incorrect variable names
        weight = m;
    }

    // Default Constructor
    BoxWeight() {
        super();
        weight = -1;
    }

    // Cube Constructor
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

// Main class
class SuperKeywordDemo {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 = " + vol);
        System.out.println("Weight of mybox1 = " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 = " + vol);
        System.out.println("Weight of mybox2 = " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume of mybox3 = " + vol);
        System.out.println("Weight of mybox3 = " + mybox3.weight); // Fixed: Incorrectly printed mybox1
        System.out.println();

        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight); // Fixed: Used proper reference
        System.out.println();

        vol = mycube.volume();
        System.out.println("Volume of my cube is " + vol);
        System.out.println("Weight of my cube is " + mycube.weight); // Fixed: Used proper reference
        System.out.println();
    }
}
