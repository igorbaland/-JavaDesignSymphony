package StructuralUltimateDesignPatterns.composite.team;

public class CompositeTeamDemo {
    public static void show() {
        var team1 = new Team();
        team1.add(new Truck());
        team1.add(new HumanResource());
        team1.add(new HumanResource());

        var team2 = new Team();
        team2.add(new Truck());
        team2.add(new HumanResource());
        team2.add(new HumanResource());

        var team = new Team();
        team.add(team1);
        team.add(team2);

    }

}
