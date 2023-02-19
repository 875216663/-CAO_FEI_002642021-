/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class InsurancePlan {
     ArrayList<PlanDetail> planlist;
    
    public InsurancePlan() {
        this.planlist = new ArrayList<PlanDetail>();
    }   

    public ArrayList<PlanDetail> getPlanlist() {
        return planlist;
    }
    public ArrayList<PlanDetail> getInsurancePlan() {
        return planlist;
    }

    public void setPlanlist(ArrayList<PlanDetail> planlist) {
        this.planlist = planlist;
    }
    
    public PlanDetail findObservation(int id) {
        for(PlanDetail o: this.planlist) {
            if (o.getPlanID() == id) {
                return o;
            }
        }
        return null;
    }
    public PlanDetail createPlandetail(int  planID,String  planName,int  costperMonth) {
        PlanDetail plan = new PlanDetail();
        
        plan.setPlanID(planID);
        plan.setPlanName(planName);
        plan.setCostperMonth(costperMonth);
       
        
        this.planlist.add(plan);
        
        return plan;
    }
}
