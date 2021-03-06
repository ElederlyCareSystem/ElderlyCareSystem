/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LegalAdvisorRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author snehalchavan
 */
public class LegalServicesOrganization extends Organization{

    ArrayList<String> dateArray1 = new ArrayList<>();
    HashMap<String, ArrayList<String>> dateArray = new HashMap<>();
    HashMap<String, Double> consultationtype = new HashMap<>();
//    ArrayList<String> consultationtype = new ArrayList<>();
    ArrayList<UserAccount> consultationAdvisor;
    List<RevenueMap> revMap = new ArrayList<>();
    
    LegalServicesOrganization() {
        super(Organization.Type.LegalServices.getValue());
        consultationAdvisor= new ArrayList<>();
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
        consultationtype.put("Estate Planning", 30.0);
        consultationtype.put("Elderly Care Law", 40.0);
        consultationtype.put("Probate & Guardianship", 50.0);
        System.out.println("in legal constructor....."+consultationtype.size());
        
    }

    public ArrayList<UserAccount> getConsultationAdvisor() {
        return consultationAdvisor;
    }

    

    public HashMap<String, Double> getConsultationtype() {
        return consultationtype;
    }
    
    public ArrayList<String> getTimeSlot(String date) {
        for (int i = 0; i < dateArray.size(); i++) {
            if (dateArray.containsKey(date)) {
                System.out.println("date" + dateArray.get(date));
                return dateArray.get(date);
            }

        }
        return null;
    }
    
    public HashMap<String, ArrayList<String>> getDateArray() {
        return dateArray;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new LegalAdvisorRole());
        return roles;
    }
    
    @Override
    public void generateRevMap(){
        revMap = new ArrayList<>();
        AllRevenueMap m = new AllRevenueMap();
        m.generatedMap();
        revMap = m.getMap();
    }
    
    @Override
    public List<RevenueMap> getRevMap() {
        return revMap;
    }
    
    @Override
    public void setRevMap(List<RevenueMap> revMap) {
        this.revMap = revMap;
    }
    
    public void addToMap(int year, String month, Double rev, int x){
        RevenueMap revenue = new RevenueMap(year, month, rev, x);
        revMap.add(revenue);
    }


    
    
}
