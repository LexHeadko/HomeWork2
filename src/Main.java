public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog=" + dog + "," + "cat=" + cat + "," + "paper=" + paper);
        // Пишем код для задачи 1
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog=" + dog + "," + "cat=" + cat + "," + "paper=" + paper);
        // Пишем код для задачи 2
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 12.0;
        var cat = 7.6;
        var paper = 763793;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog=" + dog + "," + "cat=" + cat + "," + "paper=" + paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend=" + friend);
        friend = friend +2;
        System.out.println("friend=" + friend);
        friend = friend / 7;
        System.out.println("friend=" + friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog=" + frog);
        frog = frog * 10;
        System.out.println("frog=" + frog);
        frog = frog / 3.5;
        System.out.println("frog=" + frog);
        frog = frog + 4;
        System.out.println("frog=" + frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightSecondBoxer + weightFirstBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг.");
        var differenceInWeight = weightFirstBoxer - weightSecondBoxer;
        System.out.println("Разница в весе " + differenceInWeight + " кг.");
    }
        public static void task7() {
            System.out.println("Задача 7");
            var weightFirstBoxer = 78.2;
            var weightSecondBoxer = 82.7;
            var differenceInWeight1 = weightSecondBoxer - weightFirstBoxer;
            System.out.println("Разница в весе " + differenceInWeight1 + " кг.");
            var differenceInWeight2 = weightSecondBoxer % weightFirstBoxer;
            System.out.println("Разница в весе " + differenceInWeight2 + " кг.");
    }
        public static void task8() {
            System.out.println("Задача 8");
            var allWorkTime = 640;
            var workTime = 8;
            var totalWorker = allWorkTime / workTime;
            System.out.println("Всего работников в компании " + totalWorker + " человек.");
            totalWorker = totalWorker + 94;
            workTime = allWorkTime / totalWorker;
            System.out.println("Если в компании работает " + totalWorker + " человек, то всего " + workTime + " часа(ов) работы может быть поделено между сотрудниками.");
        }
}