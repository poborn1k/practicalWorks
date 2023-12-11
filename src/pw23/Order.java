package pw23;

public class Order {
    private int size = 0;
    private Dish[] dishes = new Dish[10];

    public boolean add(Dish dish) {
        if (size >= dishes.length) {
            return false;
        }
        dishes[size] = dish;
        return true;
    }

    private void cleanView() {
        Dish[] temp = new Dish[10];
        int place = 0;

        for (Dish dish : dishes) {
            if (dish != null) {
                temp[place] = dish;
                place++;
            }
        }
        dishes = temp;
    }

    public boolean remove(String dishName) {
        for (int i = 0; i < size; i++) {
            if (dishes[i].getName().equals(dishName)) {
                dishes[i] = null;
                size--;
                cleanView();
                return true;
            }
        }
        return false;
    }

    public int removeAll(String dishName) {
        int counter = 0;

        for (int i = 0; i < size; i++) {
            if (dishes[i].getName().equals(dishName)) {
                dishes[i] = null;
                counter++;
                size--;
            }
        }

        cleanView();
        return counter;
    }

    public int dishQuantity() {
        return size;
    }

    public int dishQuantity(String dishName) {
        int counter = 0;

        for (Dish dish : dishes) {
            if (dish.getName().equals(dishName)) {
                counter++;
            }
        }
        return counter;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public double costTotal() {
        double counter = 0;

        for (Dish dish : dishes) {
            counter += dish.getCost();
        }

        return counter;
    }

    public String[] dishesNames() {
        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            names[i] = dishes[i].getName();
        }

        return names;
    }

    public Dish[] sortedDishesByCostDesc() {
        Dish[] sortedArray = dishes;
        boolean isSorted = false;
        Dish tmp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < size - 1; i++) {
                if(sortedArray[i].getCost() > sortedArray[i+1].getCost()){
                    isSorted = false;

                    tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = tmp;
                }
            }
        }
        return sortedArray;
    }
}
