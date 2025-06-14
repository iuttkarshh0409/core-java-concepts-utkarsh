// Program to demonstrate constructor overloading
class Box {
    int h, w, d;

    // Default constructor
    Box() {
        h = w = d = 0; // Set default dimensions to 0
    }

    // Parameterized constructor
    Box(int a) {
        h = w = d = a; // Set dimensions to the given value
    }

    // Method to calculate volume
    int volume() {
        return (h * w * d);
    }
}

class ConstructorOverloadingDemo {
    public static void main(String args[]) {
        // Create a box using the default constructor
        Box b = new Box();
        int v = b.volume();

        // Display the volume of the box
        System.out.println("Volume of box= " + v);
    }
}
