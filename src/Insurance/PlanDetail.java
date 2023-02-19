
package Insurance;

/**
 *
 * @author caofei
 */
public class PlanDetail {
   int  planID;
   String  planName;
   int  costperMonth;
   int costperAnnum=12*costperMonth;

    public int getPlanID() {
        return planID;
    }

    public void setPlanID(int planID) {
        this.planID = planID;
    }

   

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getCostperMonth() {
        return costperMonth;
    }

    public void setCostperMonth(int costperMonth) {
        this.costperMonth = costperMonth;
    }

    public int getCostperAnnum() {
        return costperAnnum;
    }

    public void setCostperAnnum(int costperAnnum) {
        this.costperAnnum = costperAnnum;
    }
     @Override
    public String toString() {
        return String.valueOf(this.planName);
    }
   
   
    
}
