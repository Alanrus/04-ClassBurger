public class Main {
    public static void main(String[] args) {
        Burgers cheeseburger = new Burgers();
        cheeseburger.weight = 167;
        cheeseburger.calorific = 237;
        cheeseburger.composition = "Пряный горчичный соус, кетчуп, сочные стрипсы в оригинальной панировке, лук, сыр Чеддер, огурцы на пшеничной булочке с кукурузной посыпкой.";
        cheeseburger.proteins = 13.2;
        cheeseburger.fats = 8.6;
        cheeseburger.carbohydrates = 26.6;

        Burgers charburger = new Burgers();
        charburger.weight = 213;
        charburger.calorific = 236;
        charburger.composition = "Нежный сливочный соус, сочное филе в оригинальной панировке, салат айcберг и помидоры на пшеничной булочке с черно-белым кунжутом.";
        charburger.proteins = 13;
        charburger.fats = 10.7;
        charburger.carbohydrates = 22;

        System.out.println(cheeseburger.weight);
        System.out.println(cheeseburger.calorific);
        System.out.println(cheeseburger.composition);
        System.out.println(cheeseburger.proteins);
        System.out.println(cheeseburger.fats);
        System.out.println(cheeseburger.carbohydrates);

        System.out.println(charburger.weight);
        System.out.println(charburger.calorific);
        System.out.println(charburger.composition);
        System.out.println(charburger.proteins);
        System.out.println(charburger.fats);
        System.out.println(charburger.carbohydrates);
    }


}
