
package HomeWork3_ZhuravlevD;


import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {
    ArrayList<T> box;

    public Box(ArrayList<T> box) {
        this.box = box;
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public float getWeight(){
        float sum = 0.0f;
        for (int i = 0; i < box.size(); i++) {
            sum += box.get(i).getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }


    public void add(Box<T> fruit) {
        fruit.add(fruit);
    }
    public void emptyTo (Box<T> another) {
        another.box.addAll(box);
        box.clear();
    }



}
