package example;

import java.util.*;
public final class Main {
    public static void main(String[] args) {
        PhoneNumber pn = new PhoneNumber(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        System.out.println(pn.toString());

        Complex c = new Complex(7, 4);
        System.out.println(c.toString());

        InstrumentedSet<Integer> s = new InstrumentedSet<Integer>(new HashSet<Integer>());
        s.add(1);
        s.add(2);
        System.out.println(s.getAddCount());

        double earthWeight = Double.parseDouble("175");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for(Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n",p,p.surfaceWeight(mass));

        System.out.println(min(1,2,3));
    }

    static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for(int arg : remainingArgs)
            if(min > arg)
                min = arg;
        return min;
    }
}
