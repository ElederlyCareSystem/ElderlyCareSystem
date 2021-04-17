/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MoneyAdvisorRole;
import Business.Role.Role;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author snehalchavan
 */
public class MoneyManagementOrganization extends Organization {

    ArrayList<String> dateArray1 = new ArrayList<>();
    HashMap<String, ArrayList<String>> dateArray = new HashMap<>();

    public MoneyManagementOrganization() {
        super(Organization.Type.MoneyManagement.getValue());

        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        GregorianCalendar cal = new GregorianCalendar();
        Date Currentdate = new Date();
        int year = 2021;
        int total = 30;
        cal.set(Calendar.YEAR, year);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(Currentdate);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month1 = calendar.get(Calendar.MONTH);
        int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("number of days......" + days);
        for (int i = day; i <= days; i++) {
            cal.set(Calendar.DAY_OF_MONTH, i);
            Date date = cal.getTime();
            ArrayList<String> timeSlot = new ArrayList<>();
            timeSlot.add("9 AM");
            timeSlot.add("10 AM");
            timeSlot.add("11 AM");
            timeSlot.add("12 PM");
            timeSlot.add("1 PM");
            timeSlot.add("2 PM");
            timeSlot.add("3 PM");
            timeSlot.add("4 PM");
            dateArray.put(formatter.format(date), timeSlot);
            System.out.println(i + " " + formatter.format(date));

        }
    }

    public HashMap<String, ArrayList<String>> getDateArray() {
        return dateArray;
    }

    public ArrayList<String> getTimeSlot(String date) {
        for (int i = 0; i < dateArray.size(); i++) {
            if (dateArray.containsKey(date)) {
                System.out.println("date" + dateArray.get(date));
                return dateArray.get(date);
            }
//            if(dateArray.get(i).equals(date)){
//                System.out.println("date"+dateArray.get(date));
//                return dateArray.get(date);
//                
//            }
        }
        return null;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MoneyAdvisorRole());
        return roles;
    }

}
