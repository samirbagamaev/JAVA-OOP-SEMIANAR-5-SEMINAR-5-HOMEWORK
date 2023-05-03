/* 
Создать иерархию классов для персонажей
Крестьянин	Разбойник*	Снайпер*	Колдун*
копейщик*	арбалетчик	монах
----------------------------------------------------------------------
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун,
Копейщик, Арбалетчик, Монах". Для каждого определит 8 полей данных(здоровье,
сила итд) 3-4 поля поведения(методов атаковать, вылечить итд). Создать 
абстрактный класс и иерархию наследников. Расположить классы в пакет так, 
чтобы в основной программе небыло видно их полей. В не абстрактных классах 
переопределить метод toString() так чтобы он возвращал название класса или имя. 
Создать в основной программе по одному обьекту каждого не абстрактного класса и 
вывести в консоль его имя.
----------------------------------------------------------------------
Добавить файл с описанием интерфейса. В котором описать два метода, void step();
и String getInfo(); Реализовать интерфейсs в абстрактном классе и в наследниках 
так, чтобы getInfo возвращал информацию о персонаже. Создать два списка в классе 
main. В каждый список добавить по десять экземнляров наследников BaseHero. 
В main пройти по спискам и вызвать у всех персонажей getInfo.
-----------------------------------------------------------------------
Добавить в интерфейс(если ещё нету) метод step() и реализовать его в
абстрактном классе и у магов по примеру семинара. Добавить полен 
инициатива(если ещё нету). Обьеденить списки и отсортировать по инициативе, 
по примеру семинара.
-----------------------------------------------------------------------
Создать класс хронящий координаты x и y. С конструктором и методом принимающим 
координату а возвращающим расстояние от своей координаты до переданной.

Переопределить метод step в стрелках таким образом, чтобы при наличии 
стрел и жизней стрелки находили ближайшего противника и наносили ему повреждение. 
В своей комманде найти крестьян и, если крестьянин жив и не занят, занять его 
доставкой стрел. Иначе стрелы уходят по одной на выстрел.
-----------------------------------------------------------------------
Реализовать визуализацию своего проекта по примеру семинара с использованием 
приложенный классов. Доработать степ крестьян.
-----------------------------------------------------------------------

*/
// package WORK;

// import WORK.Units.*;

// public class Main {

//     public static void main(String[] args) {
//         Hero hero1 = new Sniper("Alex");     //СНАЙПЕР 
//         Hero hero2 = new Spearman("Vlad");   //КОПЕЙЩИК
//         Hero hero3 = new Witcher("Maxim");   //КОЛДУН
//         Hero hero4 = new Thief("Anatoly");   //РАЗБОЙНИК
//         Hero hero5 = new Peasant("Alexey");  //КРЕСТЬЯНИН
//         Hero hero6 = new Monk("Serega");     //МОНАХ
//         Hero hero7 = new CrossBowMan("Maga"); //АРБАЛЕТЧИК
//         hero4.attack(hero3);

//         System.out.println(hero1.toString());
//         System.out.println(hero2.toString());
//         System.out.println(hero3.toString());
//         System.out.println(hero4.toString());
//         System.out.println(hero5.toString());
//         System.out.println(hero6.toString());
//         System.out.println(hero7.toString());

//     }
// }
//=============================================================================

package WORK;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import WORK.Units.CrossBowMan;
import WORK.Units.Hero;
import WORK.Units.Monk;
import WORK.Units.Peasant;
import WORK.Units.Sniper;
import WORK.Units.Spearman;
import WORK.Units.Thief;
import WORK.Units.Witcher;

public class Main {

    public static ArrayList<Hero> team1 = new ArrayList<>();
    public static ArrayList<Hero> team2 = new ArrayList<>();
    public static ArrayList<Hero> allTeam = new ArrayList<>();

    public static void main(String[] args) {

        int teamSize = 10;

        for (int i = 0; i < teamSize + 1; i++) {
            switch (new Random().nextInt(1, 5)) {
                case 1:
                    team1.add(new Sniper(team1, getName(), 1, i));
                    break;
                case 2:
                    team1.add(new Spearman(team1, getName(), 1, i));
                    break;
                case 3:
                    team1.add(new Witcher(team1, getName(), 1, i));
                    break;
                case 4:
                    team1.add(new Peasant(team1, getName(), 1, i));
                    break;
                case 5:
                    team1.add(new Thief(team1, getName(), 1, i));
                    break;
                case 6:
                    team1.add(new Monk(team1, getName(), 1, i));
                    break;
                case 7:
                    team1.add(new CrossBowMan(team1, getName(), 1, i));
                    break;
            }
        }

        for (int i = 0; i < teamSize + 1; i++) {
            switch (new Random().nextInt(1, 5)) {
                case 1:
                    team2.add(new Sniper(team2, getName(), 10, i));
                    break;
                case 2:
                    team2.add(new Spearman(team2, getName(), 10, i));
                    break;
                case 3:
                    team2.add(new Witcher(team2, getName(), 10, i));
                    break;
                case 4:
                    team2.add(new Peasant(team2, getName(), 10, i));
                    break;
                case 5:
                    team2.add(new Thief(team2, getName(), 10, i));
                    break;
                case 6:
                    team2.add(new Monk(team2, getName(), 10, i));
                    break;
                case 7:
                    team2.add(new CrossBowMan(team2, getName(), 10, i));
                    break;
            }
        }

        /*
         * ArrayList<Hero> all = new ArrayList<>();
         * all.addAll(team1);
         * all.addAll(team2);
         * //team1.forEach(unit -> System.out.println(unit.getInfo()));
         * team2.forEach(unit-> System.out.println(unit.getInfo()));
         * System.out.println();
         * 
         * System.out.println("==============================================");
         * //team2.forEach(unit->unit.step());
         * 
         * System.out.println();
         * //team2.forEach(unit -> System.out.println(unit.getInfo()));
         * 
         * // System.out.println();
         * // System.out.println("==============================================");
         * 
         * System.out.println();
         * all.sort(Hero::compareTo);
         * System.out.println(all);
         */

        // ArrayList<Hero> all = new ArrayList<>();
        // all.addAll(team1);
        // all.addAll(team2);
        // System.out.println("КОМАНДА 1");
        // team1.forEach(unit -> System.out.println(unit.getInfo()));
        // System.out.println();
        // System.out.println("КОМАНДА 2");
        // team2.forEach(unit -> System.out.println(unit.getInfo()));

        // System.out.println();
        // team2.forEach(unit -> unit.step(team1, team2));
        // System.out.println();
        // System.out.println("==============================================================================");
        // System.out.println();
        // System.out.println("ПОСЛЕ АТАКИ:");
        // System.out.println();
        // System.out.println("КОМАНДА 1");
        // team1.forEach(unit -> System.out.println(unit.getInfo()));
        // System.out.println();
        // System.out.println("КОМАНДА 2");
        // team2.forEach(unit -> System.out.println(unit.getInfo()));

        // }

        // static String getName() {
        // return String.valueOf(Names.values()[new
        // Random().nextInt(Names.values().length)]);
        // }

        // }

        allTeam.addAll(team1);
        allTeam.addAll(team2);
        allTeam.sort(Hero::compareTo);

        Scanner in = new Scanner(System.in);
        while (true){

            View.view();
            in.nextLine();
            for (Hero hero : allTeam){
                if (team1.contains(hero)){
                    hero.step(team1,team2);
                }else hero.step(team2, team1);
            }

        }
    }

    static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

}
