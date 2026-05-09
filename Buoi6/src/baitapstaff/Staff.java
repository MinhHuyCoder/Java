package baitapstaff;

import java.util.ArrayList;

public class Staff {

    private ArrayList<StaffMember> staffList;

    public Staff() {

        staffList = new ArrayList<>();

        Executive boss = new Executive(
                "Huy",
                "Ha Noi",
                "0123456789",
                "111-11-1111",
                5000
        );

        boss.awardBonus(1000);

        staffList.add(boss);

        Hourly worker = new Hourly(
                "An",
                "HCM",
                "0999999999",
                "222-22-2222",
                100
        );

        worker.addHours(40);

        staffList.add(worker);

        Volunteer volunteer = new Volunteer(
                "Minh",
                "Lam Dong",
                "0888888888"
        );

        staffList.add(volunteer);
    }

    public void payday() {

        for (StaffMember staff : staffList) {

            System.out.println(staff);

            double amount = staff.pay();

            System.out.println("Luong: " + amount);

            System.out.println("----------------------");
        }
    }
}