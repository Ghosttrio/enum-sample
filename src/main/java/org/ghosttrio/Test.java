package org.ghosttrio;


public class Test {

    interface Cook {
        void recipe();
    }

    public enum Dish implements Cook {

        RAMEN{
            @Override
            public void recipe() {
                System.out.println("라멘 레시피");
            }
        },
        PIZZA{
            @Override
            public void recipe() {
                System.out.println("피자 레시피");
            }
        }

    }

    public static void main(String[] args) {
        Dish ramen = Dish.RAMEN;
        ramen.recipe();
        Dish pizza = Dish.PIZZA;
        pizza.recipe();
    }

}
