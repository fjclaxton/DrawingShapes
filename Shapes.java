public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        
        Turtle turtle = new Turtle();
        
        turtle.down();
        for (int i = 1; i<=5; i++) {
            turtle.forward(100);
            turtle.left(72);
        }

        // Task 2: Draw a regular shape many times
        int times = 10;
        for (int v = 1; v<=times; v++) {
            for (int i = 1; i<=5; i++) {
               turtle.forward(100);
               turtle.left(72);
            }
            turtle.left(360/times);
        }
        
        // Task 3: How many times does Turtle turn!
        int count = 0;
        
        //move the turtle to a new location
        turtle.up();
        turtle.forward(200);
        turtle.down();
        //draw the pentagon circle
        for (int v = 1; v<=times; v++) {
            for (int i = 1; i<=5; i++) {
               turtle.forward(100);
               turtle.left(72);
               count+=1;
            }
            turtle.left(360/times);
        }
        System.out.println("turtle has turned " + count + "times!");

        // Extension 1 Additional use of loop variable:
        
        //move the turtle to a new location
        turtle.up();
        turtle.backward(400);
        turtle.down();
        //draw the pentagon circle
        for (int v = 1; v<=times; v++) {
            for (int i = 1; i<=5; i++) {
               turtle.forward(10*v);
               turtle.left(72);
            }
            turtle.left(360/times);
        }
        
        
        turtle.clear(); //clear the canvas
        
        // Extension 2: Triply nested loop
        
        //move turtle to a new location
        turtle.up();
        turtle.forward(200);
        turtle.down();
        
        //draw shape
        
        for (int a = 1; a<10; a++) {
         for (int v = 1; v<=times; v++) {
            for (int i = 1; i<=5; i++) {
               turtle.forward((10*a)-((a/5) * (8.506508084)));
               turtle.left(72);
            }
            turtle.left(360/times);
         }
         turtle.up();
         turtle.forward((a/5) * (8.506508084));
         turtle.down();
        }
    }
}
